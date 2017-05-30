package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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

    @CompanyApplicantTypeNodeScope
    public static class CompanyApplicantTypeNodeRuleProvider implements RuleProvider<CompanyApplicantTypeNode> {

        @Inject
        public CompanyApplicantTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyApplicantTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyPrimaryApplicantFlagNode newCompanyPrimaryApplicantFlagNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyPrimaryApplicantFlagNode(parent, name);
    }

    protected void configureCompanyPrimaryApplicantFlagNode(CompanyPrimaryApplicantFlagNode node) {
    }

    @CompanyPrimaryApplicantFlagNodeScope
    public static class CompanyPrimaryApplicantFlagNodeRuleProvider implements RuleProvider<CompanyPrimaryApplicantFlagNode> {

        @Inject
        public CompanyPrimaryApplicantFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyPrimaryApplicantFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyApplicationTypeNode newCompanyApplicationTypeNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyApplicationTypeNode(parent, name);
    }

    protected void configureCompanyApplicationTypeNode(CompanyApplicationTypeNode node) {
    }

    @CompanyApplicationTypeNodeScope
    public static class CompanyApplicationTypeNodeRuleProvider implements RuleProvider<CompanyApplicationTypeNode> {

        @Inject
        public CompanyApplicationTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyApplicationTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyRegisteredNameNode newCompanyRegisteredNameNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyRegisteredNameNode(parent, name);
    }

    protected void configureCompanyRegisteredNameNode(CompanyRegisteredNameNode node) {
    }

    @CompanyRegisteredNameNodeScope
    public static class CompanyRegisteredNameNodeRuleProvider implements RuleProvider<CompanyRegisteredNameNode> {

        @Inject
        public CompanyRegisteredNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyRegisteredNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyTypeNode newCompanyTypeNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyTypeNode(parent, name);
    }

    protected void configureCompanyTypeNode(CompanyTypeNode node) {
    }

    @CompanyTypeNodeScope
    public static class CompanyTypeNodeRuleProvider implements RuleProvider<CompanyTypeNode> {

        @Inject
        public CompanyTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyDescriptionNode newCompanyDescriptionNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyDescriptionNode(parent, name);
    }

    protected void configureCompanyDescriptionNode(CompanyDescriptionNode node) {
    }

    @CompanyDescriptionNodeScope
    public static class CompanyDescriptionNodeRuleProvider implements RuleProvider<CompanyDescriptionNode> {

        @Inject
        public CompanyDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyIndustryNode newCompanyIndustryNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyIndustryNode(parent, name);
    }

    protected void configureCompanyIndustryNode(CompanyIndustryNode node) {
    }

    @CompanyIndustryNodeScope
    public static class CompanyIndustryNodeRuleProvider implements RuleProvider<CompanyIndustryNode> {

        @Inject
        public CompanyIndustryNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyIndustryNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAbnNode newCompanyAbnNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyAbnNode(parent, name);
    }

    protected void configureCompanyAbnNode(CompanyAbnNode node) {
    }

    @CompanyAbnNodeScope
    public static class CompanyAbnNodeRuleProvider implements RuleProvider<CompanyAbnNode> {

        @Inject
        public CompanyAbnNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAbnNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAcnNode newCompanyAcnNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyAcnNode(parent, name);
    }

    protected void configureCompanyAcnNode(CompanyAcnNode node) {
    }

    @CompanyAcnNodeScope
    public static class CompanyAcnNodeRuleProvider implements RuleProvider<CompanyAcnNode> {

        @Inject
        public CompanyAcnNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAcnNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyAbrnNode newCompanyAbrnNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyAbrnNode(parent, name);
    }

    protected void configureCompanyAbrnNode(CompanyAbrnNode node) {
    }

    @CompanyAbrnNodeScope
    public static class CompanyAbrnNodeRuleProvider implements RuleProvider<CompanyAbrnNode> {

        @Inject
        public CompanyAbrnNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyAbrnNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyRegistrationDateNode newCompanyRegistrationDateNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyRegistrationDateNode(parent, name);
    }

    protected void configureCompanyRegistrationDateNode(CompanyRegistrationDateNode node) {
    }

    @CompanyRegistrationDateNodeScope
    public static class CompanyRegistrationDateNodeRuleProvider implements RuleProvider<CompanyRegistrationDateNode> {

        @Inject
        public CompanyRegistrationDateNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyRegistrationDateNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyRegistrationStateNode newCompanyRegistrationStateNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanyRegistrationStateNode(parent, name);
    }

    protected void configureCompanyRegistrationStateNode(CompanyRegistrationStateNode node) {
    }

    @CompanyRegistrationStateNodeScope
    public static class CompanyRegistrationStateNodeRuleProvider implements RuleProvider<CompanyRegistrationStateNode> {

        @Inject
        public CompanyRegistrationStateNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyRegistrationStateNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanySelectDirectorNode newCompanySelectDirectorNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanySelectDirectorNode(parent, name);
    }

    protected void configureCompanySelectDirectorNode(CompanySelectDirectorNode node) {
    }

    @CompanySelectDirectorNodeScope
    public static class CompanySelectDirectorNodeRuleProvider implements RuleProvider<CompanySelectDirectorNode> {

        @Inject
        public CompanySelectDirectorNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanySelectDirectorNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanySelectBeneficialOwnerNode newCompanySelectBeneficialOwnerNode(
        CompanyGeneralNode parent,
        String name
    ) {
        return new CompanySelectBeneficialOwnerNode(parent, name);
    }

    protected void configureCompanySelectBeneficialOwnerNode(CompanySelectBeneficialOwnerNode node) {
    }

    @CompanySelectBeneficialOwnerNodeScope
    public static class CompanySelectBeneficialOwnerNodeRuleProvider implements RuleProvider<CompanySelectBeneficialOwnerNode> {

        @Inject
        public CompanySelectBeneficialOwnerNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanySelectBeneficialOwnerNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
