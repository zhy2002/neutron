package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductFeeNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductFeeNode extends ObjectUiNode<ProductFeeListNode> {

    @Inject
    protected ProductFeeNode(@Owner ProductFeeListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductFeeNode.class;
    }

    protected final ProductFeeNodeComponent getComponent() {
        return component;
    }


    private ProductFeeNodeComponent component;

    @Inject
    void createComponent(ProductFeeNodeComponent.Builder builder) {
        this.component = builder.setProductFeeNodeModule(new ProductFeeNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("feeTypeNode");
        children.add(getComponent().createFeeTypeNode());
        setChildNodeIdentity("feeDescriptionNode");
        children.add(getComponent().createFeeDescriptionNode());
        setChildNodeIdentity("feePayFromNode");
        children.add(getComponent().createFeePayFromNode());
        setChildNodeIdentity("feeAmountNode");
        children.add(getComponent().createFeeAmountNode());
        setChildNodeIdentity(null);
        return children;
    }

}
