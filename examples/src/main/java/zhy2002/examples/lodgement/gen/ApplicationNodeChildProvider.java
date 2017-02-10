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

    protected PersonListNode newPersonListNode(
        ApplicationNode parent,
        String name
    ) {
        return new PersonListNode(parent, name);
    }

    protected CompanyListNode newCompanyListNode(
        ApplicationNode parent,
        String name
    ) {
        return new CompanyListNode(parent, name);
    }

    protected FinancialPositionNode newFinancialPositionNode(
        ApplicationNode parent,
        String name
    ) {
        return new FinancialPositionNode(parent, name);
    }

    protected RealEstateListNode newRealEstateListNode(
        ApplicationNode parent,
        String name
    ) {
        return new RealEstateListNode(parent, name);
    }

    protected ProductsNode newProductsNode(
        ApplicationNode parent,
        String name
    ) {
        return new ProductsNode(parent, name);
    }

    protected AdditionalNode newAdditionalNode(
        ApplicationNode parent,
        String name
    ) {
        return new AdditionalNode(parent, name);
    }

    protected SubmissionNode newSubmissionNode(
        ApplicationNode parent,
        String name
    ) {
        return new SubmissionNode(parent, name);
    }

    protected ErrorListNode newErrorListNode(
        ApplicationNode parent,
        String name
    ) {
        return new ErrorListNode(parent, name);
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
            return node;
        }

        @Override
        public PersonListNode createPersonListNode() {
            PersonListNode node = newPersonListNode(parent, "personListNode");
            personListNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public CompanyListNode createCompanyListNode() {
            CompanyListNode node = newCompanyListNode(parent, "companyListNode");
            companyListNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public FinancialPositionNode createFinancialPositionNode() {
            FinancialPositionNode node = newFinancialPositionNode(parent, "financialPositionNode");
            financialPositionNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public RealEstateListNode createRealEstateListNode() {
            RealEstateListNode node = newRealEstateListNode(parent, "realEstateListNode");
            realEstateListNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ProductsNode createProductsNode() {
            ProductsNode node = newProductsNode(parent, "productsNode");
            productsNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public AdditionalNode createAdditionalNode() {
            AdditionalNode node = newAdditionalNode(parent, "additionalNode");
            additionalNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SubmissionNode createSubmissionNode() {
            SubmissionNode node = newSubmissionNode(parent, "submissionNode");
            submissionNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ErrorListNode createErrorListNode() {
            ErrorListNode node = newErrorListNode(parent, "errorListNode");
            errorListNodeInjector.injectMembers(node);
            return node;
        }

    }
}
