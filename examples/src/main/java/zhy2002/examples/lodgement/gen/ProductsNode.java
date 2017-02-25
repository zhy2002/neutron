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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ProductsNode extends ObjectUiNode<ApplicationNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProductsNode.class;
    }

    private ProductsNodeComponent component;

    @Inject
    void createComponent(ProductsNodeComponent.Builder builder) {
        this.component = builder.setProductsNodeModule(new ProductsNodeModule(this)).build();
    }

    @Override
    protected ProductsNodeRuleProvider getRuleProvider() {
        return component.getProductsNodeRuleProvider();
    }

    public ProductsNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

}
