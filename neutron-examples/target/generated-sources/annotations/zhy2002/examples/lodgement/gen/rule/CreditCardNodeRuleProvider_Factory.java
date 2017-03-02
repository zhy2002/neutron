package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardNodeRuleProvider_Factory
    implements Factory<CreditCardNodeRuleProvider> {
  private final MembersInjector<CreditCardNodeRuleProvider>
      creditCardNodeRuleProviderMembersInjector;

  public CreditCardNodeRuleProvider_Factory(
      MembersInjector<CreditCardNodeRuleProvider> creditCardNodeRuleProviderMembersInjector) {
    assert creditCardNodeRuleProviderMembersInjector != null;
    this.creditCardNodeRuleProviderMembersInjector = creditCardNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardNodeRuleProviderMembersInjector, new CreditCardNodeRuleProvider());
  }

  public static Factory<CreditCardNodeRuleProvider> create(
      MembersInjector<CreditCardNodeRuleProvider> creditCardNodeRuleProviderMembersInjector) {
    return new CreditCardNodeRuleProvider_Factory(creditCardNodeRuleProviderMembersInjector);
  }
}
