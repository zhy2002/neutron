package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyNodeChildProvider_MembersInjector
    implements MembersInjector<CompanyNodeChildProvider> {
  private final MembersInjector<CompanyPrivacyNode> companyPrivacyNodeInjectorMembersInjector;

  private final MembersInjector<CompanyOtherIncomeListNode>
      companyOtherIncomeListNodeInjectorMembersInjector;

  private final MembersInjector<CompanyResponsibleLendNode>
      companyResponsibleLendNodeInjectorMembersInjector;

  private final MembersInjector<CompanyContactNode> companyContactNodeInjectorMembersInjector;

  private final MembersInjector<CompanyGeneralNode> companyGeneralNodeInjectorMembersInjector;

  private final MembersInjector<CompanyTrustNode> companyTrustNodeInjectorMembersInjector;

  public CompanyNodeChildProvider_MembersInjector(
      MembersInjector<CompanyPrivacyNode> companyPrivacyNodeInjectorMembersInjector,
      MembersInjector<CompanyOtherIncomeListNode> companyOtherIncomeListNodeInjectorMembersInjector,
      MembersInjector<CompanyResponsibleLendNode> companyResponsibleLendNodeInjectorMembersInjector,
      MembersInjector<CompanyContactNode> companyContactNodeInjectorMembersInjector,
      MembersInjector<CompanyGeneralNode> companyGeneralNodeInjectorMembersInjector,
      MembersInjector<CompanyTrustNode> companyTrustNodeInjectorMembersInjector) {
    assert companyPrivacyNodeInjectorMembersInjector != null;
    this.companyPrivacyNodeInjectorMembersInjector = companyPrivacyNodeInjectorMembersInjector;
    assert companyOtherIncomeListNodeInjectorMembersInjector != null;
    this.companyOtherIncomeListNodeInjectorMembersInjector =
        companyOtherIncomeListNodeInjectorMembersInjector;
    assert companyResponsibleLendNodeInjectorMembersInjector != null;
    this.companyResponsibleLendNodeInjectorMembersInjector =
        companyResponsibleLendNodeInjectorMembersInjector;
    assert companyContactNodeInjectorMembersInjector != null;
    this.companyContactNodeInjectorMembersInjector = companyContactNodeInjectorMembersInjector;
    assert companyGeneralNodeInjectorMembersInjector != null;
    this.companyGeneralNodeInjectorMembersInjector = companyGeneralNodeInjectorMembersInjector;
    assert companyTrustNodeInjectorMembersInjector != null;
    this.companyTrustNodeInjectorMembersInjector = companyTrustNodeInjectorMembersInjector;
  }

  public static MembersInjector<CompanyNodeChildProvider> create(
      MembersInjector<CompanyPrivacyNode> companyPrivacyNodeInjectorMembersInjector,
      MembersInjector<CompanyOtherIncomeListNode> companyOtherIncomeListNodeInjectorMembersInjector,
      MembersInjector<CompanyResponsibleLendNode> companyResponsibleLendNodeInjectorMembersInjector,
      MembersInjector<CompanyContactNode> companyContactNodeInjectorMembersInjector,
      MembersInjector<CompanyGeneralNode> companyGeneralNodeInjectorMembersInjector,
      MembersInjector<CompanyTrustNode> companyTrustNodeInjectorMembersInjector) {
    return new CompanyNodeChildProvider_MembersInjector(
        companyPrivacyNodeInjectorMembersInjector,
        companyOtherIncomeListNodeInjectorMembersInjector,
        companyResponsibleLendNodeInjectorMembersInjector,
        companyContactNodeInjectorMembersInjector,
        companyGeneralNodeInjectorMembersInjector,
        companyTrustNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CompanyNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.companyPrivacyNodeInjector = companyPrivacyNodeInjectorMembersInjector;
    instance.companyOtherIncomeListNodeInjector = companyOtherIncomeListNodeInjectorMembersInjector;
    instance.companyResponsibleLendNodeInjector = companyResponsibleLendNodeInjectorMembersInjector;
    instance.companyContactNodeInjector = companyContactNodeInjectorMembersInjector;
    instance.companyGeneralNodeInjector = companyGeneralNodeInjectorMembersInjector;
    instance.companyTrustNodeInjector = companyTrustNodeInjectorMembersInjector;
  }

  public static void injectCompanyPrivacyNodeInjector(
      CompanyNodeChildProvider instance,
      MembersInjector<CompanyPrivacyNode> companyPrivacyNodeInjector) {
    instance.companyPrivacyNodeInjector = companyPrivacyNodeInjector;
  }

  public static void injectCompanyOtherIncomeListNodeInjector(
      CompanyNodeChildProvider instance,
      MembersInjector<CompanyOtherIncomeListNode> companyOtherIncomeListNodeInjector) {
    instance.companyOtherIncomeListNodeInjector = companyOtherIncomeListNodeInjector;
  }

  public static void injectCompanyResponsibleLendNodeInjector(
      CompanyNodeChildProvider instance,
      MembersInjector<CompanyResponsibleLendNode> companyResponsibleLendNodeInjector) {
    instance.companyResponsibleLendNodeInjector = companyResponsibleLendNodeInjector;
  }

  public static void injectCompanyContactNodeInjector(
      CompanyNodeChildProvider instance,
      MembersInjector<CompanyContactNode> companyContactNodeInjector) {
    instance.companyContactNodeInjector = companyContactNodeInjector;
  }

  public static void injectCompanyGeneralNodeInjector(
      CompanyNodeChildProvider instance,
      MembersInjector<CompanyGeneralNode> companyGeneralNodeInjector) {
    instance.companyGeneralNodeInjector = companyGeneralNodeInjector;
  }

  public static void injectCompanyTrustNodeInjector(
      CompanyNodeChildProvider instance,
      MembersInjector<CompanyTrustNode> companyTrustNodeInjector) {
    instance.companyTrustNodeInjector = companyTrustNodeInjector;
  }
}
