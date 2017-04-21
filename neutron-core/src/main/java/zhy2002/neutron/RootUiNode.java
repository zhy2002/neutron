package zhy2002.neutron;

import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;

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

    //region node properties

    public static final PropertyMetadata<Boolean> LOADING_PROPERTY = MetadataRegistry.createProperty(RootUiNode.class, "loading", Boolean.class, Boolean.FALSE);

    public boolean isLoading() {
        return getStateValue(LOADING_PROPERTY);
    }

    public void setLoading(boolean value) {
        setStateValue(LOADING_PROPERTY, value);
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
                            Collections.singletonList(DISABLED_PROPERTY.getStateKey())
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
