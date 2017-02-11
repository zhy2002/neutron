package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ApplicationNodeChildFactory {
    AddressListNode createAddressListNode();
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
    MembersInjector<AddressListNode> addressListNodeInjector;
    @Inject
    MembersInjector<PersonListNode> personListNodeInjector;
    @Inject
    MembersInjector<CompanyListNode> companyListNodeInjector;
    @Inject
    MembersInjector<FinancialPositionNode> financialPositionNodeInjector;
    @Inject
    MembersInjector<RealEstateListNode> realEstateListNodeInjector;
    @Inject
    MembersInjector<ProductsNode> productsNodeInjector;
    @Inject
    MembersInjector<AdditionalNode> additionalNodeInjector;
    @Inject
    MembersInjector<SubmissionNode> submissionNodeInjector;
    @Inject
    MembersInjector<ErrorListNode> errorListNodeInjector;

    @Inject
    protected ApplicationNodeChildProvider () {}

    protected MembersInjector<AddressListNode> getAddressListNodeInjector() {
        return this.addressListNodeInjector;
    }

    protected MembersInjector<PersonListNode> getPersonListNodeInjector() {
        return this.personListNodeInjector;
    }

    protected MembersInjector<CompanyListNode> getCompanyListNodeInjector() {
        return this.companyListNodeInjector;
    }

    protected MembersInjector<FinancialPositionNode> getFinancialPositionNodeInjector() {
        return this.financialPositionNodeInjector;
    }

    protected MembersInjector<RealEstateListNode> getRealEstateListNodeInjector() {
        return this.realEstateListNodeInjector;
    }

    protected MembersInjector<ProductsNode> getProductsNodeInjector() {
        return this.productsNodeInjector;
    }

    protected MembersInjector<AdditionalNode> getAdditionalNodeInjector() {
        return this.additionalNodeInjector;
    }

    protected MembersInjector<SubmissionNode> getSubmissionNodeInjector() {
        return this.submissionNodeInjector;
    }

    protected MembersInjector<ErrorListNode> getErrorListNodeInjector() {
        return this.errorListNodeInjector;
    }

    protected AddressListNode newAddressListNode(
        ApplicationNode parent,
        String name
    ) {
        return new AddressListNode(parent, name);
    }

    protected void configureAddressListNode(AddressListNode node) {
    }

    protected PersonListNode newPersonListNode(
        ApplicationNode parent,
        String name
    ) {
        return new PersonListNode(parent, name);
    }

    protected void configurePersonListNode(PersonListNode node) {
    }

    protected CompanyListNode newCompanyListNode(
        ApplicationNode parent,
        String name
    ) {
        return new CompanyListNode(parent, name);
    }

    protected void configureCompanyListNode(CompanyListNode node) {
    }

    protected FinancialPositionNode newFinancialPositionNode(
        ApplicationNode parent,
        String name
    ) {
        return new FinancialPositionNode(parent, name);
    }

    protected void configureFinancialPositionNode(FinancialPositionNode node) {
    }

    protected RealEstateListNode newRealEstateListNode(
        ApplicationNode parent,
        String name
    ) {
        return new RealEstateListNode(parent, name);
    }

    protected void configureRealEstateListNode(RealEstateListNode node) {
    }

    protected ProductsNode newProductsNode(
        ApplicationNode parent,
        String name
    ) {
        return new ProductsNode(parent, name);
    }

    protected void configureProductsNode(ProductsNode node) {
    }

    protected AdditionalNode newAdditionalNode(
        ApplicationNode parent,
        String name
    ) {
        return new AdditionalNode(parent, name);
    }

    protected void configureAdditionalNode(AdditionalNode node) {
    }

    protected SubmissionNode newSubmissionNode(
        ApplicationNode parent,
        String name
    ) {
        return new SubmissionNode(parent, name);
    }

    protected void configureSubmissionNode(SubmissionNode node) {
    }

    protected ErrorListNode newErrorListNode(
        ApplicationNode parent,
        String name
    ) {
        return new ErrorListNode(parent, name);
    }

    protected void configureErrorListNode(ErrorListNode node) {
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
        public AddressListNode createAddressListNode() {
            AddressListNode node = newAddressListNode(parent, "addressListNode");
            addressListNodeInjector.injectMembers(node);
            configureAddressListNode(node);
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
