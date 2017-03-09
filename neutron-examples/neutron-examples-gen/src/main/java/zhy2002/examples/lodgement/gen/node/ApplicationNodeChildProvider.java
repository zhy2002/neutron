package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface ApplicationNodeChildFactory {
    AddressRefListNode createAddressRefListNode();
    PersonListNode createPersonListNode();
    CompanyListNode createCompanyListNode();
    FinancialPositionNode createFinancialPositionNode();
    RealEstateListNode createRealEstateListNode();
    ProductsNode createProductsNode();
    AdditionalNode createAdditionalNode();
    SubmissionNode createSubmissionNode();
    ErrorListNode createErrorListNode();
}

@Singleton
public class ApplicationNodeChildProvider {
    @Inject
    MembersInjector<PersonListNode> personListNodeInjector;
    @Inject
    MembersInjector<FinancialPositionNode> financialPositionNodeInjector;
    @Inject
    MembersInjector<AddressRefListNode> addressRefListNodeInjector;
    @Inject
    MembersInjector<SubmissionNode> submissionNodeInjector;
    @Inject
    MembersInjector<RealEstateListNode> realEstateListNodeInjector;
    @Inject
    MembersInjector<CompanyListNode> companyListNodeInjector;
    @Inject
    MembersInjector<ProductsNode> productsNodeInjector;
    @Inject
    MembersInjector<ErrorListNode> errorListNodeInjector;
    @Inject
    MembersInjector<AdditionalNode> additionalNodeInjector;

    @Inject
    protected ApplicationNodeChildProvider () {}

    protected MembersInjector<PersonListNode> getPersonListNodeInjector() {
        return this.personListNodeInjector;
    }

    protected MembersInjector<FinancialPositionNode> getFinancialPositionNodeInjector() {
        return this.financialPositionNodeInjector;
    }

    protected MembersInjector<AddressRefListNode> getAddressRefListNodeInjector() {
        return this.addressRefListNodeInjector;
    }

    protected MembersInjector<SubmissionNode> getSubmissionNodeInjector() {
        return this.submissionNodeInjector;
    }

    protected MembersInjector<RealEstateListNode> getRealEstateListNodeInjector() {
        return this.realEstateListNodeInjector;
    }

    protected MembersInjector<CompanyListNode> getCompanyListNodeInjector() {
        return this.companyListNodeInjector;
    }

    protected MembersInjector<ProductsNode> getProductsNodeInjector() {
        return this.productsNodeInjector;
    }

    protected MembersInjector<ErrorListNode> getErrorListNodeInjector() {
        return this.errorListNodeInjector;
    }

    protected MembersInjector<AdditionalNode> getAdditionalNodeInjector() {
        return this.additionalNodeInjector;
    }

    protected AddressRefListNode newAddressRefListNode(
        ApplicationNode parent,
        String name
    ) {
        return new AddressRefListNode(parent, name);
    }

    protected void configureAddressRefListNode(AddressRefListNode node) {
    }

    @AddressRefListNodeScope
    public static class AddressRefListNodeRuleProvider implements RuleProvider<AddressRefListNode> {

        @Inject
        public AddressRefListNodeRuleProvider() {

        }

        @Override
        public void initializeState(AddressRefListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonListNode newPersonListNode(
        ApplicationNode parent,
        String name
    ) {
        return new PersonListNode(parent, name);
    }

    protected void configurePersonListNode(PersonListNode node) {
    }

    @PersonListNodeScope
    public static class PersonListNodeRuleProvider implements RuleProvider<PersonListNode> {

        @Inject
        public PersonListNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CompanyListNode newCompanyListNode(
        ApplicationNode parent,
        String name
    ) {
        return new CompanyListNode(parent, name);
    }

    protected void configureCompanyListNode(CompanyListNode node) {
    }

    @CompanyListNodeScope
    public static class CompanyListNodeRuleProvider implements RuleProvider<CompanyListNode> {

        @Inject
        public CompanyListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CompanyListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected FinancialPositionNode newFinancialPositionNode(
        ApplicationNode parent,
        String name
    ) {
        return new FinancialPositionNode(parent, name);
    }

    protected void configureFinancialPositionNode(FinancialPositionNode node) {
    }

    @FinancialPositionNodeScope
    public static class FinancialPositionNodeRuleProvider implements RuleProvider<FinancialPositionNode> {

        @Inject
        public FinancialPositionNodeRuleProvider() {

        }

        @Override
        public void initializeState(FinancialPositionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected RealEstateListNode newRealEstateListNode(
        ApplicationNode parent,
        String name
    ) {
        return new RealEstateListNode(parent, name);
    }

    protected void configureRealEstateListNode(RealEstateListNode node) {
    }

    @RealEstateListNodeScope
    public static class RealEstateListNodeRuleProvider implements RuleProvider<RealEstateListNode> {

        @Inject
        public RealEstateListNodeRuleProvider() {

        }

        @Override
        public void initializeState(RealEstateListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductsNode newProductsNode(
        ApplicationNode parent,
        String name
    ) {
        return new ProductsNode(parent, name);
    }

    protected void configureProductsNode(ProductsNode node) {
    }

    @ProductsNodeScope
    public static class ProductsNodeRuleProvider implements RuleProvider<ProductsNode> {

        @Inject
        public ProductsNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductsNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AdditionalNode newAdditionalNode(
        ApplicationNode parent,
        String name
    ) {
        return new AdditionalNode(parent, name);
    }

    protected void configureAdditionalNode(AdditionalNode node) {
    }

    @AdditionalNodeScope
    public static class AdditionalNodeRuleProvider implements RuleProvider<AdditionalNode> {

        @Inject
        public AdditionalNodeRuleProvider() {

        }

        @Override
        public void initializeState(AdditionalNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SubmissionNode newSubmissionNode(
        ApplicationNode parent,
        String name
    ) {
        return new SubmissionNode(parent, name);
    }

    protected void configureSubmissionNode(SubmissionNode node) {
    }

    @SubmissionNodeScope
    public static class SubmissionNodeRuleProvider implements RuleProvider<SubmissionNode> {

        @Inject
        public SubmissionNodeRuleProvider() {

        }

        @Override
        public void initializeState(SubmissionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ErrorListNode newErrorListNode(
        ApplicationNode parent,
        String name
    ) {
        return new ErrorListNode(parent, name);
    }

    protected void configureErrorListNode(ErrorListNode node) {
    }

    @ErrorListNodeScope
    public static class ErrorListNodeRuleProvider implements RuleProvider<ErrorListNode> {

        @Inject
        public ErrorListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ErrorListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ApplicationNodeChildFactory createFactory(ApplicationNode parent) {
        return new ApplicationNodeChildFactoryImpl(parent);
    }

    private class ApplicationNodeChildFactoryImpl implements ApplicationNodeChildFactory {

        private final ApplicationNode parent;
        
        private ApplicationNodeChildFactoryImpl(ApplicationNode parent) {
            this.parent = parent;
        }

        @Override
        public AddressRefListNode createAddressRefListNode() {
            AddressRefListNode node = newAddressRefListNode(parent, "addressRefListNode");
            addressRefListNodeInjector.injectMembers(node);
            configureAddressRefListNode(node);
            return node;
        }

        @Override
        public PersonListNode createPersonListNode() {
            PersonListNode node = newPersonListNode(parent, "personListNode");
            personListNodeInjector.injectMembers(node);
            configurePersonListNode(node);
            return node;
        }

        @Override
        public CompanyListNode createCompanyListNode() {
            CompanyListNode node = newCompanyListNode(parent, "companyListNode");
            companyListNodeInjector.injectMembers(node);
            configureCompanyListNode(node);
            return node;
        }

        @Override
        public FinancialPositionNode createFinancialPositionNode() {
            FinancialPositionNode node = newFinancialPositionNode(parent, "financialPositionNode");
            financialPositionNodeInjector.injectMembers(node);
            configureFinancialPositionNode(node);
            return node;
        }

        @Override
        public RealEstateListNode createRealEstateListNode() {
            RealEstateListNode node = newRealEstateListNode(parent, "realEstateListNode");
            realEstateListNodeInjector.injectMembers(node);
            configureRealEstateListNode(node);
            return node;
        }

        @Override
        public ProductsNode createProductsNode() {
            ProductsNode node = newProductsNode(parent, "productsNode");
            productsNodeInjector.injectMembers(node);
            configureProductsNode(node);
            return node;
        }

        @Override
        public AdditionalNode createAdditionalNode() {
            AdditionalNode node = newAdditionalNode(parent, "additionalNode");
            additionalNodeInjector.injectMembers(node);
            configureAdditionalNode(node);
            return node;
        }

        @Override
        public SubmissionNode createSubmissionNode() {
            SubmissionNode node = newSubmissionNode(parent, "submissionNode");
            submissionNodeInjector.injectMembers(node);
            configureSubmissionNode(node);
            return node;
        }

        @Override
        public ErrorListNode createErrorListNode() {
            ErrorListNode node = newErrorListNode(parent, "errorListNode");
            errorListNodeInjector.injectMembers(node);
            configureErrorListNode(node);
            return node;
        }

    }
}
