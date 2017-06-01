package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SubmissionNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SubmissionNode extends ObjectUiNode<ApplicationNode> {

    @Inject
    public SubmissionNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SubmissionNode.class;
    }

    protected final SubmissionNodeComponent getComponent() {
        return component;
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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("brokerFirstNameNode");
        children.add(getComponent().createBrokerFirstNameNode());
        setChildNodeIdentity("brokerLastNameNode");
        children.add(getComponent().createBrokerLastNameNode());
        setChildNodeIdentity("brokerCompanyNode");
        children.add(getComponent().createBrokerCompanyNode());
        setChildNodeIdentity("contactNumberNode");
        children.add(getComponent().createBrokerTelephoneNode());
        setChildNodeIdentity("faxNumberNode");
        children.add(getComponent().createBrokerTelephoneNode());
        setChildNodeIdentity("mobileNumberNode");
        children.add(getComponent().createBrokerMobileNumberNode());
        setChildNodeIdentity("brokerEmailNode");
        children.add(getComponent().createBrokerEmailNode());
        setChildNodeIdentity("brokerAddressNode");
        children.add(getComponent().createBrokerAddressNode());
        setChildNodeIdentity("lenderIssuedBrokerNumberNode");
        children.add(getComponent().createLenderIssuedBrokerNumberNode());
        setChildNodeIdentity(null);
        return children;
    }

}
