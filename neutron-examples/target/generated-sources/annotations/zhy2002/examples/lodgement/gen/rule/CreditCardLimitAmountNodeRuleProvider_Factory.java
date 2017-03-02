package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLimitAmountNodeRuleProvider_Factory
    implements Factory<CreditCardLimitAmountNodeRuleProvider> {
  private final MembersInjector<CreditCardLimitAmountNodeRuleProvider>
      creditCardLimitAmountNodeRuleProviderMembersInjector;

  public CreditCardLimitAmountNodeRuleProvider_Factory(
      MembersInjector<CreditCardLimitAmountNodeRuleProvider>
          creditCardLimitAmountNodeRuleProviderMembersInjector) {
    assert creditCardLimitAmountNodeRuleProviderMembersInjector != null;
    this.creditCardLimitAmountNodeRuleProviderMembersInjector =
        creditCardLimitAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardLimitAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardLimitAmountNodeRuleProviderMembersInjector,
        new CreditCardLimitAmountNodeRuleProvider());
  }

  public static Factory<CreditCardLimitAmountNodeRuleProvider> create(
      MembersInjector<CreditCardLimitAmountNodeRuleProvider>
          creditCardLimitAmountNodeRuleProviderMembersInjector) {
    return new CreditCardLimitAmountNodeRuleProvider_Factory(
        creditCardLimitAmountNodeRuleProviderMembersInjector);
  }
}
