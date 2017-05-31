package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductNode extends ObjectUiNode<ProductListNode> {
    private ProductNodeChildFactory childFactory;
    private ProductNodeComponent component;

    public ProductNode(@NotNull ProductListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductNode.class;
    }

    @Inject
    void receiveNodeProvider(ProductNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(ProductNodeComponent.Builder builder) {
        this.component = builder.setProductNodeModule(new ProductNodeModule(this)).build();
    }

    private RuleProvider<ProductNode> getRuleProvider() {
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

    @JsMethod
    public ProductDescriptionNode getProductDescriptionNode() {
        return (ProductDescriptionNode)getChildByName("productDescriptionNode");
    }

    @JsMethod
    public ProductFeaturesNode getProductFeaturesNode() {
        return (ProductFeaturesNode)getChildByName("productFeaturesNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productDescriptionNode");
        children.add(childFactory.createProductDescriptionNode());
        setChildNodeIdentity("productFeaturesNode");
        children.add(childFactory.createProductFeaturesNode());
        setChildNodeIdentity(null);
        return children;
    }

}
