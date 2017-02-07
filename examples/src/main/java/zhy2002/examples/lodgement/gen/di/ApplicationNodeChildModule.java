package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    AddressListNodeItemComponent.class,
    PersonListNodeItemComponent.class,
    CompanyListNodeItemComponent.class,
    FinancialPositionNodeChildComponent.class,
    RealEstateListNodeItemComponent.class,
    ProductsNodeChildComponent.class,
    AdditionalNodeChildComponent.class,
    SubmissionNodeChildComponent.class,
    ErrorListNodeItemComponent.class
})
@ApplicationNodeChildScope
public class ApplicationNodeChildModule {

    private final ApplicationNode parent;

    public ApplicationNodeChildModule(ApplicationNode parent) {
        this.parent = parent;
    }


    @Provides
    @ApplicationNodeChildScope
    @Named("addressListNode")
    AddressListNode provideAddressListNode(
        MembersInjector<AddressListNode> injector
    ) {
        AddressListNode node = new AddressListNode(parent, "addressListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("personListNode")
    PersonListNode providePersonListNode(
        MembersInjector<PersonListNode> injector
    ) {
        PersonListNode node = new PersonListNode(parent, "personListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("companyListNode")
    CompanyListNode provideCompanyListNode(
        MembersInjector<CompanyListNode> injector
    ) {
        CompanyListNode node = new CompanyListNode(parent, "companyListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("financialPositionNode")
    FinancialPositionNode provideFinancialPositionNode(
        MembersInjector<FinancialPositionNode> injector
    ) {
        FinancialPositionNode node = new FinancialPositionNode(parent, "financialPositionNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("realEstateListNode")
    RealEstateListNode provideRealEstateListNode(
        MembersInjector<RealEstateListNode> injector
    ) {
        RealEstateListNode node = new RealEstateListNode(parent, "realEstateListNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("productsNode")
    ProductsNode provideProductsNode(
        MembersInjector<ProductsNode> injector
    ) {
        ProductsNode node = new ProductsNode(parent, "productsNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("additionalNode")
    AdditionalNode provideAdditionalNode(
        MembersInjector<AdditionalNode> injector
    ) {
        AdditionalNode node = new AdditionalNode(parent, "additionalNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("submissionNode")
    SubmissionNode provideSubmissionNode(
        MembersInjector<SubmissionNode> injector
    ) {
        SubmissionNode node = new SubmissionNode(parent, "submissionNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @ApplicationNodeChildScope
    @Named("errorListNode")
    ErrorListNode provideErrorListNode(
        MembersInjector<ErrorListNode> injector
    ) {
        ErrorListNode node = new ErrorListNode(parent, "errorListNode");

        injector.injectMembers(node);
        return node;
    }

}