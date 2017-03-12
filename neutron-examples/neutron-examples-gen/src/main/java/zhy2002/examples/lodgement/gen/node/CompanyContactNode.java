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

    private CompanyContactFirstNameNode companyContactFirstNameNode;
    private CompanyContactLastNameNode companyContactLastNameNode;
    private CompanyTelephoneNode workPhoneNode;
    private CompanyTelephoneNode faxNumberNode;
    private CompanyMobileNumberNode companyMobileNumberNode;
    private CompanyEmailNode companyEmailNode;
    private CompanyAddressNode registeredAddressNode;
    private CompanyAddressNode postalAddressNode;
    private CompanyAddressNode tradingAddressNode;
    private CompanyAddressNode principalPlaceAddressNode;

    private CompanyContactNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(CompanyContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactNode.class;
    }

    private CompanyContactNodeComponent component;

    @Inject
    void createComponent(CompanyContactNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactNodeModule(new CompanyContactNodeModule(this)).build();
    }

    private CompanyContactNodeRuleProvider getRuleProvider() {
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

    public CompanyContactNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CompanyContactFirstNameNode getCompanyContactFirstNameNode() {
        return companyContactFirstNameNode;
    }

    @JsMethod
    public CompanyContactLastNameNode getCompanyContactLastNameNode() {
        return companyContactLastNameNode;
    }

    @JsMethod
    public CompanyTelephoneNode getWorkPhoneNode() {
        return workPhoneNode;
    }

    @JsMethod
    public CompanyTelephoneNode getFaxNumberNode() {
        return faxNumberNode;
    }

    @JsMethod
    public CompanyMobileNumberNode getCompanyMobileNumberNode() {
        return companyMobileNumberNode;
    }

    @JsMethod
    public CompanyEmailNode getCompanyEmailNode() {
        return companyEmailNode;
    }

    @JsMethod
    public CompanyAddressNode getRegisteredAddressNode() {
        return registeredAddressNode;
    }

    @JsMethod
    public CompanyAddressNode getPostalAddressNode() {
        return postalAddressNode;
    }

    @JsMethod
    public CompanyAddressNode getTradingAddressNode() {
        return tradingAddressNode;
    }

    @JsMethod
    public CompanyAddressNode getPrincipalPlaceAddressNode() {
        return principalPlaceAddressNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        companyContactFirstNameNode = childFactory.createCompanyContactFirstNameNode();
        children.add(companyContactFirstNameNode);
        companyContactLastNameNode = childFactory.createCompanyContactLastNameNode();
        children.add(companyContactLastNameNode);
        workPhoneNode = childFactory.createWorkPhoneNode();
        children.add(workPhoneNode);
        faxNumberNode = childFactory.createFaxNumberNode();
        children.add(faxNumberNode);
        companyMobileNumberNode = childFactory.createCompanyMobileNumberNode();
        children.add(companyMobileNumberNode);
        companyEmailNode = childFactory.createCompanyEmailNode();
        children.add(companyEmailNode);
        registeredAddressNode = childFactory.createRegisteredAddressNode();
        children.add(registeredAddressNode);
        postalAddressNode = childFactory.createPostalAddressNode();
        children.add(postalAddressNode);
        tradingAddressNode = childFactory.createTradingAddressNode();
        children.add(tradingAddressNode);
        principalPlaceAddressNode = childFactory.createPrincipalPlaceAddressNode();
        children.add(principalPlaceAddressNode);
        return children;
    }

}
