package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageInterestOnlyRemainingPeriodNodeRuleProvider_Factory
    implements Factory<MortgageInterestOnlyRemainingPeriodNodeRuleProvider> {
  private final MembersInjector<MortgageInterestOnlyRemainingPeriodNodeRuleProvider>
      mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector;

  public MortgageInterestOnlyRemainingPeriodNodeRuleProvider_Factory(
      MembersInjector<MortgageInterestOnlyRemainingPeriodNodeRuleProvider>
          mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector) {
    assert mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector != null;
    this.mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector =
        mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageInterestOnlyRemainingPeriodNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector,
        new MortgageInterestOnlyRemainingPeriodNodeRuleProvider());
  }

  public static Factory<MortgageInterestOnlyRemainingPeriodNodeRuleProvider> create(
      MembersInjector<MortgageInterestOnlyRemainingPeriodNodeRuleProvider>
          mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector) {
    return new MortgageInterestOnlyRemainingPeriodNodeRuleProvider_Factory(
        mortgageInterestOnlyRemainingPeriodNodeRuleProviderMembersInjector);
  }
}
