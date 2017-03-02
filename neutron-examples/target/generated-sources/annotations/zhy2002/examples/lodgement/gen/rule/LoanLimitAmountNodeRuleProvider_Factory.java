package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLimitAmountNodeRuleProvider_Factory
    implements Factory<LoanLimitAmountNodeRuleProvider> {
  private final MembersInjector<LoanLimitAmountNodeRuleProvider>
      loanLimitAmountNodeRuleProviderMembersInjector;

  public LoanLimitAmountNodeRuleProvider_Factory(
      MembersInjector<LoanLimitAmountNodeRuleProvider>
          loanLimitAmountNodeRuleProviderMembersInjector) {
    assert loanLimitAmountNodeRuleProviderMembersInjector != null;
    this.loanLimitAmountNodeRuleProviderMembersInjector =
        loanLimitAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanLimitAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanLimitAmountNodeRuleProviderMembersInjector, new LoanLimitAmountNodeRuleProvider());
  }

  public static Factory<LoanLimitAmountNodeRuleProvider> create(
      MembersInjector<LoanLimitAmountNodeRuleProvider>
          loanLimitAmountNodeRuleProviderMembersInjector) {
    return new LoanLimitAmountNodeRuleProvider_Factory(
        loanLimitAmountNodeRuleProviderMembersInjector);
  }
}
