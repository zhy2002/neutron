package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNodeChildProvider_MembersInjector
    implements MembersInjector<LiabilitiesNodeChildProvider> {
  private final MembersInjector<CreditCardListNode> creditCardListNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityListNode>
      otherLiabilityListNodeInjectorMembersInjector;

  private final MembersInjector<LoanListNode> loanListNodeInjectorMembersInjector;

  public LiabilitiesNodeChildProvider_MembersInjector(
      MembersInjector<CreditCardListNode> creditCardListNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityListNode> otherLiabilityListNodeInjectorMembersInjector,
      MembersInjector<LoanListNode> loanListNodeInjectorMembersInjector) {
    assert creditCardListNodeInjectorMembersInjector != null;
    this.creditCardListNodeInjectorMembersInjector = creditCardListNodeInjectorMembersInjector;
    assert otherLiabilityListNodeInjectorMembersInjector != null;
    this.otherLiabilityListNodeInjectorMembersInjector =
        otherLiabilityListNodeInjectorMembersInjector;
    assert loanListNodeInjectorMembersInjector != null;
    this.loanListNodeInjectorMembersInjector = loanListNodeInjectorMembersInjector;
  }

  public static MembersInjector<LiabilitiesNodeChildProvider> create(
      MembersInjector<CreditCardListNode> creditCardListNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityListNode> otherLiabilityListNodeInjectorMembersInjector,
      MembersInjector<LoanListNode> loanListNodeInjectorMembersInjector) {
    return new LiabilitiesNodeChildProvider_MembersInjector(
        creditCardListNodeInjectorMembersInjector,
        otherLiabilityListNodeInjectorMembersInjector,
        loanListNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(LiabilitiesNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.creditCardListNodeInjector = creditCardListNodeInjectorMembersInjector;
    instance.otherLiabilityListNodeInjector = otherLiabilityListNodeInjectorMembersInjector;
    instance.loanListNodeInjector = loanListNodeInjectorMembersInjector;
  }

  public static void injectCreditCardListNodeInjector(
      LiabilitiesNodeChildProvider instance,
      MembersInjector<CreditCardListNode> creditCardListNodeInjector) {
    instance.creditCardListNodeInjector = creditCardListNodeInjector;
  }

  public static void injectOtherLiabilityListNodeInjector(
      LiabilitiesNodeChildProvider instance,
      MembersInjector<OtherLiabilityListNode> otherLiabilityListNodeInjector) {
    instance.otherLiabilityListNodeInjector = otherLiabilityListNodeInjector;
  }

  public static void injectLoanListNodeInjector(
      LiabilitiesNodeChildProvider instance, MembersInjector<LoanListNode> loanListNodeInjector) {
    instance.loanListNodeInjector = loanListNodeInjector;
  }
}
