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
        return (OtherIncomeAddBackTypeNode)getChildByName("otherIncomeAddBackTypeNode");
    }

    @JsMethod
    public OtherIncomeAmountNode getOtherIncomeAmountNode() {
        return (OtherIncomeAmountNode)getChildByName("otherIncomeAmountNode");
    }

    @JsMethod
    public OtherIncomeDescriptionNode getOtherIncomeDescriptionNode() {
        return (OtherIncomeDescriptionNode)getChildByName("otherIncomeDescriptionNode");
    }

    @JsMethod
    public OtherIncomePreviousYearNode getOtherIncomePreviousYearNode() {
        return (OtherIncomePreviousYearNode)getChildByName("otherIncomePreviousYearNode");
    }

    @JsMethod
    public OtherIncomeTypeNode getOtherIncomeTypeNode() {
        return (OtherIncomeTypeNode)getChildByName("otherIncomeTypeNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createOtherIncomeAddBackTypeNode());
        children.add(childFactory.createOtherIncomeAmountNode());
        children.add(childFactory.createOtherIncomeDescriptionNode());
        children.add(childFactory.createOtherIncomePreviousYearNode());
        children.add(childFactory.createOtherIncomeTypeNode());
        return children;
    }

}
