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

public class CompanyGeneralNode extends ObjectUiNode<CompanyNode> {

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

    private RuleProvider<CompanyGeneralNode> getRuleProvider() {
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
        return (CompanyApplicantTypeNode)getChildByName("companyApplicantTypeNode");
    }

    @JsMethod
    public CompanyPrimaryApplicantFlagNode getCompanyPrimaryApplicantFlagNode() {
        return (CompanyPrimaryApplicantFlagNode)getChildByName("companyPrimaryApplicantFlagNode");
    }

    @JsMethod
    public CompanyApplicationTypeNode getCompanyApplicationTypeNode() {
        return (CompanyApplicationTypeNode)getChildByName("companyApplicationTypeNode");
    }

    @JsMethod
    public CompanyRegisteredNameNode getCompanyRegisteredNameNode() {
        return (CompanyRegisteredNameNode)getChildByName("companyRegisteredNameNode");
    }

    @JsMethod
    public CompanyTypeNode getCompanyTypeNode() {
        return (CompanyTypeNode)getChildByName("companyTypeNode");
    }

    @JsMethod
    public CompanyDescriptionNode getCompanyDescriptionNode() {
        return (CompanyDescriptionNode)getChildByName("companyDescriptionNode");
    }

    @JsMethod
    public CompanyIndustryNode getCompanyIndustryNode() {
        return (CompanyIndustryNode)getChildByName("companyIndustryNode");
    }

    @JsMethod
    public CompanyAbnNode getCompanyAbnNode() {
        return (CompanyAbnNode)getChildByName("companyAbnNode");
    }

    @JsMethod
    public CompanyAcnNode getCompanyAcnNode() {
        return (CompanyAcnNode)getChildByName("companyAcnNode");
    }

    @JsMethod
    public CompanyAbrnNode getCompanyAbrnNode() {
        return (CompanyAbrnNode)getChildByName("companyAbrnNode");
    }

    @JsMethod
    public CompanyRegistrationDateNode getCompanyRegistrationDateNode() {
        return (CompanyRegistrationDateNode)getChildByName("companyRegistrationDateNode");
    }

    @JsMethod
    public CompanyRegistrationStateNode getCompanyRegistrationStateNode() {
        return (CompanyRegistrationStateNode)getChildByName("companyRegistrationStateNode");
    }

    @JsMethod
    public CompanySelectDirectorNode getCompanySelectDirectorNode() {
        return (CompanySelectDirectorNode)getChildByName("companySelectDirectorNode");
    }

    @JsMethod
    public CompanySelectBeneficialOwnerNode getCompanySelectBeneficialOwnerNode() {
        return (CompanySelectBeneficialOwnerNode)getChildByName("companySelectBeneficialOwnerNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("companyApplicantTypeNode");
        children.add(childFactory.createCompanyApplicantTypeNode());
        setChildNodeIdentity("companyPrimaryApplicantFlagNode");
        children.add(childFactory.createCompanyPrimaryApplicantFlagNode());
        setChildNodeIdentity("companyApplicationTypeNode");
        children.add(childFactory.createCompanyApplicationTypeNode());
        setChildNodeIdentity("companyRegisteredNameNode");
        children.add(childFactory.createCompanyRegisteredNameNode());
        setChildNodeIdentity("companyTypeNode");
        children.add(childFactory.createCompanyTypeNode());
        setChildNodeIdentity("companyDescriptionNode");
        children.add(childFactory.createCompanyDescriptionNode());
        setChildNodeIdentity("companyIndustryNode");
        children.add(childFactory.createCompanyIndustryNode());
        setChildNodeIdentity("companyAbnNode");
        children.add(childFactory.createCompanyAbnNode());
        setChildNodeIdentity("companyAcnNode");
        children.add(childFactory.createCompanyAcnNode());
        setChildNodeIdentity("companyAbrnNode");
        children.add(childFactory.createCompanyAbrnNode());
        setChildNodeIdentity("companyRegistrationDateNode");
        children.add(childFactory.createCompanyRegistrationDateNode());
        setChildNodeIdentity("companyRegistrationStateNode");
        children.add(childFactory.createCompanyRegistrationStateNode());
        setChildNodeIdentity("companySelectDirectorNode");
        children.add(childFactory.createCompanySelectDirectorNode());
        setChildNodeIdentity("companySelectBeneficialOwnerNode");
        children.add(childFactory.createCompanySelectBeneficialOwnerNode());
        setChildNodeIdentity(null);
        return children;
    }

}
