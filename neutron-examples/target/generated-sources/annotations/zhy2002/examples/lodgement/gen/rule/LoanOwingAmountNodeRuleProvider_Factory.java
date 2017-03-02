package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanOwingAmountNodeRuleProvider_Factory
    implements Factory<LoanOwingAmountNodeRuleProvider> {
  private final MembersInjector<LoanOwingAmountNodeRuleProvider>
      loanOwingAmountNodeRuleProviderMembersInjector;

  public LoanOwingAmountNodeRuleProvider_Factory(
      MembersInjector<LoanOwingAmountNodeRuleProvider>
          loanOwingAmountNodeRuleProviderMembersInjector) {
    assert loanOwingAmountNodeRuleProviderMembersInjector != null;
    this.loanOwingAmountNodeRuleProviderMembersInjector =
        loanOwingAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanOwingAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanOwingAmountNodeRuleProviderMembersInjector, new LoanOwingAmountNodeRuleProvider());
  }

  public static Factory<LoanOwingAmountNodeRuleProvider> create(
      MembersInjector<LoanOwingAmountNodeRuleProvider>
          loanOwingAmountNodeRuleProviderMembersInjector) {
    return new LoanOwingAmountNodeRuleProvider_Factory(
        loanOwingAmountNodeRuleProviderMembersInjector);
  }
}
