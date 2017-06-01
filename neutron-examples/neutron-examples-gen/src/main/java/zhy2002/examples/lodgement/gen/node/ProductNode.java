package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductNode extends ObjectUiNode<ProductListNode> {

    @Inject
    public ProductNode(@Owner ProductListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductNode.class;
    }

    protected final ProductNodeComponent getComponent() {
        return component;
    }


    private ProductNodeComponent component;

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

    //region children getters

    @JsMethod
    public ProductDescriptionNode getProductDescriptionNode() {
        return (ProductDescriptionNode)getChildByName("productDescriptionNode");
    }

    @JsMethod
    public ProductFeaturesNode getProductFeaturesNode() {
        return (ProductFeaturesNode)getChildByName("productFeaturesNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productDescriptionNode");
        children.add(getComponent().createProductDescriptionNode());
        setChildNodeIdentity("productFeaturesNode");
        children.add(getComponent().createProductFeaturesNode());
        setChildNodeIdentity(null);
        return children;
    }

}
