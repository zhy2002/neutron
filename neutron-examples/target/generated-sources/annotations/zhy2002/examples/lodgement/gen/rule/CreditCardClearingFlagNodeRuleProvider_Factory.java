package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagNodeRuleProvider_Factory
    implements Factory<CreditCardClearingFlagNodeRuleProvider> {
  private final MembersInjector<CreditCardClearingFlagNodeRuleProvider>
      creditCardClearingFlagNodeRuleProviderMembersInjector;

  public CreditCardClearingFlagNodeRuleProvider_Factory(
      MembersInjector<CreditCardClearingFlagNodeRuleProvider>
          creditCardClearingFlagNodeRuleProviderMembersInjector) {
    assert creditCardClearingFlagNodeRuleProviderMembersInjector != null;
    this.creditCardClearingFlagNodeRuleProviderMembersInjector =
        creditCardClearingFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardClearingFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardClearingFlagNodeRuleProviderMembersInjector,
        new CreditCardClearingFlagNodeRuleProvider());
  }

  public static Factory<CreditCardClearingFlagNodeRuleProvider> create(
      MembersInjector<CreditCardClearingFlagNodeRuleProvider>
          creditCardClearingFlagNodeRuleProviderMembersInjector) {
    return new CreditCardClearingFlagNodeRuleProvider_Factory(
        creditCardClearingFlagNodeRuleProviderMembersInjector);
  }
}
