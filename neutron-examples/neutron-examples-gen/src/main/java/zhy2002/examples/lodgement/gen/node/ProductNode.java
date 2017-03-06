package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductNode extends ObjectUiNode<ProductListNode> {

    private ProductDescriptionNode productDescriptionNode;
    private ProductFeaturesNode productFeaturesNode;

    private ProductNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductNode.class;
    }

    private ProductNodeComponent component;

    @Inject
    void createComponent(ProductNodeComponent.Builder builder) {
        this.component = builder.setProductNodeModule(new ProductNodeModule(this)).build();
    }

    private ProductNodeRuleProvider getRuleProvider() {
        return component.getProductNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductNode(@NotNull ProductListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ProductDescriptionNode getProductDescriptionNode() {
        return productDescriptionNode;
    }

    @JsMethod
    public ProductFeaturesNode getProductFeaturesNode() {
        return productFeaturesNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        productDescriptionNode = childFactory.createProductDescriptionNode();
        children.add(productDescriptionNode);
        productFeaturesNode = childFactory.createProductFeaturesNode();
        children.add(productFeaturesNode);
        return children;
    }

}
