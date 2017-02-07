package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@ApplicationNodeChildScope
public class ApplicationNodeChildModule {


    @Provides
    @ApplicationNodeChildScope
    @Named("addressListNode")
    AddressListNode provideAddressListNode(
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
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
        ApplicationNode parent,
        MembersInjector<ErrorListNode> injector
    ) {
        ErrorListNode node = new ErrorListNode(parent, "errorListNode");

        injector.injectMembers(node);
        return node;
    }

}