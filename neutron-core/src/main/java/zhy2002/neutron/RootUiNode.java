package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.exception.UiNodeException;

import javax.inject.Inject;
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
    public void setContentNode(UiNode<?> descendant) {

        if (descendant == null)
            return;

        CycleModeEnum mode = getContext().getCycleMode();
        if (mode == CycleModeEnum.Auto) {
            getContext().setCycleMode(CycleModeEnum.Batched);
        } else {
            mode = null;
        }
        try {
            getContext().beginSession();
            int level = selectDescendant(descendant);
            if (level > 0) {
                setContentLevel(level);
            }
            getContext().commitSession();
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

        @Inject
        public ClearErrorsForDisabledNodeRule(@Owner UiNode<?> owner) {
            super(owner);
        }

        @Override
        protected Collection<EventBinding> createEventBindings() {
            return Collections.singletonList(
                    new BooleanStateChangeEventBinding(
                            event -> Boolean.TRUE.equals(event.getNewValue()),
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
