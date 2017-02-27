package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CompanyNodeChildFactory {
    CompanyGeneralNode createCompanyGeneralNode();
    CompanyContactNode createCompanyContactNode();
    CompanyTrustNode createCompanyTrustNode();
    CompanyPrivacyNode createCompanyPrivacyNode();
    CompanyOtherIncomeListNode createCompanyOtherIncomeListNode();
    CompanyResponsibleLendNode createCompanyResponsibleLendNode();
}

@Singleton
public class CompanyNodeChildProvider {
    @Inject
    MembersInjector<CompanyPrivacyNode> companyPrivacyNodeInjector;
    @Inject
    MembersInjector<CompanyOtherIncomeListNode> companyOtherIncomeListNodeInjector;
    @Inject
    MembersInjector<CompanyResponsibleLendNode> companyResponsibleLendNodeInjector;
    @Inject
    MembersInjector<CompanyContactNode> companyContactNodeInjector;
    @Inject
    MembersInjector<CompanyGeneralNode> companyGeneralNodeInjector;
    @Inject
    MembersInjector<CompanyTrustNode> companyTrustNodeInjector;

    @Inject
    protected CompanyNodeChildProvider () {}

    protected MembersInjector<CompanyPrivacyNode> getCompanyPrivacyNodeInjector() {
        return this.companyPrivacyNodeInjector;
    }

    protected MembersInjector<CompanyOtherIncomeListNode> getCompanyOtherIncomeListNodeInjector() {
        return this.companyOtherIncomeListNodeInjector;
    }

    protected MembersInjector<CompanyResponsibleLendNode> getCompanyResponsibleLendNodeInjector() {
        return this.companyResponsibleLendNodeInjector;
    }

    protected MembersInjector<CompanyContactNode> getCompanyContactNodeInjector() {
        return this.companyContactNodeInjector;
    }

    protected MembersInjector<CompanyGeneralNode> getCompanyGeneralNodeInjector() {
        return this.companyGeneralNodeInjector;
    }

    protected MembersInjector<CompanyTrustNode> getCompanyTrustNodeInjector() {
        return this.companyTrustNodeInjector;
    }

    protected CompanyGeneralNode newCompanyGeneralNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyGeneralNode(parent, name);
    }

    protected void configureCompanyGeneralNode(CompanyGeneralNode node) {
    }

    protected CompanyContactNode newCompanyContactNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyContactNode(parent, name);
    }

    protected void configureCompanyContactNode(CompanyContactNode node) {
    }

    protected CompanyTrustNode newCompanyTrustNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyTrustNode(parent, name);
    }

    protected void configureCompanyTrustNode(CompanyTrustNode node) {
    }

    protected CompanyPrivacyNode newCompanyPrivacyNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyPrivacyNode(parent, name);
    }

    protected void configureCompanyPrivacyNode(CompanyPrivacyNode node) {
    }

    protected CompanyOtherIncomeListNode newCompanyOtherIncomeListNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyOtherIncomeListNode(parent, name);
    }

    protected void configureCompanyOtherIncomeListNode(CompanyOtherIncomeListNode node) {
    }

    protected CompanyResponsibleLendNode newCompanyResponsibleLendNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyResponsibleLendNode(parent, name);
    }

    protected void configureCompanyResponsibleLendNode(CompanyResponsibleLendNode node) {
    }

    CompanyNodeChildFactory createFactory(CompanyNode parent) {
        return new CompanyNodeChildFactoryImpl(parent);
    }

    private class CompanyNodeChildFactoryImpl implements CompanyNodeChildFactory {

        private final CompanyNode parent;
        
        private CompanyNodeChildFactoryImpl(CompanyNode parent) {
            this.parent = parent;
        }

        @Override
        public CompanyGeneralNode createCompanyGeneralNode() {
            CompanyGeneralNode node = newCompanyGeneralNode(parent, "companyGeneralNode");
            companyGeneralNodeInjector.injectMembers(node);
            configureCompanyGeneralNode(node);
            return node;
        }

        @Override
        public CompanyContactNode createCompanyContactNode() {
            CompanyContactNode node = newCompanyContactNode(parent, "companyContactNode");
            companyContactNodeInjector.injectMembers(node);
            configureCompanyContactNode(node);
            return node;
        }

        @Override
        public CompanyTrustNode createCompanyTrustNode() {
            CompanyTrustNode node = newCompanyTrustNode(parent, "companyTrustNode");
            companyTrustNodeInjector.injectMembers(node);
            configureCompanyTrustNode(node);
            return node;
        }

        @Override
        public CompanyPrivacyNode createCompanyPrivacyNode() {
            CompanyPrivacyNode node = newCompanyPrivacyNode(parent, "companyPrivacyNode");
            companyPrivacyNodeInjector.injectMembers(node);
            configureCompanyPrivacyNode(node);
            return node;
        }

        @Override
        public CompanyOtherIncomeListNode createCompanyOtherIncomeListNode() {
            CompanyOtherIncomeListNode node = newCompanyOtherIncomeListNode(parent, "companyOtherIncomeListNode");
            companyOtherIncomeListNodeInjector.injectMembers(node);
            configureCompanyOtherIncomeListNode(node);
            return node;
        }

        @Override
        public CompanyResponsibleLendNode createCompanyResponsibleLendNode() {
            CompanyResponsibleLendNode node = newCompanyResponsibleLendNode(parent, "companyResponsibleLendNode");
            companyResponsibleLendNodeInjector.injectMembers(node);
            configureCompanyResponsibleLendNode(node);
            return node;
        }

    }
}
