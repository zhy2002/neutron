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

public class ProductsNode extends ObjectUiNode<ApplicationNode>
{

    private ProductsNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductsNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<ProductsNode> config = classRegistry.getUiNodeConfig(ProductsNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public ProductsNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        return children;
    }

}
