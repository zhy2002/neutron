package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@ApplicationNodeChildScope
@Subcomponent(modules = {ApplicationNodeChildModule.class})
public interface ApplicationNodeChildComponent {

    AddressListNode provideAddressListNode(@Named("addressListNode") AddressListNode impl);
    PersonListNode providePersonListNode(@Named("personListNode") PersonListNode impl);
    CompanyListNode provideCompanyListNode(@Named("companyListNode") CompanyListNode impl);
    FinancialPositionNode provideFinancialPositionNode(@Named("financialPositionNode") FinancialPositionNode impl);
    RealEstateListNode provideRealEstateListNode(@Named("realEstateListNode") RealEstateListNode impl);
    ProductsNode provideProductsNode(@Named("productsNode") ProductsNode impl);
    AdditionalNode provideAdditionalNode(@Named("additionalNode") AdditionalNode impl);
    SubmissionNode provideSubmissionNode(@Named("submissionNode") SubmissionNode impl);
    ErrorListNode provideErrorListNode(@Named("errorListNode") ErrorListNode impl);

}
