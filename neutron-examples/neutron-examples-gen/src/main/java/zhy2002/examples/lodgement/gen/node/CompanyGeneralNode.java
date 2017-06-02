package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyGeneralNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyGeneralNode extends ObjectUiNode<CompanyNode> {

    @Inject
    protected CompanyGeneralNode(@Owner CompanyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyGeneralNode.class;
    }

    protected final CompanyGeneralNodeComponent getComponent() {
        return component;
    }


    private CompanyGeneralNodeComponent component;

    @Inject
    void createComponent(CompanyGeneralNodeComponent.Builder builder) {
        this.component = builder.setCompanyGeneralNodeModule(new CompanyGeneralNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("companyApplicantTypeNode");
        children.add(getComponent().createCompanyApplicantTypeNode());
        setChildNodeIdentity("companyPrimaryApplicantFlagNode");
        children.add(getComponent().createCompanyPrimaryApplicantFlagNode());
        setChildNodeIdentity("companyApplicationTypeNode");
        children.add(getComponent().createCompanyApplicationTypeNode());
        setChildNodeIdentity("companyRegisteredNameNode");
        children.add(getComponent().createCompanyRegisteredNameNode());
        setChildNodeIdentity("companyTypeNode");
        children.add(getComponent().createCompanyTypeNode());
        setChildNodeIdentity("companyDescriptionNode");
        children.add(getComponent().createCompanyDescriptionNode());
        setChildNodeIdentity("companyIndustryNode");
        children.add(getComponent().createCompanyIndustryNode());
        setChildNodeIdentity("companyAbnNode");
        children.add(getComponent().createCompanyAbnNode());
        setChildNodeIdentity("companyAcnNode");
        children.add(getComponent().createCompanyAcnNode());
        setChildNodeIdentity("companyAbrnNode");
        children.add(getComponent().createCompanyAbrnNode());
        setChildNodeIdentity("companyRegistrationDateNode");
        children.add(getComponent().createCompanyRegistrationDateNode());
        setChildNodeIdentity("companyRegistrationStateNode");
        children.add(getComponent().createCompanyRegistrationStateNode());
        setChildNodeIdentity("companySelectDirectorNode");
        children.add(getComponent().createCompanySelectDirectorNode());
        setChildNodeIdentity("companySelectBeneficialOwnerNode");
        children.add(getComponent().createCompanySelectBeneficialOwnerNode());
        setChildNodeIdentity(null);
        return children;
    }

}
