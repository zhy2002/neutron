package zhy2002.neutron;

import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.neutron.node.BigDecimalUiNode;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.validation.constraints.NotNull;

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

}
