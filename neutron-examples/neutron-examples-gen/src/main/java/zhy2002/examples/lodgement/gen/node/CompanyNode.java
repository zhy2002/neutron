package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyNode extends ObjectUiNode<CompanyListNode> {

    private CompanyGeneralNode companyGeneralNode;
    private CompanyContactNode companyContactNode;
    private CompanyTrustNode companyTrustNode;
    private CompanyPrivacyNode companyPrivacyNode;
    private CompanyOtherIncomeListNode companyOtherIncomeListNode;
    private CompanyResponsibleLendNode companyResponsibleLendNode;

    private CompanyNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(CompanyNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyNode.class;
    }

    private CompanyNodeComponent component;

    @Inject
    void createComponent(CompanyNodeComponent.Builder builder) {
        this.component = builder.setCompanyNodeModule(new CompanyNodeModule(this)).build();
    }

    private RuleProvider<CompanyNode> getRuleProvider() {
        return component.getCompanyNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanyNode(@NotNull CompanyListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CompanyGeneralNode getCompanyGeneralNode() {
        return companyGeneralNode;
    }

    @JsMethod
    public CompanyContactNode getCompanyContactNode() {
        return companyContactNode;
    }

    @JsMethod
    public CompanyTrustNode getCompanyTrustNode() {
        return companyTrustNode;
    }

    @JsMethod
    public CompanyPrivacyNode getCompanyPrivacyNode() {
        return companyPrivacyNode;
    }

    @JsMethod
    public CompanyOtherIncomeListNode getCompanyOtherIncomeListNode() {
        return companyOtherIncomeListNode;
    }

    @JsMethod
    public CompanyResponsibleLendNode getCompanyResponsibleLendNode() {
        return companyResponsibleLendNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        companyGeneralNode = childFactory.createCompanyGeneralNode();
        children.add(companyGeneralNode);
        companyContactNode = childFactory.createCompanyContactNode();
        children.add(companyContactNode);
        companyTrustNode = childFactory.createCompanyTrustNode();
        children.add(companyTrustNode);
        companyPrivacyNode = childFactory.createCompanyPrivacyNode();
        children.add(companyPrivacyNode);
        companyOtherIncomeListNode = childFactory.createCompanyOtherIncomeListNode();
        children.add(companyOtherIncomeListNode);
        companyResponsibleLendNode = childFactory.createCompanyResponsibleLendNode();
        children.add(companyResponsibleLendNode);
        return children;
    }

}
