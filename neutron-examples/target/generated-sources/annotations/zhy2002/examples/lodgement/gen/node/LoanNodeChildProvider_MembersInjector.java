package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNodeChildProvider_MembersInjector
    implements MembersInjector<LoanNodeChildProvider> {
  private final MembersInjector<LoanLimitAmountNode> loanLimitAmountNodeInjectorMembersInjector;

  private final MembersInjector<LoanOwingAmountNode> loanOwingAmountNodeInjectorMembersInjector;

  private final MembersInjector<LoanTypeNode> loanTypeNodeInjectorMembersInjector;

  private final MembersInjector<LoanMonthlyRepaymentNode>
      loanMonthlyRepaymentNodeInjectorMembersInjector;

  private final MembersInjector<LoanClearingFlagNode> loanClearingFlagNodeInjectorMembersInjector;

  private final MembersInjector<LoanBreakCostNode> loanBreakCostNodeInjectorMembersInjector;

  private final MembersInjector<LoanLenderNameNode> loanLenderNameNodeInjectorMembersInjector;

  public LoanNodeChildProvider_MembersInjector(
      MembersInjector<LoanLimitAmountNode> loanLimitAmountNodeInjectorMembersInjector,
      MembersInjector<LoanOwingAmountNode> loanOwingAmountNodeInjectorMembersInjector,
      MembersInjector<LoanTypeNode> loanTypeNodeInjectorMembersInjector,
      MembersInjector<LoanMonthlyRepaymentNode> loanMonthlyRepaymentNodeInjectorMembersInjector,
      MembersInjector<LoanClearingFlagNode> loanClearingFlagNodeInjectorMembersInjector,
      MembersInjector<LoanBreakCostNode> loanBreakCostNodeInjectorMembersInjector,
      MembersInjector<LoanLenderNameNode> loanLenderNameNodeInjectorMembersInjector) {
    assert loanLimitAmountNodeInjectorMembersInjector != null;
    this.loanLimitAmountNodeInjectorMembersInjector = loanLimitAmountNodeInjectorMembersInjector;
    assert loanOwingAmountNodeInjectorMembersInjector != null;
    this.loanOwingAmountNodeInjectorMembersInjector = loanOwingAmountNodeInjectorMembersInjector;
    assert loanTypeNodeInjectorMembersInjector != null;
    this.loanTypeNodeInjectorMembersInjector = loanTypeNodeInjectorMembersInjector;
    assert loanMonthlyRepaymentNodeInjectorMembersInjector != null;
    this.loanMonthlyRepaymentNodeInjectorMembersInjector =
        loanMonthlyRepaymentNodeInjectorMembersInjector;
    assert loanClearingFlagNodeInjectorMembersInjector != null;
    this.loanClearingFlagNodeInjectorMembersInjector = loanClearingFlagNodeInjectorMembersInjector;
    assert loanBreakCostNodeInjectorMembersInjector != null;
    this.loanBreakCostNodeInjectorMembersInjector = loanBreakCostNodeInjectorMembersInjector;
    assert loanLenderNameNodeInjectorMembersInjector != null;
    this.loanLenderNameNodeInjectorMembersInjector = loanLenderNameNodeInjectorMembersInjector;
  }

  public static MembersInjector<LoanNodeChildProvider> create(
      MembersInjector<LoanLimitAmountNode> loanLimitAmountNodeInjectorMembersInjector,
      MembersInjector<LoanOwingAmountNode> loanOwingAmountNodeInjectorMembersInjector,
      MembersInjector<LoanTypeNode> loanTypeNodeInjectorMembersInjector,
      MembersInjector<LoanMonthlyRepaymentNode> loanMonthlyRepaymentNodeInjectorMembersInjector,
      MembersInjector<LoanClearingFlagNode> loanClearingFlagNodeInjectorMembersInjector,
      MembersInjector<LoanBreakCostNode> loanBreakCostNodeInjectorMembersInjector,
      MembersInjector<LoanLenderNameNode> loanLenderNameNodeInjectorMembersInjector) {
    return new LoanNodeChildProvider_MembersInjector(
        loanLimitAmountNodeInjectorMembersInjector,
        loanOwingAmountNodeInjectorMembersInjector,
        loanTypeNodeInjectorMembersInjector,
        loanMonthlyRepaymentNodeInjectorMembersInjector,
        loanClearingFlagNodeInjectorMembersInjector,
        loanBreakCostNodeInjectorMembersInjector,
        loanLenderNameNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(LoanNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.loanLimitAmountNodeInjector = loanLimitAmountNodeInjectorMembersInjector;
    instance.loanOwingAmountNodeInjector = loanOwingAmountNodeInjectorMembersInjector;
    instance.loanTypeNodeInjector = loanTypeNodeInjectorMembersInjector;
    instance.loanMonthlyRepaymentNodeInjector = loanMonthlyRepaymentNodeInjectorMembersInjector;
    instance.loanClearingFlagNodeInjector = loanClearingFlagNodeInjectorMembersInjector;
    instance.loanBreakCostNodeInjector = loanBreakCostNodeInjectorMembersInjector;
    instance.loanLenderNameNodeInjector = loanLenderNameNodeInjectorMembersInjector;
  }

  public static void injectLoanLimitAmountNodeInjector(
      LoanNodeChildProvider instance,
      MembersInjector<LoanLimitAmountNode> loanLimitAmountNodeInjector) {
    instance.loanLimitAmountNodeInjector = loanLimitAmountNodeInjector;
  }

  public static void injectLoanOwingAmountNodeInjector(
      LoanNodeChildProvider instance,
      MembersInjector<LoanOwingAmountNode> loanOwingAmountNodeInjector) {
    instance.loanOwingAmountNodeInjector = loanOwingAmountNodeInjector;
  }

  public static void injectLoanTypeNodeInjector(
      LoanNodeChildProvider instance, MembersInjector<LoanTypeNode> loanTypeNodeInjector) {
    instance.loanTypeNodeInjector = loanTypeNodeInjector;
  }

  public static void injectLoanMonthlyRepaymentNodeInjector(
      LoanNodeChildProvider instance,
      MembersInjector<LoanMonthlyRepaymentNode> loanMonthlyRepaymentNodeInjector) {
    instance.loanMonthlyRepaymentNodeInjector = loanMonthlyRepaymentNodeInjector;
  }

  public static void injectLoanClearingFlagNodeInjector(
      LoanNodeChildProvider instance,
      MembersInjector<LoanClearingFlagNode> loanClearingFlagNodeInjector) {
    instance.loanClearingFlagNodeInjector = loanClearingFlagNodeInjector;
  }

  public static void injectLoanBreakCostNodeInjector(
      LoanNodeChildProvider instance,
      MembersInjector<LoanBreakCostNode> loanBreakCostNodeInjector) {
    instance.loanBreakCostNodeInjector = loanBreakCostNodeInjector;
  }

  public static void injectLoanLenderNameNodeInjector(
      LoanNodeChildProvider instance,
      MembersInjector<LoanLenderNameNode> loanLenderNameNodeInjector) {
    instance.loanLenderNameNodeInjector = loanLenderNameNodeInjector;
  }
}
