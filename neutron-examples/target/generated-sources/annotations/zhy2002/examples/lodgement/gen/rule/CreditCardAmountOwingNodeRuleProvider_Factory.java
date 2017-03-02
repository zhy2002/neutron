package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardAmountOwingNodeRuleProvider_Factory
    implements Factory<CreditCardAmountOwingNodeRuleProvider> {
  private final MembersInjector<CreditCardAmountOwingNodeRuleProvider>
      creditCardAmountOwingNodeRuleProviderMembersInjector;

  public CreditCardAmountOwingNodeRuleProvider_Factory(
      MembersInjector<CreditCardAmountOwingNodeRuleProvider>
          creditCardAmountOwingNodeRuleProviderMembersInjector) {
    assert creditCardAmountOwingNodeRuleProviderMembersInjector != null;
    this.creditCardAmountOwingNodeRuleProviderMembersInjector =
        creditCardAmountOwingNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardAmountOwingNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardAmountOwingNodeRuleProviderMembersInjector,
        new CreditCardAmountOwingNodeRuleProvider());
  }

  public static Factory<CreditCardAmountOwingNodeRuleProvider> create(
      MembersInjector<CreditCardAmountOwingNodeRuleProvider>
          creditCardAmountOwingNodeRuleProviderMembersInjector) {
    return new CreditCardAmountOwingNodeRuleProvider_Factory(
        creditCardAmountOwingNodeRuleProviderMembersInjector);
  }
}
