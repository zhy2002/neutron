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

public class CompanyContactNode extends ObjectUiNode<CompanyNode> {
    private CompanyContactNodeChildFactory childFactory;
    private CompanyContactNodeComponent component;

    public CompanyContactNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactNode.class;
    }

    @Inject
    void receiveNodeProvider(CompanyContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(CompanyContactNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactNodeModule(new CompanyContactNodeModule(this)).build();
    }

    private RuleProvider<CompanyContactNode> getRuleProvider() {
        return component.getCompanyContactNodeRuleProvider();
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

    private RuleProvider<CompanyContactNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public CompanyContactFirstNameNode getCompanyContactFirstNameNode() {
        return (CompanyContactFirstNameNode)getChildByName("companyContactFirstNameNode");
    }

    @JsMethod
    public CompanyContactLastNameNode getCompanyContactLastNameNode() {
        return (CompanyContactLastNameNode)getChildByName("companyContactLastNameNode");
    }

    @JsMethod
    public CompanyTelephoneNode getWorkPhoneNode() {
        return (CompanyTelephoneNode)getChildByName("workPhoneNode");
    }

    @JsMethod
    public CompanyTelephoneNode getFaxNumberNode() {
        return (CompanyTelephoneNode)getChildByName("faxNumberNode");
    }

    @JsMethod
    public CompanyMobileNumberNode getCompanyMobileNumberNode() {
        return (CompanyMobileNumberNode)getChildByName("companyMobileNumberNode");
    }

    @JsMethod
    public CompanyEmailNode getCompanyEmailNode() {
        return (CompanyEmailNode)getChildByName("companyEmailNode");
    }

    @JsMethod
    public CompanyAddressNode getRegisteredAddressNode() {
        return (CompanyAddressNode)getChildByName("registeredAddressNode");
    }

    @JsMethod
    public CompanyAddressNode getPostalAddressNode() {
        return (CompanyAddressNode)getChildByName("postalAddressNode");
    }

    @JsMethod
    public CompanyAddressNode getTradingAddressNode() {
        return (CompanyAddressNode)getChildByName("tradingAddressNode");
    }

    @JsMethod
    public CompanyAddressNode getPrincipalPlaceAddressNode() {
        return (CompanyAddressNode)getChildByName("principalPlaceAddressNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("companyContactFirstNameNode");
        children.add(childFactory.createCompanyContactFirstNameNode());
        setChildNodeIdentity("companyContactLastNameNode");
        children.add(childFactory.createCompanyContactLastNameNode());
        setChildNodeIdentity("workPhoneNode");
        children.add(childFactory.createWorkPhoneNode());
        setChildNodeIdentity("faxNumberNode");
        children.add(childFactory.createFaxNumberNode());
        setChildNodeIdentity("companyMobileNumberNode");
        children.add(childFactory.createCompanyMobileNumberNode());
        setChildNodeIdentity("companyEmailNode");
        children.add(childFactory.createCompanyEmailNode());
        setChildNodeIdentity("registeredAddressNode");
        children.add(childFactory.createRegisteredAddressNode());
        setChildNodeIdentity("postalAddressNode");
        children.add(childFactory.createPostalAddressNode());
        setChildNodeIdentity("tradingAddressNode");
        children.add(childFactory.createTradingAddressNode());
        setChildNodeIdentity("principalPlaceAddressNode");
        children.add(childFactory.createPrincipalPlaceAddressNode());
        setChildNodeIdentity(null);
        return children;
    }

}
