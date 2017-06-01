package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyContactNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyContactNode extends ObjectUiNode<CompanyNode> {

    @Inject
    public CompanyContactNode(@Owner CompanyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyContactNode.class;
    }

    protected final CompanyContactNodeComponent getComponent() {
        return component;
    }


    private CompanyContactNodeComponent component;

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

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("companyContactFirstNameNode");
        children.add(getComponent().createCompanyContactFirstNameNode());
        setChildNodeIdentity("companyContactLastNameNode");
        children.add(getComponent().createCompanyContactLastNameNode());
        setChildNodeIdentity("workPhoneNode");
        children.add(getComponent().createCompanyTelephoneNode());
        setChildNodeIdentity("faxNumberNode");
        children.add(getComponent().createCompanyTelephoneNode());
        setChildNodeIdentity("companyMobileNumberNode");
        children.add(getComponent().createCompanyMobileNumberNode());
        setChildNodeIdentity("companyEmailNode");
        children.add(getComponent().createCompanyEmailNode());
        setChildNodeIdentity("registeredAddressNode");
        children.add(getComponent().createCompanyAddressNode());
        setChildNodeIdentity("postalAddressNode");
        children.add(getComponent().createCompanyAddressNode());
        setChildNodeIdentity("tradingAddressNode");
        children.add(getComponent().createCompanyAddressNode());
        setChildNodeIdentity("principalPlaceAddressNode");
        children.add(getComponent().createCompanyAddressNode());
        setChildNodeIdentity(null);
        return children;
    }

}
