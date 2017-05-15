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
        return (BrokerFirstNameNode)getChildByName("brokerFirstNameNode");
    }

    @JsMethod
    public BrokerLastNameNode getBrokerLastNameNode() {
        return (BrokerLastNameNode)getChildByName("brokerLastNameNode");
    }

    @JsMethod
    public BrokerCompanyNode getBrokerCompanyNode() {
        return (BrokerCompanyNode)getChildByName("brokerCompanyNode");
    }

    @JsMethod
    public BrokerTelephoneNode getContactNumberNode() {
        return (BrokerTelephoneNode)getChildByName("contactNumberNode");
    }

    @JsMethod
    public BrokerTelephoneNode getFaxNumberNode() {
        return (BrokerTelephoneNode)getChildByName("faxNumberNode");
    }

    @JsMethod
    public BrokerMobileNumberNode getMobileNumberNode() {
        return (BrokerMobileNumberNode)getChildByName("mobileNumberNode");
    }

    @JsMethod
    public BrokerEmailNode getBrokerEmailNode() {
        return (BrokerEmailNode)getChildByName("brokerEmailNode");
    }

    @JsMethod
    public BrokerAddressNode getBrokerAddressNode() {
        return (BrokerAddressNode)getChildByName("brokerAddressNode");
    }

    @JsMethod
    public LenderIssuedBrokerNumberNode getLenderIssuedBrokerNumberNode() {
        return (LenderIssuedBrokerNumberNode)getChildByName("lenderIssuedBrokerNumberNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createBrokerFirstNameNode());
        children.add(childFactory.createBrokerLastNameNode());
        children.add(childFactory.createBrokerCompanyNode());
        children.add(childFactory.createContactNumberNode());
        children.add(childFactory.createFaxNumberNode());
        children.add(childFactory.createMobileNumberNode());
        children.add(childFactory.createBrokerEmailNode());
        children.add(childFactory.createBrokerAddressNode());
        children.add(childFactory.createLenderIssuedBrokerNumberNode());
        return children;
    }

}
