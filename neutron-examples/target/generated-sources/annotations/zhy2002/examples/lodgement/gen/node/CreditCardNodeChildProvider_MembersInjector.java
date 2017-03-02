package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardNodeChildProvider_MembersInjector
    implements MembersInjector<CreditCardNodeChildProvider> {
  private final MembersInjector<CreditCardLenderNameNode>
      creditCardLenderNameNodeInjectorMembersInjector;

  private final MembersInjector<CreditCardMonthlyRepaymentNode>
      creditCardMonthlyRepaymentNodeInjectorMembersInjector;

  private final MembersInjector<CreditCardAmountOwingNode>
      creditCardAmountOwingNodeInjectorMembersInjector;

  private final MembersInjector<CreditCardLimitAmountNode>
      creditCardLimitAmountNodeInjectorMembersInjector;

  private final MembersInjector<CreditCardTypeNode> creditCardTypeNodeInjectorMembersInjector;

  private final MembersInjector<CreditCardClearingFlagNode>
      creditCardClearingFlagNodeInjectorMembersInjector;

  private final MembersInjector<CreditCardBreakCostNode>
      creditCardBreakCostNodeInjectorMembersInjector;

  public CreditCardNodeChildProvider_MembersInjector(
      MembersInjector<CreditCardLenderNameNode> creditCardLenderNameNodeInjectorMembersInjector,
      MembersInjector<CreditCardMonthlyRepaymentNode>
          creditCardMonthlyRepaymentNodeInjectorMembersInjector,
      MembersInjector<CreditCardAmountOwingNode> creditCardAmountOwingNodeInjectorMembersInjector,
      MembersInjector<CreditCardLimitAmountNode> creditCardLimitAmountNodeInjectorMembersInjector,
      MembersInjector<CreditCardTypeNode> creditCardTypeNodeInjectorMembersInjector,
      MembersInjector<CreditCardClearingFlagNode> creditCardClearingFlagNodeInjectorMembersInjector,
      MembersInjector<CreditCardBreakCostNode> creditCardBreakCostNodeInjectorMembersInjector) {
    assert creditCardLenderNameNodeInjectorMembersInjector != null;
    this.creditCardLenderNameNodeInjectorMembersInjector =
        creditCardLenderNameNodeInjectorMembersInjector;
    assert creditCardMonthlyRepaymentNodeInjectorMembersInjector != null;
    this.creditCardMonthlyRepaymentNodeInjectorMembersInjector =
        creditCardMonthlyRepaymentNodeInjectorMembersInjector;
    assert creditCardAmountOwingNodeInjectorMembersInjector != null;
    this.creditCardAmountOwingNodeInjectorMembersInjector =
        creditCardAmountOwingNodeInjectorMembersInjector;
    assert creditCardLimitAmountNodeInjectorMembersInjector != null;
    this.creditCardLimitAmountNodeInjectorMembersInjector =
        creditCardLimitAmountNodeInjectorMembersInjector;
    assert creditCardTypeNodeInjectorMembersInjector != null;
    this.creditCardTypeNodeInjectorMembersInjector = creditCardTypeNodeInjectorMembersInjector;
    assert creditCardClearingFlagNodeInjectorMembersInjector != null;
    this.creditCardClearingFlagNodeInjectorMembersInjector =
        creditCardClearingFlagNodeInjectorMembersInjector;
    assert creditCardBreakCostNodeInjectorMembersInjector != null;
    this.creditCardBreakCostNodeInjectorMembersInjector =
        creditCardBreakCostNodeInjectorMembersInjector;
  }

  public static MembersInjector<CreditCardNodeChildProvider> create(
      MembersInjector<CreditCardLenderNameNode> creditCardLenderNameNodeInjectorMembersInjector,
      MembersInjector<CreditCardMonthlyRepaymentNode>
          creditCardMonthlyRepaymentNodeInjectorMembersInjector,
      MembersInjector<CreditCardAmountOwingNode> creditCardAmountOwingNodeInjectorMembersInjector,
      MembersInjector<CreditCardLimitAmountNode> creditCardLimitAmountNodeInjectorMembersInjector,
      MembersInjector<CreditCardTypeNode> creditCardTypeNodeInjectorMembersInjector,
      MembersInjector<CreditCardClearingFlagNode> creditCardClearingFlagNodeInjectorMembersInjector,
      MembersInjector<CreditCardBreakCostNode> creditCardBreakCostNodeInjectorMembersInjector) {
    return new CreditCardNodeChildProvider_MembersInjector(
        creditCardLenderNameNodeInjectorMembersInjector,
        creditCardMonthlyRepaymentNodeInjectorMembersInjector,
        creditCardAmountOwingNodeInjectorMembersInjector,
        creditCardLimitAmountNodeInjectorMembersInjector,
        creditCardTypeNodeInjectorMembersInjector,
        creditCardClearingFlagNodeInjectorMembersInjector,
        creditCardBreakCostNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CreditCardNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.creditCardLenderNameNodeInjector = creditCardLenderNameNodeInjectorMembersInjector;
    instance.creditCardMonthlyRepaymentNodeInjector =
        creditCardMonthlyRepaymentNodeInjectorMembersInjector;
    instance.creditCardAmountOwingNodeInjector = creditCardAmountOwingNodeInjectorMembersInjector;
    instance.creditCardLimitAmountNodeInjector = creditCardLimitAmountNodeInjectorMembersInjector;
    instance.creditCardTypeNodeInjector = creditCardTypeNodeInjectorMembersInjector;
    instance.creditCardClearingFlagNodeInjector = creditCardClearingFlagNodeInjectorMembersInjector;
    instance.creditCardBreakCostNodeInjector = creditCardBreakCostNodeInjectorMembersInjector;
  }

  public static void injectCreditCardLenderNameNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardLenderNameNode> creditCardLenderNameNodeInjector) {
    instance.creditCardLenderNameNodeInjector = creditCardLenderNameNodeInjector;
  }

  public static void injectCreditCardMonthlyRepaymentNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardMonthlyRepaymentNode> creditCardMonthlyRepaymentNodeInjector) {
    instance.creditCardMonthlyRepaymentNodeInjector = creditCardMonthlyRepaymentNodeInjector;
  }

  public static void injectCreditCardAmountOwingNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardAmountOwingNode> creditCardAmountOwingNodeInjector) {
    instance.creditCardAmountOwingNodeInjector = creditCardAmountOwingNodeInjector;
  }

  public static void injectCreditCardLimitAmountNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardLimitAmountNode> creditCardLimitAmountNodeInjector) {
    instance.creditCardLimitAmountNodeInjector = creditCardLimitAmountNodeInjector;
  }

  public static void injectCreditCardTypeNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardTypeNode> creditCardTypeNodeInjector) {
    instance.creditCardTypeNodeInjector = creditCardTypeNodeInjector;
  }

  public static void injectCreditCardClearingFlagNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardClearingFlagNode> creditCardClearingFlagNodeInjector) {
    instance.creditCardClearingFlagNodeInjector = creditCardClearingFlagNodeInjector;
  }

  public static void injectCreditCardBreakCostNodeInjector(
      CreditCardNodeChildProvider instance,
      MembersInjector<CreditCardBreakCostNode> creditCardBreakCostNodeInjector) {
    instance.creditCardBreakCostNodeInjector = creditCardBreakCostNodeInjector;
  }
}
