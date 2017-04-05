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


public class OtherIncomeNode extends ObjectUiNode<BaseOtherIncomeListNode<?>> {

    private OtherIncomeAddBackTypeNode otherIncomeAddBackTypeNode;
    private OtherIncomeAmountNode otherIncomeAmountNode;
    private OtherIncomeDescriptionNode otherIncomeDescriptionNode;
    private OtherIncomePreviousYearNode otherIncomePreviousYearNode;
    private OtherIncomeTypeNode otherIncomeTypeNode;

    private OtherIncomeNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(OtherIncomeNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OtherIncomeNode.class;
    }

    private OtherIncomeNodeComponent component;

    @Inject
    void createComponent(OtherIncomeNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeNodeModule(new OtherIncomeNodeModule(this)).build();
    }

    private RuleProvider<OtherIncomeNode> getRuleProvider() {
        return component.getOtherIncomeNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public OtherIncomeNode(@NotNull BaseOtherIncomeListNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public OtherIncomeAddBackTypeNode getOtherIncomeAddBackTypeNode() {
        return otherIncomeAddBackTypeNode;
    }

    @JsMethod
    public OtherIncomeAmountNode getOtherIncomeAmountNode() {
        return otherIncomeAmountNode;
    }

    @JsMethod
    public OtherIncomeDescriptionNode getOtherIncomeDescriptionNode() {
        return otherIncomeDescriptionNode;
    }

    @JsMethod
    public OtherIncomePreviousYearNode getOtherIncomePreviousYearNode() {
        return otherIncomePreviousYearNode;
    }

    @JsMethod
    public OtherIncomeTypeNode getOtherIncomeTypeNode() {
        return otherIncomeTypeNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        otherIncomeAddBackTypeNode = childFactory.createOtherIncomeAddBackTypeNode();
        children.add(otherIncomeAddBackTypeNode);
        otherIncomeAmountNode = childFactory.createOtherIncomeAmountNode();
        children.add(otherIncomeAmountNode);
        otherIncomeDescriptionNode = childFactory.createOtherIncomeDescriptionNode();
        children.add(otherIncomeDescriptionNode);
        otherIncomePreviousYearNode = childFactory.createOtherIncomePreviousYearNode();
        children.add(otherIncomePreviousYearNode);
        otherIncomeTypeNode = childFactory.createOtherIncomeTypeNode();
        children.add(otherIncomeTypeNode);
        return children;
    }

}
