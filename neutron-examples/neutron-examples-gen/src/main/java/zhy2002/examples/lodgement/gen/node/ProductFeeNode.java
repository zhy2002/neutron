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

    private FeeTypeNode feeTypeNode;
    private FeeDescriptionNode feeDescriptionNode;
    private FeePayFromNode feePayFromNode;
    private FeeAmountNode feeAmountNode;

    private ProductFeeNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductFeeNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFeeNode.class;
    }

    private ProductFeeNodeComponent component;

    @Inject
    void createComponent(ProductFeeNodeComponent.Builder builder) {
        this.component = builder.setProductFeeNodeModule(new ProductFeeNodeModule(this)).build();
    }

    private ProductFeeNodeRuleProvider getRuleProvider() {
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


    public ProductFeeNode(@NotNull ProductFeeListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public FeeTypeNode getFeeTypeNode() {
        return feeTypeNode;
    }

    @JsMethod
    public FeeDescriptionNode getFeeDescriptionNode() {
        return feeDescriptionNode;
    }

    @JsMethod
    public FeePayFromNode getFeePayFromNode() {
        return feePayFromNode;
    }

    @JsMethod
    public FeeAmountNode getFeeAmountNode() {
        return feeAmountNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        feeTypeNode = childFactory.createFeeTypeNode();
        children.add(feeTypeNode);
        feeDescriptionNode = childFactory.createFeeDescriptionNode();
        children.add(feeDescriptionNode);
        feePayFromNode = childFactory.createFeePayFromNode();
        children.add(feePayFromNode);
        feeAmountNode = childFactory.createFeeAmountNode();
        children.add(feeAmountNode);
        return children;
    }

}
