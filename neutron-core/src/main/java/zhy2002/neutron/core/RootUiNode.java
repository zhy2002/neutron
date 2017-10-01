package zhy2002.neutron.core;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.PropertyMetadata;
import zhy2002.neutron.core.event.BooleanStateChangeEvent;
import zhy2002.neutron.core.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.core.exception.UiNodeException;

import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * A special node type that server as the root node type.
 */
public abstract class RootUiNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    protected RootUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    @JsMethod
    public UiNode<?> getContentNode() {
        int level = getContentLevel();
        UiNode<?> node = this;
        while (level-- > 0) {
            if (node instanceof ObjectUiNode) {
                ObjectUiNode<?> objectUiNode = (ObjectUiNode<?>) node;
                node = objectUiNode.getChild(objectUiNode.getSelectedName());
            } else if (node instanceof ListUiNode) {
                ListUiNode<?, ?> listUiNode = (ListUiNode<?, ?>) node;
                node = listUiNode.getItem(listUiNode.getSelectedIndex());
            } else {
                break;
            }
        }
        return node == this ? null : node;
    }

    @JsMethod
    public void setContentNode(UiNode<?> descendant) {

        if (descendant == null)
            return;

        CycleModeEnum mode = null;
        if (!getContext().isInCycle()) {
            mode = getContext().getCycleMode();
        }
        if (mode == CycleModeEnum.Auto) {
            getContext().setCycleMode(CycleModeEnum.Batched);
        }

        try {
            if (mode != null) {
                getContext().beginSession();
            }
            int level = selectDescendant(descendant);
            if (level > 0) {
                setContentLevel(level);
            }
            if (mode != null) {
                getContext().commitSession();
            }
        } finally {
            if (mode != null) {
                getContext().setCycleMode(mode);
            }
        }
    }

    private int selectDescendant(UiNode<?> descendant) {
        int level = 0;
        while (descendant != this) {
            level++;
            UiNode<?> parent = descendant.getParent();
            if (parent instanceof ListUiNode<?, ?>) {
                ((ListUiNode) parent).setSelectedIndex(descendant.getIndex());
            } else if (parent instanceof ObjectUiNode<?>) {
                ((ObjectUiNode) parent).setSelectedName(descendant.getName());
            } else {
                throw new UiNodeException("Unsupported node type in path:" + parent.getClass().getName());
            }
            descendant = parent;
        }
        return level;
    }

    //region node properties

    public static final PropertyMetadata<Boolean> LOADING_PROPERTY = MetadataRegistry.createProperty(RootUiNode.class, "loading", Boolean.class, Boolean.FALSE);
    public static final PropertyMetadata<Integer> CONTENT_LEVEL_PROPERTY = MetadataRegistry.createProperty(RootUiNode.class, "contentLevel", Integer.class, 1, ChangeTrackingModeEnum.Always);

    public boolean isLoading() {
        return getStateValue(LOADING_PROPERTY);
    }

    @JsMethod
    public void setLoading(boolean value) {
        setStateValue(LOADING_PROPERTY, value);
    }

    @JsMethod
    public int getContentLevel() {
        return getStateValue(CONTENT_LEVEL_PROPERTY);
    }

    /**
     * Identifies a node on the focus path. This node is to be the content of the main view in the UI.
     * Main view can be routed via URL.
     *
     * @param value a positive number.
     */
    @JsMethod
    public void setContentLevel(int value) {
        value = Integer.max(value, 1);
        setStateValue(CONTENT_LEVEL_PROPERTY, value);
    }

    //endregion

    /**
     * Clears validation errors of event origin node and all its descendant nodes when it becomes disabled.
     */
    static class ClearErrorsForDisabledNodeRule extends UiNodeRule<UiNode<?>> {

        ClearErrorsForDisabledNodeRule(UiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Collections.singletonList(
                    new BooleanStateChangeEventBinding(
                            event -> Boolean.TRUE.equals(event.getNewValue()) && !getContext().getRootNode().isLoading(),
                            this::clearValidationErrors,
                            DISABLED_PROPERTY.getStateKey()
                    )
            );
        }

        private void clearValidationErrors(BooleanStateChangeEvent event) {
            Deque<UiNode<?>> queue = new ArrayDeque<>();
            queue.add(event.getOrigin());
            while (!queue.isEmpty()) {
                UiNode<?> node = queue.poll();
                node.clearValidationErrors();
                if (node instanceof ParentUiNode) {
                    ParentUiNode<?> parent = (ParentUiNode<?>) node;
                    queue.addAll(Arrays.asList(parent.getChildren()));
                }
            }
        }
    }

}
