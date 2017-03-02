package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanMonthlyRepaymentNodeRuleProvider_Factory
    implements Factory<LoanMonthlyRepaymentNodeRuleProvider> {
  private final MembersInjector<LoanMonthlyRepaymentNodeRuleProvider>
      loanMonthlyRepaymentNodeRuleProviderMembersInjector;

  public LoanMonthlyRepaymentNodeRuleProvider_Factory(
      MembersInjector<LoanMonthlyRepaymentNodeRuleProvider>
          loanMonthlyRepaymentNodeRuleProviderMembersInjector) {
    assert loanMonthlyRepaymentNodeRuleProviderMembersInjector != null;
    this.loanMonthlyRepaymentNodeRuleProviderMembersInjector =
        loanMonthlyRepaymentNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanMonthlyRepaymentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanMonthlyRepaymentNodeRuleProviderMembersInjector,
        new LoanMonthlyRepaymentNodeRuleProvider());
  }

  public static Factory<LoanMonthlyRepaymentNodeRuleProvider> create(
      MembersInjector<LoanMonthlyRepaymentNodeRuleProvider>
          loanMonthlyRepaymentNodeRuleProviderMembersInjector) {
    return new LoanMonthlyRepaymentNodeRuleProvider_Factory(
        loanMonthlyRepaymentNodeRuleProviderMembersInjector);
  }
}
