package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNodeChildProvider_MembersInjector
    implements MembersInjector<OtherLiabilityNodeChildProvider> {
  private final MembersInjector<OtherLiabilityAmountOwningNode>
      otherLiabilityAmountOwningNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityBreakCostNode>
      otherLiabilityBreakCostNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityLimitAmountNode>
      otherLiabilityLimitAmountNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityMonthlyRepaymentNode>
      otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityClearingFlagNode>
      otherLiabilityClearingFlagNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityDescriptionNode>
      otherLiabilityDescriptionNodeInjectorMembersInjector;

  private final MembersInjector<OtherLiabilityTypeNode>
      otherLiabilityTypeNodeInjectorMembersInjector;

  public OtherLiabilityNodeChildProvider_MembersInjector(
      MembersInjector<OtherLiabilityAmountOwningNode>
          otherLiabilityAmountOwningNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityBreakCostNode>
          otherLiabilityBreakCostNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityLimitAmountNode>
          otherLiabilityLimitAmountNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityMonthlyRepaymentNode>
          otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityClearingFlagNode>
          otherLiabilityClearingFlagNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityDescriptionNode>
          otherLiabilityDescriptionNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityTypeNode> otherLiabilityTypeNodeInjectorMembersInjector) {
    assert otherLiabilityAmountOwningNodeInjectorMembersInjector != null;
    this.otherLiabilityAmountOwningNodeInjectorMembersInjector =
        otherLiabilityAmountOwningNodeInjectorMembersInjector;
    assert otherLiabilityBreakCostNodeInjectorMembersInjector != null;
    this.otherLiabilityBreakCostNodeInjectorMembersInjector =
        otherLiabilityBreakCostNodeInjectorMembersInjector;
    assert otherLiabilityLimitAmountNodeInjectorMembersInjector != null;
    this.otherLiabilityLimitAmountNodeInjectorMembersInjector =
        otherLiabilityLimitAmountNodeInjectorMembersInjector;
    assert otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector != null;
    this.otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector =
        otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector;
    assert otherLiabilityClearingFlagNodeInjectorMembersInjector != null;
    this.otherLiabilityClearingFlagNodeInjectorMembersInjector =
        otherLiabilityClearingFlagNodeInjectorMembersInjector;
    assert otherLiabilityDescriptionNodeInjectorMembersInjector != null;
    this.otherLiabilityDescriptionNodeInjectorMembersInjector =
        otherLiabilityDescriptionNodeInjectorMembersInjector;
    assert otherLiabilityTypeNodeInjectorMembersInjector != null;
    this.otherLiabilityTypeNodeInjectorMembersInjector =
        otherLiabilityTypeNodeInjectorMembersInjector;
  }

  public static MembersInjector<OtherLiabilityNodeChildProvider> create(
      MembersInjector<OtherLiabilityAmountOwningNode>
          otherLiabilityAmountOwningNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityBreakCostNode>
          otherLiabilityBreakCostNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityLimitAmountNode>
          otherLiabilityLimitAmountNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityMonthlyRepaymentNode>
          otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityClearingFlagNode>
          otherLiabilityClearingFlagNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityDescriptionNode>
          otherLiabilityDescriptionNodeInjectorMembersInjector,
      MembersInjector<OtherLiabilityTypeNode> otherLiabilityTypeNodeInjectorMembersInjector) {
    return new OtherLiabilityNodeChildProvider_MembersInjector(
        otherLiabilityAmountOwningNodeInjectorMembersInjector,
        otherLiabilityBreakCostNodeInjectorMembersInjector,
        otherLiabilityLimitAmountNodeInjectorMembersInjector,
        otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector,
        otherLiabilityClearingFlagNodeInjectorMembersInjector,
        otherLiabilityDescriptionNodeInjectorMembersInjector,
        otherLiabilityTypeNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OtherLiabilityNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherLiabilityAmountOwningNodeInjector =
        otherLiabilityAmountOwningNodeInjectorMembersInjector;
    instance.otherLiabilityBreakCostNodeInjector =
        otherLiabilityBreakCostNodeInjectorMembersInjector;
    instance.otherLiabilityLimitAmountNodeInjector =
        otherLiabilityLimitAmountNodeInjectorMembersInjector;
    instance.otherLiabilityMonthlyRepaymentNodeInjector =
        otherLiabilityMonthlyRepaymentNodeInjectorMembersInjector;
    instance.otherLiabilityClearingFlagNodeInjector =
        otherLiabilityClearingFlagNodeInjectorMembersInjector;
    instance.otherLiabilityDescriptionNodeInjector =
        otherLiabilityDescriptionNodeInjectorMembersInjector;
    instance.otherLiabilityTypeNodeInjector = otherLiabilityTypeNodeInjectorMembersInjector;
  }

  public static void injectOtherLiabilityAmountOwningNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityAmountOwningNode> otherLiabilityAmountOwningNodeInjector) {
    instance.otherLiabilityAmountOwningNodeInjector = otherLiabilityAmountOwningNodeInjector;
  }

  public static void injectOtherLiabilityBreakCostNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityBreakCostNode> otherLiabilityBreakCostNodeInjector) {
    instance.otherLiabilityBreakCostNodeInjector = otherLiabilityBreakCostNodeInjector;
  }

  public static void injectOtherLiabilityLimitAmountNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityLimitAmountNode> otherLiabilityLimitAmountNodeInjector) {
    instance.otherLiabilityLimitAmountNodeInjector = otherLiabilityLimitAmountNodeInjector;
  }

  public static void injectOtherLiabilityMonthlyRepaymentNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityMonthlyRepaymentNode>
          otherLiabilityMonthlyRepaymentNodeInjector) {
    instance.otherLiabilityMonthlyRepaymentNodeInjector =
        otherLiabilityMonthlyRepaymentNodeInjector;
  }

  public static void injectOtherLiabilityClearingFlagNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityClearingFlagNode> otherLiabilityClearingFlagNodeInjector) {
    instance.otherLiabilityClearingFlagNodeInjector = otherLiabilityClearingFlagNodeInjector;
  }

  public static void injectOtherLiabilityDescriptionNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityDescriptionNode> otherLiabilityDescriptionNodeInjector) {
    instance.otherLiabilityDescriptionNodeInjector = otherLiabilityDescriptionNodeInjector;
  }

  public static void injectOtherLiabilityTypeNodeInjector(
      OtherLiabilityNodeChildProvider instance,
      MembersInjector<OtherLiabilityTypeNode> otherLiabilityTypeNodeInjector) {
    instance.otherLiabilityTypeNodeInjector = otherLiabilityTypeNodeInjector;
  }
}
