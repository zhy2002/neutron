package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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

    @ComponentScope
    public static class CompanyGeneralNodeRuleProvider implements RuleProvider<CompanyGeneralNode> {

        @Inject
        public CompanyGeneralNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyGeneralNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyContactNode newCompanyContactNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyContactNode(parent, name);
    }

    protected void configureCompanyContactNode(CompanyContactNode node) {
    }

    @ComponentScope
    public static class CompanyContactNodeRuleProvider implements RuleProvider<CompanyContactNode> {

        @Inject
        public CompanyContactNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyContactNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyTrustNode newCompanyTrustNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyTrustNode(parent, name);
    }

    protected void configureCompanyTrustNode(CompanyTrustNode node) {
    }

    @ComponentScope
    public static class CompanyTrustNodeRuleProvider implements RuleProvider<CompanyTrustNode> {

        @Inject
        public CompanyTrustNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyTrustNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyPrivacyNode newCompanyPrivacyNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyPrivacyNode(parent, name);
    }

    protected void configureCompanyPrivacyNode(CompanyPrivacyNode node) {
    }

    @ComponentScope
    public static class CompanyPrivacyNodeRuleProvider implements RuleProvider<CompanyPrivacyNode> {

        @Inject
        public CompanyPrivacyNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyPrivacyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyOtherIncomeListNode newCompanyOtherIncomeListNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyOtherIncomeListNode(parent, name);
    }

    protected void configureCompanyOtherIncomeListNode(CompanyOtherIncomeListNode node) {
    }

    @ComponentScope
    public static class CompanyOtherIncomeListNodeRuleProvider implements RuleProvider<CompanyOtherIncomeListNode> {

        @Inject
        public CompanyOtherIncomeListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyOtherIncomeListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyResponsibleLendNode newCompanyResponsibleLendNode(
        CompanyNode parent,
        String name
    ) {
        return new CompanyResponsibleLendNode(parent, name);
    }

    protected void configureCompanyResponsibleLendNode(CompanyResponsibleLendNode node) {
    }

    @ComponentScope
    public static class CompanyResponsibleLendNodeRuleProvider implements RuleProvider<CompanyResponsibleLendNode> {

        @Inject
        public CompanyResponsibleLendNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyResponsibleLendNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
