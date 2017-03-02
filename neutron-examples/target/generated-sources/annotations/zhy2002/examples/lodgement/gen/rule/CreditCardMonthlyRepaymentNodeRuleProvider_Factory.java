package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardMonthlyRepaymentNodeRuleProvider_Factory
    implements Factory<CreditCardMonthlyRepaymentNodeRuleProvider> {
  private final MembersInjector<CreditCardMonthlyRepaymentNodeRuleProvider>
      creditCardMonthlyRepaymentNodeRuleProviderMembersInjector;

  public CreditCardMonthlyRepaymentNodeRuleProvider_Factory(
      MembersInjector<CreditCardMonthlyRepaymentNodeRuleProvider>
          creditCardMonthlyRepaymentNodeRuleProviderMembersInjector) {
    assert creditCardMonthlyRepaymentNodeRuleProviderMembersInjector != null;
    this.creditCardMonthlyRepaymentNodeRuleProviderMembersInjector =
        creditCardMonthlyRepaymentNodeRuleProviderMembersInjector;
  }

  @Override
  public CreditCardMonthlyRepaymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        creditCardMonthlyRepaymentNodeRuleProviderMembersInjector,
        new CreditCardMonthlyRepaymentNodeRuleProvider());
  }

  public static Factory<CreditCardMonthlyRepaymentNodeRuleProvider> create(
      MembersInjector<CreditCardMonthlyRepaymentNodeRuleProvider>
          creditCardMonthlyRepaymentNodeRuleProviderMembersInjector) {
    return new CreditCardMonthlyRepaymentNodeRuleProvider_Factory(
        creditCardMonthlyRepaymentNodeRuleProviderMembersInjector);
  }
}
