package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardBreakCostNodeRuleProvider_Factory
    implements Factory<CreditCardBreakCostNodeRuleProvider> {
  private final MembersInjector<CreditCardBreakCostNodeRuleProvider>
      creditCardBreakCostNodeRuleProviderMembersInjector;

  public CreditCardBreakCostNodeRuleProvider_Factory(
      MembersInjector<CreditCardBreakCostNodeRuleProvider>
          creditCardBreakCostNodeRuleProviderMembersInjector) {
    assert creditCardBreakCostNodeRuleProviderMembersInjector != null;
    this.creditCardBreakCostNodeRuleProviderMembersInjector =
        creditCardBreakCostNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardBreakCostNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardBreakCostNodeRuleProviderMembersInjector,
        new CreditCardBreakCostNodeRuleProvider());
  }

  public static Factory<CreditCardBreakCostNodeRuleProvider> create(
      MembersInjector<CreditCardBreakCostNodeRuleProvider>
          creditCardBreakCostNodeRuleProviderMembersInjector) {
    return new CreditCardBreakCostNodeRuleProvider_Factory(
        creditCardBreakCostNodeRuleProviderMembersInjector);
  }
}
