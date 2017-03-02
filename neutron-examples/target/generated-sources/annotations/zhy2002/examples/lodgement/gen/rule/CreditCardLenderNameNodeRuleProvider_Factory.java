package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLenderNameNodeRuleProvider_Factory
    implements Factory<CreditCardLenderNameNodeRuleProvider> {
  private final MembersInjector<CreditCardLenderNameNodeRuleProvider>
      creditCardLenderNameNodeRuleProviderMembersInjector;

  public CreditCardLenderNameNodeRuleProvider_Factory(
      MembersInjector<CreditCardLenderNameNodeRuleProvider>
          creditCardLenderNameNodeRuleProviderMembersInjector) {
    assert creditCardLenderNameNodeRuleProviderMembersInjector != null;
    this.creditCardLenderNameNodeRuleProviderMembersInjector =
        creditCardLenderNameNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardLenderNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardLenderNameNodeRuleProviderMembersInjector,
        new CreditCardLenderNameNodeRuleProvider());
  }

  public static Factory<CreditCardLenderNameNodeRuleProvider> create(
      MembersInjector<CreditCardLenderNameNodeRuleProvider>
          creditCardLenderNameNodeRuleProviderMembersInjector) {
    return new CreditCardLenderNameNodeRuleProvider_Factory(
        creditCardLenderNameNodeRuleProviderMembersInjector);
  }
}
