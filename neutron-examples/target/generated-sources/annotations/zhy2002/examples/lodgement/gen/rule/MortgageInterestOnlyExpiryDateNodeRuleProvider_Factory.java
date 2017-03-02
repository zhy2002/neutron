package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageInterestOnlyExpiryDateNodeRuleProvider_Factory
    implements Factory<MortgageInterestOnlyExpiryDateNodeRuleProvider> {
  private final MembersInjector<MortgageInterestOnlyExpiryDateNodeRuleProvider>
      mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector;

  public MortgageInterestOnlyExpiryDateNodeRuleProvider_Factory(
      MembersInjector<MortgageInterestOnlyExpiryDateNodeRuleProvider>
          mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector) {
    assert mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector != null;
    this.mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector =
        mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageInterestOnlyExpiryDateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector,
        new MortgageInterestOnlyExpiryDateNodeRuleProvider());
  }

  public static Factory<MortgageInterestOnlyExpiryDateNodeRuleProvider> create(
      MembersInjector<MortgageInterestOnlyExpiryDateNodeRuleProvider>
          mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector) {
    return new MortgageInterestOnlyExpiryDateNodeRuleProvider_Factory(
        mortgageInterestOnlyExpiryDateNodeRuleProviderMembersInjector);
  }
}
