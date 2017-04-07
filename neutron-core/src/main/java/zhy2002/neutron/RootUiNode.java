package zhy2002.neutron;

import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;

/**
 * A special node type that server as the root node type.
 */
public abstract class RootUiNode<P extends ParentUiNode<?>> extends ObjectUiNode<P> {

    protected RootUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    public boolean isLoading() {
        return getStateValue(NeutronEventSubjects.LOADING, Boolean.FALSE);
    }

    public void setLoading(boolean value) {
        setStateValue(NeutronEventSubjects.LOADING, Boolean.class, value);
    }
}
