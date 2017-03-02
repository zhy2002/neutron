package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardTypeNodeRuleProvider_Factory
    implements Factory<CreditCardTypeNodeRuleProvider> {
  private final MembersInjector<CreditCardTypeNodeRuleProvider>
      creditCardTypeNodeRuleProviderMembersInjector;

  public CreditCardTypeNodeRuleProvider_Factory(
      MembersInjector<CreditCardTypeNodeRuleProvider>
          creditCardTypeNodeRuleProviderMembersInjector) {
    assert creditCardTypeNodeRuleProviderMembersInjector != null;
    this.creditCardTypeNodeRuleProviderMembersInjector =
        creditCardTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardTypeNodeRuleProviderMembersInjector, new CreditCardTypeNodeRuleProvider());
  }

  public static Factory<CreditCardTypeNodeRuleProvider> create(
      MembersInjector<CreditCardTypeNodeRuleProvider>
          creditCardTypeNodeRuleProviderMembersInjector) {
    return new CreditCardTypeNodeRuleProvider_Factory(
        creditCardTypeNodeRuleProviderMembersInjector);
  }
}
