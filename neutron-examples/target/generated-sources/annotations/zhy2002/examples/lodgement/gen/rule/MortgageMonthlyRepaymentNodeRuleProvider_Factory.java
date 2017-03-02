package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageMonthlyRepaymentNodeRuleProvider_Factory
    implements Factory<MortgageMonthlyRepaymentNodeRuleProvider> {
  private final MembersInjector<MortgageMonthlyRepaymentNodeRuleProvider>
      mortgageMonthlyRepaymentNodeRuleProviderMembersInjector;

  public MortgageMonthlyRepaymentNodeRuleProvider_Factory(
      MembersInjector<MortgageMonthlyRepaymentNodeRuleProvider>
          mortgageMonthlyRepaymentNodeRuleProviderMembersInjector) {
    assert mortgageMonthlyRepaymentNodeRuleProviderMembersInjector != null;
    this.mortgageMonthlyRepaymentNodeRuleProviderMembersInjector =
        mortgageMonthlyRepaymentNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageMonthlyRepaymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageMonthlyRepaymentNodeRuleProviderMembersInjector,
        new MortgageMonthlyRepaymentNodeRuleProvider());
  }

  public static Factory<MortgageMonthlyRepaymentNodeRuleProvider> create(
      MembersInjector<MortgageMonthlyRepaymentNodeRuleProvider>
          mortgageMonthlyRepaymentNodeRuleProviderMembersInjector) {
    return new MortgageMonthlyRepaymentNodeRuleProvider_Factory(
        mortgageMonthlyRepaymentNodeRuleProviderMembersInjector);
  }
}
