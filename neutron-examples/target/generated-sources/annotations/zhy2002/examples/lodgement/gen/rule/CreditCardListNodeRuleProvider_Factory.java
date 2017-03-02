package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardListNodeRuleProvider_Factory
    implements Factory<CreditCardListNodeRuleProvider> {
  private final MembersInjector<CreditCardListNodeRuleProvider>
      creditCardListNodeRuleProviderMembersInjector;

  public CreditCardListNodeRuleProvider_Factory(
      MembersInjector<CreditCardListNodeRuleProvider>
          creditCardListNodeRuleProviderMembersInjector) {
    assert creditCardListNodeRuleProviderMembersInjector != null;
    this.creditCardListNodeRuleProviderMembersInjector =
        creditCardListNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardListNodeRuleProviderMembersInjector, new CreditCardListNodeRuleProvider());
  }

  public static Factory<CreditCardListNodeRuleProvider> create(
      MembersInjector<CreditCardListNodeRuleProvider>
          creditCardListNodeRuleProviderMembersInjector) {
    return new CreditCardListNodeRuleProvider_Factory(
        creditCardListNodeRuleProviderMembersInjector);
  }
}
