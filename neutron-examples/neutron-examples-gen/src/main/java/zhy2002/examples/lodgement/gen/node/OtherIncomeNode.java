package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherIncomeNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherIncomeNode extends ObjectUiNode<BaseOtherIncomeListNode<?>> {

    @Inject
    public OtherIncomeNode(@Owner BaseOtherIncomeListNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherIncomeNode.class;
    }

    protected final OtherIncomeNodeComponent getComponent() {
        return component;
    }


    private OtherIncomeNodeComponent component;

    @Inject
    void createComponent(OtherIncomeNodeComponent.Builder builder) {
        this.component = builder.setOtherIncomeNodeModule(new OtherIncomeNodeModule(this)).build();
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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("otherIncomeAddBackTypeNode");
        children.add(getComponent().createOtherIncomeAddBackTypeNode());
        setChildNodeIdentity("otherIncomeAmountNode");
        children.add(getComponent().createOtherIncomeAmountNode());
        setChildNodeIdentity("otherIncomeDescriptionNode");
        children.add(getComponent().createOtherIncomeDescriptionNode());
        setChildNodeIdentity("otherIncomePreviousYearNode");
        children.add(getComponent().createOtherIncomePreviousYearNode());
        setChildNodeIdentity("otherIncomeTypeNode");
        children.add(getComponent().createOtherIncomeTypeNode());
        setChildNodeIdentity(null);
        return children;
    }

}
