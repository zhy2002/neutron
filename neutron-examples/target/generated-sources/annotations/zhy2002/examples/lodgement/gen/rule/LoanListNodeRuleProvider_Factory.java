package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNodeRuleProvider_Factory implements Factory<LoanListNodeRuleProvider> {
  private final MembersInjector<LoanListNodeRuleProvider> loanListNodeRuleProviderMembersInjector;

  public LoanListNodeRuleProvider_Factory(
      MembersInjector<LoanListNodeRuleProvider> loanListNodeRuleProviderMembersInjector) {
    assert loanListNodeRuleProviderMembersInjector != null;
    this.loanListNodeRuleProviderMembersInjector = loanListNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanListNodeRuleProviderMembersInjector, new LoanListNodeRuleProvider());
  }

  public static Factory<LoanListNodeRuleProvider> create(
      MembersInjector<LoanListNodeRuleProvider> loanListNodeRuleProviderMembersInjector) {
    return new LoanListNodeRuleProvider_Factory(loanListNodeRuleProviderMembersInjector);
  }
}
