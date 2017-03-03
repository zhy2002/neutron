package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CompanyGeneralNodeChildFactory {
    CompanyApplicantTypeNode createCompanyApplicantTypeNode();
    CompanyPrimaryApplicantFlagNode createCompanyPrimaryApplicantFlagNode();
    CompanyApplicationTypeNode createCompanyApplicationTypeNode();
    CompanyRegisteredNameNode createCompanyRegisteredNameNode();
    CompanyTypeNode createCompanyTypeNode();
    CompanyDescriptionNode createCompanyDescriptionNode();
    CompanyIndustryNode createCompanyIndustryNode();
    CompanyAbnNode createCompanyAbnNode();
    CompanyAcnNode createCompanyAcnNode();
    CompanyAbrnNode createCompanyAbrnNode();
    CompanyRegistrationDateNode createCompanyRegistrationDateNode();
    CompanyRegistrationStateNode createCompanyRegistrationStateNode();
    CompanySelectDirectorNode createCompanySelectDirectorNode();
    CompanySelectBeneficialOwnerNode createCompanySelectBeneficialOwnerNode();
}

@Singleton
public class CompanyGeneralNodeChildProvider {
    @Inject
    MembersInjector<CompanyRegistrationDateNode> companyRegistrationDateNodeInjector;
    @Inject
    MembersInjector<CompanySelectBeneficialOwnerNode> companySelectBeneficialOwnerNodeInjector;
    @Inject
    MembersInjector<CompanyAbnNode> companyAbnNodeInjector;
    @Inject
    MembersInjector<CompanyTypeNode> companyTypeNodeInjector;
    @Inject
    MembersInjector<CompanyRegistrationStateNode> companyRegistrationStateNodeInjector;
    @Inject
    MembersInjector<CompanyAbrnNode> companyAbrnNodeInjector;
    @Inject
    MembersInjector<CompanyDescriptionNode> companyDescriptionNodeInjector;
    @Inject
    MembersInjector<CompanyApplicationTypeNode> companyApplicationTypeNodeInjector;
    @Inject
    MembersInjector<CompanyIndustryNode> companyIndustryNodeInjector;
    @Inject
    MembersInjector<CompanySelectDirectorNode> companySelectDirectorNodeInjector;
    @Inject
    MembersInjector<CompanyApplicantTypeNode> companyApplicantTypeNodeInjector;
    @Inject
    MembersInjector<CompanyRegisteredNameNode> companyRegisteredNameNodeInjector;
    @Inject
    MembersInjector<CompanyPrimaryApplicantFlagNode> companyPrimaryApplicantFlagNodeInjector;
    @Inject
    MembersInjector<CompanyAcnNode> companyAcnNodeInjector;

    @Inject
    protected CompanyGeneralNodeChildProvider () {}

    protected MembersInjector<CompanyRegistrationDateNode> getCompanyRegistrationDateNodeInjector() {
        return this.companyRegistrationDateNodeInjector;
    }

    protected MembersInjector<CompanySelectBeneficialOwnerNode> getCompanySelectBeneficialOwnerNodeInjector() {
        return this.companySelectBeneficialOwnerNodeInjector;
    }

    protected MembersInjector<CompanyAbnNode> getCompanyAbnNodeInjector() {
        return this.companyAbnNodeInjector;
    }

    protected MembersInjector<CompanyTypeNode> getCompanyTypeNodeInjector() {
        return this.companyTypeNodeInjector;
    }

    protected MembersInjector<CompanyRegistrationStateNode> getCompanyRegistrationStateNodeInjector() {
        return this.companyRegistrationStateNodeInjector;
    }

    protected MembersInjector<CompanyAbrnNode> getCompanyAbrnNodeInjector() {
        return this.companyAbrnNodeInjector;
    }

    protected MembersInjector<CompanyDescriptionNode> getCompanyDescriptionNodeInjector() {
        return this.companyDescriptionNodeInjector;
    }

    protected MembersInjector<CompanyApplicationTypeNode> getCompanyApplicationTypeNodeInjector() {
        return this.companyApplicationTypeNodeInjector;
    }

    protected MembersInjector<CompanyIndustryNode> getCompanyIndustryNodeInjector() {
        return this.companyIndustryNodeInjector;
    }

    protected MembersInjector<CompanySelectDirectorNode> getCompanySelectDirectorNodeInjector() {
        return this.companySelectDirectorNodeInjector;
    }

    protected MembersInjector<CompanyApplicantTypeNode> getCompanyApplicantTypeNodeInjector() {
        return this.companyApplicantTypeNodeInjector;
    }

    protected MembersInjector<CompanyRegisteredNameNode> getCompanyRegisteredNameNodeInjector() {
        return this.companyRegisteredNameNodeInjector;
    }

    protected MembersInjector<CompanyPrimaryApplicantFlagNode> getCompanyPrimaryApplicantFlagNodeInjector() {
        return this.companyPrimaryApplicantFlagNodeInjector;
    }

    protected MembersInjector<CompanyAcnNode> getCompanyAcnNodeInjector() {
        return this.companyAcnNodeInjector;
    }

    protected CompanyApplicantTypeNode newCompanyApplicantTypeNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyApplicantTypeNode(parent, name);
    }

    protected void configureCompanyApplicantTypeNode(CompanyApplicantTypeNode node) {
    }

    protected CompanyPrimaryApplicantFlagNode newCompanyPrimaryApplicantFlagNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyPrimaryApplicantFlagNode(parent, name);
    }

    protected void configureCompanyPrimaryApplicantFlagNode(CompanyPrimaryApplicantFlagNode node) {
    }

    protected CompanyApplicationTypeNode newCompanyApplicationTypeNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyApplicationTypeNode(parent, name);
    }

    protected void configureCompanyApplicationTypeNode(CompanyApplicationTypeNode node) {
    }

    protected CompanyRegisteredNameNode newCompanyRegisteredNameNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyRegisteredNameNode(parent, name);
    }

    protected void configureCompanyRegisteredNameNode(CompanyRegisteredNameNode node) {
    }

    protected CompanyTypeNode newCompanyTypeNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyTypeNode(parent, name);
    }

    protected void configureCompanyTypeNode(CompanyTypeNode node) {
    }

    protected CompanyDescriptionNode newCompanyDescriptionNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyDescriptionNode(parent, name);
    }

    protected void configureCompanyDescriptionNode(CompanyDescriptionNode node) {
    }

    protected CompanyIndustryNode newCompanyIndustryNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyIndustryNode(parent, name);
    }

    protected void configureCompanyIndustryNode(CompanyIndustryNode node) {
    }

    protected CompanyAbnNode newCompanyAbnNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyAbnNode(parent, name);
    }

    protected void configureCompanyAbnNode(CompanyAbnNode node) {
    }

    protected CompanyAcnNode newCompanyAcnNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyAcnNode(parent, name);
    }

    protected void configureCompanyAcnNode(CompanyAcnNode node) {
    }

    protected CompanyAbrnNode newCompanyAbrnNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyAbrnNode(parent, name);
    }

    protected void configureCompanyAbrnNode(CompanyAbrnNode node) {
    }

    protected CompanyRegistrationDateNode newCompanyRegistrationDateNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyRegistrationDateNode(parent, name);
    }

    protected void configureCompanyRegistrationDateNode(CompanyRegistrationDateNode node) {
    }

    protected CompanyRegistrationStateNode newCompanyRegistrationStateNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyRegistrationStateNode(parent, name);
    }

    protected void configureCompanyRegistrationStateNode(CompanyRegistrationStateNode node) {
    }

    protected CompanySelectDirectorNode newCompanySelectDirectorNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanySelectDirectorNode(parent, name);
    }

    protected void configureCompanySelectDirectorNode(CompanySelectDirectorNode node) {
    }

    protected CompanySelectBeneficialOwnerNode newCompanySelectBeneficialOwnerNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanySelectBeneficialOwnerNode(parent, name);
    }

    protected void configureCompanySelectBeneficialOwnerNode(CompanySelectBeneficialOwnerNode node) {
    }

    CompanyGeneralNodeChildFactory createFactory(CompanyGeneralNode parent) {
        return new CompanyGeneralNodeChildFactoryImpl(parent);
    }

    private class CompanyGeneralNodeChildFactoryImpl implements CompanyGeneralNodeChildFactory {

        private final CompanyGeneralNode parent;
        
        private CompanyGeneralNodeChildFactoryImpl(CompanyGeneralNode parent) {
            this.parent = parent;
        }

        @Override
        public CompanyApplicantTypeNode createCompanyApplicantTypeNode() {
            CompanyApplicantTypeNode node = newCompanyApplicantTypeNode(parent, "companyApplicantTypeNode");
            companyApplicantTypeNodeInjector.injectMembers(node);
            configureCompanyApplicantTypeNode(node);
            return node;
        }

        @Override
        public CompanyPrimaryApplicantFlagNode createCompanyPrimaryApplicantFlagNode() {
            CompanyPrimaryApplicantFlagNode node = newCompanyPrimaryApplicantFlagNode(parent, "companyPrimaryApplicantFlagNode");
            companyPrimaryApplicantFlagNodeInjector.injectMembers(node);
            configureCompanyPrimaryApplicantFlagNode(node);
            return node;
        }

        @Override
        public CompanyApplicationTypeNode createCompanyApplicationTypeNode() {
            CompanyApplicationTypeNode node = newCompanyApplicationTypeNode(parent, "companyApplicationTypeNode");
            companyApplicationTypeNodeInjector.injectMembers(node);
            configureCompanyApplicationTypeNode(node);
            return node;
        }

        @Override
        public CompanyRegisteredNameNode createCompanyRegisteredNameNode() {
            CompanyRegisteredNameNode node = newCompanyRegisteredNameNode(parent, "companyRegisteredNameNode");
            companyRegisteredNameNodeInjector.injectMembers(node);
            configureCompanyRegisteredNameNode(node);
            return node;
        }

        @Override
        public CompanyTypeNode createCompanyTypeNode() {
            CompanyTypeNode node = newCompanyTypeNode(parent, "companyTypeNode");
            companyTypeNodeInjector.injectMembers(node);
            configureCompanyTypeNode(node);
            return node;
        }

        @Override
        public CompanyDescriptionNode createCompanyDescriptionNode() {
            CompanyDescriptionNode node = newCompanyDescriptionNode(parent, "companyDescriptionNode");
            companyDescriptionNodeInjector.injectMembers(node);
            configureCompanyDescriptionNode(node);
            return node;
        }

        @Override
        public CompanyIndustryNode createCompanyIndustryNode() {
            CompanyIndustryNode node = newCompanyIndustryNode(parent, "companyIndustryNode");
            companyIndustryNodeInjector.injectMembers(node);
            configureCompanyIndustryNode(node);
            return node;
        }

        @Override
        public CompanyAbnNode createCompanyAbnNode() {
            CompanyAbnNode node = newCompanyAbnNode(parent, "companyAbnNode");
            companyAbnNodeInjector.injectMembers(node);
            configureCompanyAbnNode(node);
            return node;
        }

        @Override
        public CompanyAcnNode createCompanyAcnNode() {
            CompanyAcnNode node = newCompanyAcnNode(parent, "companyAcnNode");
            companyAcnNodeInjector.injectMembers(node);
            configureCompanyAcnNode(node);
            return node;
        }

        @Override
        public CompanyAbrnNode createCompanyAbrnNode() {
            CompanyAbrnNode node = newCompanyAbrnNode(parent, "companyAbrnNode");
            companyAbrnNodeInjector.injectMembers(node);
            configureCompanyAbrnNode(node);
            return node;
        }

        @Override
        public CompanyRegistrationDateNode createCompanyRegistrationDateNode() {
            CompanyRegistrationDateNode node = newCompanyRegistrationDateNode(parent, "companyRegistrationDateNode");
            companyRegistrationDateNodeInjector.injectMembers(node);
            configureCompanyRegistrationDateNode(node);
            return node;
        }

        @Override
        public CompanyRegistrationStateNode createCompanyRegistrationStateNode() {
            CompanyRegistrationStateNode node = newCompanyRegistrationStateNode(parent, "companyRegistrationStateNode");
            companyRegistrationStateNodeInjector.injectMembers(node);
            configureCompanyRegistrationStateNode(node);
            return node;
        }

        @Override
        public CompanySelectDirectorNode createCompanySelectDirectorNode() {
            CompanySelectDirectorNode node = newCompanySelectDirectorNode(parent, "companySelectDirectorNode");
            companySelectDirectorNodeInjector.injectMembers(node);
            configureCompanySelectDirectorNode(node);
            return node;
        }

        @Override
        public CompanySelectBeneficialOwnerNode createCompanySelectBeneficialOwnerNode() {
            CompanySelectBeneficialOwnerNode node = newCompanySelectBeneficialOwnerNode(parent, "companySelectBeneficialOwnerNode");
            companySelectBeneficialOwnerNodeInjector.injectMembers(node);
            configureCompanySelectBeneficialOwnerNode(node);
            return node;
        }

    }
}
