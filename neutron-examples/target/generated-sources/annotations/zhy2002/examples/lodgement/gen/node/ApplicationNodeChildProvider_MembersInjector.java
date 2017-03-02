package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeChildProvider_MembersInjector
    implements MembersInjector<ApplicationNodeChildProvider> {
  private final MembersInjector<PersonListNode> personListNodeInjectorMembersInjector;

  private final MembersInjector<FinancialPositionNode> financialPositionNodeInjectorMembersInjector;

  private final MembersInjector<AddressRefListNode> addressRefListNodeInjectorMembersInjector;

  private final MembersInjector<SubmissionNode> submissionNodeInjectorMembersInjector;

  private final MembersInjector<RealEstateListNode> realEstateListNodeInjectorMembersInjector;

  private final MembersInjector<CompanyListNode> companyListNodeInjectorMembersInjector;

  private final MembersInjector<ProductsNode> productsNodeInjectorMembersInjector;

  private final MembersInjector<ErrorListNode> errorListNodeInjectorMembersInjector;

  private final MembersInjector<AdditionalNode> additionalNodeInjectorMembersInjector;

  public ApplicationNodeChildProvider_MembersInjector(
      MembersInjector<PersonListNode> personListNodeInjectorMembersInjector,
      MembersInjector<FinancialPositionNode> financialPositionNodeInjectorMembersInjector,
      MembersInjector<AddressRefListNode> addressRefListNodeInjectorMembersInjector,
      MembersInjector<SubmissionNode> submissionNodeInjectorMembersInjector,
      MembersInjector<RealEstateListNode> realEstateListNodeInjectorMembersInjector,
      MembersInjector<CompanyListNode> companyListNodeInjectorMembersInjector,
      MembersInjector<ProductsNode> productsNodeInjectorMembersInjector,
      MembersInjector<ErrorListNode> errorListNodeInjectorMembersInjector,
      MembersInjector<AdditionalNode> additionalNodeInjectorMembersInjector) {
    assert personListNodeInjectorMembersInjector != null;
    this.personListNodeInjectorMembersInjector = personListNodeInjectorMembersInjector;
    assert financialPositionNodeInjectorMembersInjector != null;
    this.financialPositionNodeInjectorMembersInjector =
        financialPositionNodeInjectorMembersInjector;
    assert addressRefListNodeInjectorMembersInjector != null;
    this.addressRefListNodeInjectorMembersInjector = addressRefListNodeInjectorMembersInjector;
    assert submissionNodeInjectorMembersInjector != null;
    this.submissionNodeInjectorMembersInjector = submissionNodeInjectorMembersInjector;
    assert realEstateListNodeInjectorMembersInjector != null;
    this.realEstateListNodeInjectorMembersInjector = realEstateListNodeInjectorMembersInjector;
    assert companyListNodeInjectorMembersInjector != null;
    this.companyListNodeInjectorMembersInjector = companyListNodeInjectorMembersInjector;
    assert productsNodeInjectorMembersInjector != null;
    this.productsNodeInjectorMembersInjector = productsNodeInjectorMembersInjector;
    assert errorListNodeInjectorMembersInjector != null;
    this.errorListNodeInjectorMembersInjector = errorListNodeInjectorMembersInjector;
    assert additionalNodeInjectorMembersInjector != null;
    this.additionalNodeInjectorMembersInjector = additionalNodeInjectorMembersInjector;
  }

  public static MembersInjector<ApplicationNodeChildProvider> create(
      MembersInjector<PersonListNode> personListNodeInjectorMembersInjector,
      MembersInjector<FinancialPositionNode> financialPositionNodeInjectorMembersInjector,
      MembersInjector<AddressRefListNode> addressRefListNodeInjectorMembersInjector,
      MembersInjector<SubmissionNode> submissionNodeInjectorMembersInjector,
      MembersInjector<RealEstateListNode> realEstateListNodeInjectorMembersInjector,
      MembersInjector<CompanyListNode> companyListNodeInjectorMembersInjector,
      MembersInjector<ProductsNode> productsNodeInjectorMembersInjector,
      MembersInjector<ErrorListNode> errorListNodeInjectorMembersInjector,
      MembersInjector<AdditionalNode> additionalNodeInjectorMembersInjector) {
    return new ApplicationNodeChildProvider_MembersInjector(
        personListNodeInjectorMembersInjector,
        financialPositionNodeInjectorMembersInjector,
        addressRefListNodeInjectorMembersInjector,
        submissionNodeInjectorMembersInjector,
        realEstateListNodeInjectorMembersInjector,
        companyListNodeInjectorMembersInjector,
        productsNodeInjectorMembersInjector,
        errorListNodeInjectorMembersInjector,
        additionalNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ApplicationNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.personListNodeInjector = personListNodeInjectorMembersInjector;
    instance.financialPositionNodeInjector = financialPositionNodeInjectorMembersInjector;
    instance.addressRefListNodeInjector = addressRefListNodeInjectorMembersInjector;
    instance.submissionNodeInjector = submissionNodeInjectorMembersInjector;
    instance.realEstateListNodeInjector = realEstateListNodeInjectorMembersInjector;
    instance.companyListNodeInjector = companyListNodeInjectorMembersInjector;
    instance.productsNodeInjector = productsNodeInjectorMembersInjector;
    instance.errorListNodeInjector = errorListNodeInjectorMembersInjector;
    instance.additionalNodeInjector = additionalNodeInjectorMembersInjector;
  }

  public static void injectPersonListNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<PersonListNode> personListNodeInjector) {
    instance.personListNodeInjector = personListNodeInjector;
  }

  public static void injectFinancialPositionNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<FinancialPositionNode> financialPositionNodeInjector) {
    instance.financialPositionNodeInjector = financialPositionNodeInjector;
  }

  public static void injectAddressRefListNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<AddressRefListNode> addressRefListNodeInjector) {
    instance.addressRefListNodeInjector = addressRefListNodeInjector;
  }

  public static void injectSubmissionNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<SubmissionNode> submissionNodeInjector) {
    instance.submissionNodeInjector = submissionNodeInjector;
  }

  public static void injectRealEstateListNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<RealEstateListNode> realEstateListNodeInjector) {
    instance.realEstateListNodeInjector = realEstateListNodeInjector;
  }

  public static void injectCompanyListNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<CompanyListNode> companyListNodeInjector) {
    instance.companyListNodeInjector = companyListNodeInjector;
  }

  public static void injectProductsNodeInjector(
      ApplicationNodeChildProvider instance, MembersInjector<ProductsNode> productsNodeInjector) {
    instance.productsNodeInjector = productsNodeInjector;
  }

  public static void injectErrorListNodeInjector(
      ApplicationNodeChildProvider instance, MembersInjector<ErrorListNode> errorListNodeInjector) {
    instance.errorListNodeInjector = errorListNodeInjector;
  }

  public static void injectAdditionalNodeInjector(
      ApplicationNodeChildProvider instance,
      MembersInjector<AdditionalNode> additionalNodeInjector) {
    instance.additionalNodeInjector = additionalNodeInjector;
  }
}
