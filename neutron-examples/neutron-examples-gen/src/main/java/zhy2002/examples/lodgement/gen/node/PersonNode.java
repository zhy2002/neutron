package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PersonNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PersonNode extends ObjectUiNode<PersonListNode> {

    @Inject
    protected PersonNode(@Owner PersonListNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonNode.class;
    }

    protected final PersonNodeComponent getComponent() {
        return component;
    }


    private PersonNodeComponent component;

    @Inject
    void createComponent(PersonNodeComponent.Builder builder) {
        this.component = builder.setPersonNodeModule(new PersonNodeModule(this)).build();
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
    public PersonGeneralNode getPersonGeneralNode() {
        return (PersonGeneralNode)getChildByName("personGeneralNode");
    }

    @JsMethod
    public PersonContactNode getPersonContactNode() {
        return (PersonContactNode)getChildByName("personContactNode");
    }

    @JsMethod
    public CurrentEmploymentListNode getCurrentEmploymentListNode() {
        return (CurrentEmploymentListNode)getChildByName("currentEmploymentListNode");
    }

    @JsMethod
    public PreviousEmploymentListNode getPreviousEmploymentListNode() {
        return (PreviousEmploymentListNode)getChildByName("previousEmploymentListNode");
    }

    @JsMethod
    public PersonTrustNode getPersonTrustNode() {
        return (PersonTrustNode)getChildByName("personTrustNode");
    }

    @JsMethod
    public PersonPrivacyNode getPersonPrivacyNode() {
        return (PersonPrivacyNode)getChildByName("personPrivacyNode");
    }

    @JsMethod
    public PersonOtherIncomeListNode getPersonOtherIncomeListNode() {
        return (PersonOtherIncomeListNode)getChildByName("personOtherIncomeListNode");
    }

    @JsMethod
    public PersonResponsibleLendNode getPersonResponsibleLendNode() {
        return (PersonResponsibleLendNode)getChildByName("personResponsibleLendNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("personGeneralNode");
        children.add(getComponent().createPersonGeneralNode());
        setChildNodeIdentity("personContactNode");
        children.add(getComponent().createPersonContactNode());
        setChildNodeIdentity("currentEmploymentListNode");
        children.add(getComponent().createCurrentEmploymentListNode());
        setChildNodeIdentity("previousEmploymentListNode");
        children.add(getComponent().createPreviousEmploymentListNode());
        setChildNodeIdentity("personTrustNode");
        children.add(getComponent().createPersonTrustNode());
        setChildNodeIdentity("personPrivacyNode");
        children.add(getComponent().createPersonPrivacyNode());
        setChildNodeIdentity("personOtherIncomeListNode");
        children.add(getComponent().createPersonOtherIncomeListNode());
        setChildNodeIdentity("personResponsibleLendNode");
        children.add(getComponent().createPersonResponsibleLendNode());
        setChildNodeIdentity(null);
        return children;
    }

}
