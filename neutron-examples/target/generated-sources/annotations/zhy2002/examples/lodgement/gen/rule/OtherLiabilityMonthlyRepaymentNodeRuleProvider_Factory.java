package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityMonthlyRepaymentNodeRuleProvider_Factory
    implements Factory<OtherLiabilityMonthlyRepaymentNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityMonthlyRepaymentNodeRuleProvider>
      otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector;

  public OtherLiabilityMonthlyRepaymentNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityMonthlyRepaymentNodeRuleProvider>
          otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector) {
    assert otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector != null;
    this.otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector =
        otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityMonthlyRepaymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector,
        new OtherLiabilityMonthlyRepaymentNodeRuleProvider());
  }

  public static Factory<OtherLiabilityMonthlyRepaymentNodeRuleProvider> create(
      MembersInjector<OtherLiabilityMonthlyRepaymentNodeRuleProvider>
          otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector) {
    return new OtherLiabilityMonthlyRepaymentNodeRuleProvider_Factory(
        otherLiabilityMonthlyRepaymentNodeRuleProviderMembersInjector);
  }
}
