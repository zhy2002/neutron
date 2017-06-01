package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
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

    private PersonNodeChildFactory childFactory;
    private PersonNodeComponent component;

    @Inject
    public PersonNode(@Owner PersonListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PersonNode.class;
    }

    @Inject
    void receiveNodeProvider(PersonNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(PersonNodeComponent.Builder builder) {
        this.component = builder.setPersonNodeModule(new PersonNodeModule(this)).build();
    }

    private RuleProvider<PersonNode> getRuleProvider() {
        return component.getPersonNodeRuleProvider();
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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("personGeneralNode");
        children.add(childFactory.createPersonGeneralNode());
        setChildNodeIdentity("personContactNode");
        children.add(childFactory.createPersonContactNode());
        setChildNodeIdentity("currentEmploymentListNode");
        children.add(childFactory.createCurrentEmploymentListNode());
        setChildNodeIdentity("previousEmploymentListNode");
        children.add(childFactory.createPreviousEmploymentListNode());
        setChildNodeIdentity("personTrustNode");
        children.add(childFactory.createPersonTrustNode());
        setChildNodeIdentity("personPrivacyNode");
        children.add(childFactory.createPersonPrivacyNode());
        setChildNodeIdentity("personOtherIncomeListNode");
        children.add(childFactory.createPersonOtherIncomeListNode());
        setChildNodeIdentity("personResponsibleLendNode");
        children.add(childFactory.createPersonResponsibleLendNode());
        setChildNodeIdentity(null);
        return children;
    }

}
