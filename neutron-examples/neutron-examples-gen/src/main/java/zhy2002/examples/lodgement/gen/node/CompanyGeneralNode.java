package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyGeneralNode extends ObjectUiNode<CompanyNode> {

    private CompanyApplicantTypeNode companyApplicantTypeNode;
    private CompanyPrimaryApplicantFlagNode companyPrimaryApplicantFlagNode;
    private CompanyApplicationTypeNode companyApplicationTypeNode;
    private CompanyRegisteredNameNode companyRegisteredNameNode;
    private CompanyTypeNode companyTypeNode;
    private CompanyDescriptionNode companyDescriptionNode;
    private CompanyIndustryNode companyIndustryNode;
    private CompanyAbnNode companyAbnNode;
    private CompanyAcnNode companyAcnNode;
    private CompanyAbrnNode companyAbrnNode;
    private CompanyRegistrationDateNode companyRegistrationDateNode;
    private CompanyRegistrationStateNode companyRegistrationStateNode;
    private CompanySelectDirectorNode companySelectDirectorNode;
    private CompanySelectBeneficialOwnerNode companySelectBeneficialOwnerNode;

    private CompanyGeneralNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(CompanyGeneralNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyGeneralNode.class;
    }

    private CompanyGeneralNodeComponent component;

    @Inject
    void createComponent(CompanyGeneralNodeComponent.Builder builder) {
        this.component = builder.setCompanyGeneralNodeModule(new CompanyGeneralNodeModule(this)).build();
    }

    private CompanyGeneralNodeRuleProvider getRuleProvider() {
        return component.getCompanyGeneralNodeRuleProvider();
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

    private RuleProvider<CompanyGeneralNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public CompanyGeneralNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CompanyApplicantTypeNode getCompanyApplicantTypeNode() {
        return companyApplicantTypeNode;
    }

    @JsMethod
    public CompanyPrimaryApplicantFlagNode getCompanyPrimaryApplicantFlagNode() {
        return companyPrimaryApplicantFlagNode;
    }

    @JsMethod
    public CompanyApplicationTypeNode getCompanyApplicationTypeNode() {
        return companyApplicationTypeNode;
    }

    @JsMethod
    public CompanyRegisteredNameNode getCompanyRegisteredNameNode() {
        return companyRegisteredNameNode;
    }

    @JsMethod
    public CompanyTypeNode getCompanyTypeNode() {
        return companyTypeNode;
    }

    @JsMethod
    public CompanyDescriptionNode getCompanyDescriptionNode() {
        return companyDescriptionNode;
    }

    @JsMethod
    public CompanyIndustryNode getCompanyIndustryNode() {
        return companyIndustryNode;
    }

    @JsMethod
    public CompanyAbnNode getCompanyAbnNode() {
        return companyAbnNode;
    }

    @JsMethod
    public CompanyAcnNode getCompanyAcnNode() {
        return companyAcnNode;
    }

    @JsMethod
    public CompanyAbrnNode getCompanyAbrnNode() {
        return companyAbrnNode;
    }

    @JsMethod
    public CompanyRegistrationDateNode getCompanyRegistrationDateNode() {
        return companyRegistrationDateNode;
    }

    @JsMethod
    public CompanyRegistrationStateNode getCompanyRegistrationStateNode() {
        return companyRegistrationStateNode;
    }

    @JsMethod
    public CompanySelectDirectorNode getCompanySelectDirectorNode() {
        return companySelectDirectorNode;
    }

    @JsMethod
    public CompanySelectBeneficialOwnerNode getCompanySelectBeneficialOwnerNode() {
        return companySelectBeneficialOwnerNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        companyApplicantTypeNode = childFactory.createCompanyApplicantTypeNode();
        children.add(companyApplicantTypeNode);
        companyPrimaryApplicantFlagNode = childFactory.createCompanyPrimaryApplicantFlagNode();
        children.add(companyPrimaryApplicantFlagNode);
        companyApplicationTypeNode = childFactory.createCompanyApplicationTypeNode();
        children.add(companyApplicationTypeNode);
        companyRegisteredNameNode = childFactory.createCompanyRegisteredNameNode();
        children.add(companyRegisteredNameNode);
        companyTypeNode = childFactory.createCompanyTypeNode();
        children.add(companyTypeNode);
        companyDescriptionNode = childFactory.createCompanyDescriptionNode();
        children.add(companyDescriptionNode);
        companyIndustryNode = childFactory.createCompanyIndustryNode();
        children.add(companyIndustryNode);
        companyAbnNode = childFactory.createCompanyAbnNode();
        children.add(companyAbnNode);
        companyAcnNode = childFactory.createCompanyAcnNode();
        children.add(companyAcnNode);
        companyAbrnNode = childFactory.createCompanyAbrnNode();
        children.add(companyAbrnNode);
        companyRegistrationDateNode = childFactory.createCompanyRegistrationDateNode();
        children.add(companyRegistrationDateNode);
        companyRegistrationStateNode = childFactory.createCompanyRegistrationStateNode();
        children.add(companyRegistrationStateNode);
        companySelectDirectorNode = childFactory.createCompanySelectDirectorNode();
        children.add(companySelectDirectorNode);
        companySelectBeneficialOwnerNode = childFactory.createCompanySelectBeneficialOwnerNode();
        children.add(companySelectBeneficialOwnerNode);
        return children;
    }

}
