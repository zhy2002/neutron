package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionNodeChildProvider_MembersInjector
    implements MembersInjector<FinancialPositionNodeChildProvider> {
  private final MembersInjector<TotalLiabilityNode> totalLiabilityNodeInjectorMembersInjector;

  private final MembersInjector<TotalAssetNode> totalAssetNodeInjectorMembersInjector;

  private final MembersInjector<TotalExpenseNode> totalExpenseNodeInjectorMembersInjector;

  private final MembersInjector<ExpenseListNode> expenseListNodeInjectorMembersInjector;

  private final MembersInjector<LiabilitiesNode> liabilitiesNodeInjectorMembersInjector;

  private final MembersInjector<AssetsNode> assetsNodeInjectorMembersInjector;

  public FinancialPositionNodeChildProvider_MembersInjector(
      MembersInjector<TotalLiabilityNode> totalLiabilityNodeInjectorMembersInjector,
      MembersInjector<TotalAssetNode> totalAssetNodeInjectorMembersInjector,
      MembersInjector<TotalExpenseNode> totalExpenseNodeInjectorMembersInjector,
      MembersInjector<ExpenseListNode> expenseListNodeInjectorMembersInjector,
      MembersInjector<LiabilitiesNode> liabilitiesNodeInjectorMembersInjector,
      MembersInjector<AssetsNode> assetsNodeInjectorMembersInjector) {
    assert totalLiabilityNodeInjectorMembersInjector != null;
    this.totalLiabilityNodeInjectorMembersInjector = totalLiabilityNodeInjectorMembersInjector;
    assert totalAssetNodeInjectorMembersInjector != null;
    this.totalAssetNodeInjectorMembersInjector = totalAssetNodeInjectorMembersInjector;
    assert totalExpenseNodeInjectorMembersInjector != null;
    this.totalExpenseNodeInjectorMembersInjector = totalExpenseNodeInjectorMembersInjector;
    assert expenseListNodeInjectorMembersInjector != null;
    this.expenseListNodeInjectorMembersInjector = expenseListNodeInjectorMembersInjector;
    assert liabilitiesNodeInjectorMembersInjector != null;
    this.liabilitiesNodeInjectorMembersInjector = liabilitiesNodeInjectorMembersInjector;
    assert assetsNodeInjectorMembersInjector != null;
    this.assetsNodeInjectorMembersInjector = assetsNodeInjectorMembersInjector;
  }

  public static MembersInjector<FinancialPositionNodeChildProvider> create(
      MembersInjector<TotalLiabilityNode> totalLiabilityNodeInjectorMembersInjector,
      MembersInjector<TotalAssetNode> totalAssetNodeInjectorMembersInjector,
      MembersInjector<TotalExpenseNode> totalExpenseNodeInjectorMembersInjector,
      MembersInjector<ExpenseListNode> expenseListNodeInjectorMembersInjector,
      MembersInjector<LiabilitiesNode> liabilitiesNodeInjectorMembersInjector,
      MembersInjector<AssetsNode> assetsNodeInjectorMembersInjector) {
    return new FinancialPositionNodeChildProvider_MembersInjector(
        totalLiabilityNodeInjectorMembersInjector,
        totalAssetNodeInjectorMembersInjector,
        totalExpenseNodeInjectorMembersInjector,
        expenseListNodeInjectorMembersInjector,
        liabilitiesNodeInjectorMembersInjector,
        assetsNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(FinancialPositionNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.totalLiabilityNodeInjector = totalLiabilityNodeInjectorMembersInjector;
    instance.totalAssetNodeInjector = totalAssetNodeInjectorMembersInjector;
    instance.totalExpenseNodeInjector = totalExpenseNodeInjectorMembersInjector;
    instance.expenseListNodeInjector = expenseListNodeInjectorMembersInjector;
    instance.liabilitiesNodeInjector = liabilitiesNodeInjectorMembersInjector;
    instance.assetsNodeInjector = assetsNodeInjectorMembersInjector;
  }

  public static void injectTotalLiabilityNodeInjector(
      FinancialPositionNodeChildProvider instance,
      MembersInjector<TotalLiabilityNode> totalLiabilityNodeInjector) {
    instance.totalLiabilityNodeInjector = totalLiabilityNodeInjector;
  }

  public static void injectTotalAssetNodeInjector(
      FinancialPositionNodeChildProvider instance,
      MembersInjector<TotalAssetNode> totalAssetNodeInjector) {
    instance.totalAssetNodeInjector = totalAssetNodeInjector;
  }

  public static void injectTotalExpenseNodeInjector(
      FinancialPositionNodeChildProvider instance,
      MembersInjector<TotalExpenseNode> totalExpenseNodeInjector) {
    instance.totalExpenseNodeInjector = totalExpenseNodeInjector;
  }

  public static void injectExpenseListNodeInjector(
      FinancialPositionNodeChildProvider instance,
      MembersInjector<ExpenseListNode> expenseListNodeInjector) {
    instance.expenseListNodeInjector = expenseListNodeInjector;
  }

  public static void injectLiabilitiesNodeInjector(
      FinancialPositionNodeChildProvider instance,
      MembersInjector<LiabilitiesNode> liabilitiesNodeInjector) {
    instance.liabilitiesNodeInjector = liabilitiesNodeInjector;
  }

  public static void injectAssetsNodeInjector(
      FinancialPositionNodeChildProvider instance, MembersInjector<AssetsNode> assetsNodeInjector) {
    instance.assetsNodeInjector = assetsNodeInjector;
  }
}
