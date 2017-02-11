package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;

public class PersonNode extends ObjectUiNode<PersonListNode>
{
    private PersonGeneralNode personGeneralNode;
    private PersonContactNode personContactNode;
    private CurrentEmploymentListNode currentEmploymentListNode;
    private PreviousEmploymentListNode previousEmploymentListNode;
    private PersonTrustNode personTrustNode;
    private PersonPrivacyNode personPrivacyNode;
    private PersonOtherIncomeListNode personOtherIncomeListNode;
    private PersonResponsibleLendNode personResponsibleLendNode;

    private PersonNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PersonNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PersonNode> config = classRegistry.getUiNodeConfig(PersonNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PersonNode(PersonListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setSelectedName("personGeneralNode");
    }

    @JsMethod
    public PersonGeneralNode getPersonGeneralNode() {
        return personGeneralNode;
    }

    @JsMethod
    public PersonContactNode getPersonContactNode() {
        return personContactNode;
    }

    @JsMethod
    public CurrentEmploymentListNode getCurrentEmploymentListNode() {
        return currentEmploymentListNode;
    }

    @JsMethod
    public PreviousEmploymentListNode getPreviousEmploymentListNode() {
        return previousEmploymentListNode;
    }

    @JsMethod
    public PersonTrustNode getPersonTrustNode() {
        return personTrustNode;
    }

    @JsMethod
    public PersonPrivacyNode getPersonPrivacyNode() {
        return personPrivacyNode;
    }

    @JsMethod
    public PersonOtherIncomeListNode getPersonOtherIncomeListNode() {
        return personOtherIncomeListNode;
    }

    @JsMethod
    public PersonResponsibleLendNode getPersonResponsibleLendNode() {
        return personResponsibleLendNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        personGeneralNode = childFactory.createPersonGeneralNode();
        children.add(personGeneralNode);
        personContactNode = childFactory.createPersonContactNode();
        children.add(personContactNode);
        currentEmploymentListNode = childFactory.createCurrentEmploymentListNode();
        children.add(currentEmploymentListNode);
        previousEmploymentListNode = childFactory.createPreviousEmploymentListNode();
        children.add(previousEmploymentListNode);
        personTrustNode = childFactory.createPersonTrustNode();
        children.add(personTrustNode);
        personPrivacyNode = childFactory.createPersonPrivacyNode();
        children.add(personPrivacyNode);
        personOtherIncomeListNode = childFactory.createPersonOtherIncomeListNode();
        children.add(personOtherIncomeListNode);
        personResponsibleLendNode = childFactory.createPersonResponsibleLendNode();
        children.add(personResponsibleLendNode);
        return children;
    }

    @Inject
    PersonNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

}
