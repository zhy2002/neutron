package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.app.data.*;

public class AppManagerNode extends ObjectUiNode<LodgementNode>
{

    private AppManagerNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(AppManagerNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<AppManagerNode> config = classRegistry.getUiNodeConfig(AppManagerNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public AppManagerNode(LodgementNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        return children;
    }

}
