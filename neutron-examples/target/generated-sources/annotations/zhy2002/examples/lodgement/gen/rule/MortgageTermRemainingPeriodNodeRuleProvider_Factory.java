package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageTermRemainingPeriodNodeRuleProvider_Factory
    implements Factory<MortgageTermRemainingPeriodNodeRuleProvider> {
  private final MembersInjector<MortgageTermRemainingPeriodNodeRuleProvider>
      mortgageTermRemainingPeriodNodeRuleProviderMembersInjector;

  public MortgageTermRemainingPeriodNodeRuleProvider_Factory(
      MembersInjector<MortgageTermRemainingPeriodNodeRuleProvider>
          mortgageTermRemainingPeriodNodeRuleProviderMembersInjector) {
    assert mortgageTermRemainingPeriodNodeRuleProviderMembersInjector != null;
    this.mortgageTermRemainingPeriodNodeRuleProviderMembersInjector =
        mortgageTermRemainingPeriodNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageTermRemainingPeriodNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageTermRemainingPeriodNodeRuleProviderMembersInjector,
        new MortgageTermRemainingPeriodNodeRuleProvider());
  }

  public static Factory<MortgageTermRemainingPeriodNodeRuleProvider> create(
      MembersInjector<MortgageTermRemainingPeriodNodeRuleProvider>
          mortgageTermRemainingPeriodNodeRuleProviderMembersInjector) {
    return new MortgageTermRemainingPeriodNodeRuleProvider_Factory(
        mortgageTermRemainingPeriodNodeRuleProviderMembersInjector);
  }
}
