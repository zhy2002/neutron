package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductFeeNode extends ObjectUiNode<ProductFeeListNode> {
    private ProductFeeNodeChildFactory childFactory;
    private ProductFeeNodeComponent component;

    public ProductFeeNode(@NotNull ProductFeeListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFeeNode.class;
    }

    @Inject
    void receiveNodeProvider(ProductFeeNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(ProductFeeNodeComponent.Builder builder) {
        this.component = builder.setProductFeeNodeModule(new ProductFeeNodeModule(this)).build();
    }

    private RuleProvider<ProductFeeNode> getRuleProvider() {
        return component.getProductFeeNodeRuleProvider();
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
    public FeeTypeNode getFeeTypeNode() {
        return (FeeTypeNode)getChildByName("feeTypeNode");
    }

    @JsMethod
    public FeeDescriptionNode getFeeDescriptionNode() {
        return (FeeDescriptionNode)getChildByName("feeDescriptionNode");
    }

    @JsMethod
    public FeePayFromNode getFeePayFromNode() {
        return (FeePayFromNode)getChildByName("feePayFromNode");
    }

    @JsMethod
    public FeeAmountNode getFeeAmountNode() {
        return (FeeAmountNode)getChildByName("feeAmountNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("feeTypeNode");
        children.add(childFactory.createFeeTypeNode());
        setChildNodeIdentity("feeDescriptionNode");
        children.add(childFactory.createFeeDescriptionNode());
        setChildNodeIdentity("feePayFromNode");
        children.add(childFactory.createFeePayFromNode());
        setChildNodeIdentity("feeAmountNode");
        children.add(childFactory.createFeeAmountNode());
        setChildNodeIdentity(null);
        return children;
    }

}
