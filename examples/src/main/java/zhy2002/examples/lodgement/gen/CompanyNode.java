package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public class CompanyNode extends ObjectUiNode<CompanyListNode>
{

    private CompanyNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(CompanyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<CompanyNode> config = classRegistry.getUiNodeConfig(CompanyNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public CompanyNode(CompanyListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        return children;
    }

}
