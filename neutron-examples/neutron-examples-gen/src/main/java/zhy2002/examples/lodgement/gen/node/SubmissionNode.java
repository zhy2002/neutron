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

public class SubmissionNode extends ObjectUiNode<ApplicationNode> {

    private BrokerFirstNameNode brokerFirstNameNode;
    private BrokerLastNameNode brokerLastNameNode;
    private BrokerCompanyNode brokerCompanyNode;
    private BrokerTelephoneNode contactNumberNode;
    private BrokerTelephoneNode faxNumberNode;
    private BrokerMobileNumberNode mobileNumberNode;
    private BrokerEmailNode brokerEmailNode;
    private BrokerAddressNode brokerAddressNode;
    private LenderIssuedBrokerNumberNode lenderIssuedBrokerNumberNode;

    private SubmissionNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SubmissionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SubmissionNode.class;
    }

    private SubmissionNodeComponent component;

    @Inject
    void createComponent(SubmissionNodeComponent.Builder builder) {
        this.component = builder.setSubmissionNodeModule(new SubmissionNodeModule(this)).build();
    }

    private RuleProvider<SubmissionNode> getRuleProvider() {
        return component.getSubmissionNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<SubmissionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public SubmissionNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public BrokerFirstNameNode getBrokerFirstNameNode() {
        return brokerFirstNameNode;
    }

    @JsMethod
    public BrokerLastNameNode getBrokerLastNameNode() {
        return brokerLastNameNode;
    }

    @JsMethod
    public BrokerCompanyNode getBrokerCompanyNode() {
        return brokerCompanyNode;
    }

    @JsMethod
    public BrokerTelephoneNode getContactNumberNode() {
        return contactNumberNode;
    }

    @JsMethod
    public BrokerTelephoneNode getFaxNumberNode() {
        return faxNumberNode;
    }

    @JsMethod
    public BrokerMobileNumberNode getMobileNumberNode() {
        return mobileNumberNode;
    }

    @JsMethod
    public BrokerEmailNode getBrokerEmailNode() {
        return brokerEmailNode;
    }

    @JsMethod
    public BrokerAddressNode getBrokerAddressNode() {
        return brokerAddressNode;
    }

    @JsMethod
    public LenderIssuedBrokerNumberNode getLenderIssuedBrokerNumberNode() {
        return lenderIssuedBrokerNumberNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        brokerFirstNameNode = childFactory.createBrokerFirstNameNode();
        children.add(brokerFirstNameNode);
        brokerLastNameNode = childFactory.createBrokerLastNameNode();
        children.add(brokerLastNameNode);
        brokerCompanyNode = childFactory.createBrokerCompanyNode();
        children.add(brokerCompanyNode);
        contactNumberNode = childFactory.createContactNumberNode();
        children.add(contactNumberNode);
        faxNumberNode = childFactory.createFaxNumberNode();
        children.add(faxNumberNode);
        mobileNumberNode = childFactory.createMobileNumberNode();
        children.add(mobileNumberNode);
        brokerEmailNode = childFactory.createBrokerEmailNode();
        children.add(brokerEmailNode);
        brokerAddressNode = childFactory.createBrokerAddressNode();
        children.add(brokerAddressNode);
        lenderIssuedBrokerNumberNode = childFactory.createLenderIssuedBrokerNumberNode();
        children.add(lenderIssuedBrokerNumberNode);
        return children;
    }

}
