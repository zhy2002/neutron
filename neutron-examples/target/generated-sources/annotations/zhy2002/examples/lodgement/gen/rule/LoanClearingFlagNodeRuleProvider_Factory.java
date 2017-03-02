package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanClearingFlagNodeRuleProvider_Factory
    implements Factory<LoanClearingFlagNodeRuleProvider> {
  private final MembersInjector<LoanClearingFlagNodeRuleProvider>
      loanClearingFlagNodeRuleProviderMembersInjector;

  public LoanClearingFlagNodeRuleProvider_Factory(
      MembersInjector<LoanClearingFlagNodeRuleProvider>
          loanClearingFlagNodeRuleProviderMembersInjector) {
    assert loanClearingFlagNodeRuleProviderMembersInjector != null;
    this.loanClearingFlagNodeRuleProviderMembersInjector =
        loanClearingFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanClearingFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanClearingFlagNodeRuleProviderMembersInjector, new LoanClearingFlagNodeRuleProvider());
  }

  public static Factory<LoanClearingFlagNodeRuleProvider> create(
      MembersInjector<LoanClearingFlagNodeRuleProvider>
          loanClearingFlagNodeRuleProviderMembersInjector) {
    return new LoanClearingFlagNodeRuleProvider_Factory(
        loanClearingFlagNodeRuleProviderMembersInjector);
  }
}
