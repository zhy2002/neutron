package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanBreakCostNodeRuleProvider_Factory
    implements Factory<LoanBreakCostNodeRuleProvider> {
  private final MembersInjector<LoanBreakCostNodeRuleProvider>
      loanBreakCostNodeRuleProviderMembersInjector;

  public LoanBreakCostNodeRuleProvider_Factory(
      MembersInjector<LoanBreakCostNodeRuleProvider> loanBreakCostNodeRuleProviderMembersInjector) {
    assert loanBreakCostNodeRuleProviderMembersInjector != null;
    this.loanBreakCostNodeRuleProviderMembersInjector =
        loanBreakCostNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanBreakCostNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanBreakCostNodeRuleProviderMembersInjector, new LoanBreakCostNodeRuleProvider());
  }

  public static Factory<LoanBreakCostNodeRuleProvider> create(
      MembersInjector<LoanBreakCostNodeRuleProvider> loanBreakCostNodeRuleProviderMembersInjector) {
    return new LoanBreakCostNodeRuleProvider_Factory(loanBreakCostNodeRuleProviderMembersInjector);
  }
}
