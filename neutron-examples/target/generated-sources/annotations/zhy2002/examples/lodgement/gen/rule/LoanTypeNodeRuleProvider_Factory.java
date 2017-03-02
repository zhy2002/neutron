package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanTypeNodeRuleProvider_Factory implements Factory<LoanTypeNodeRuleProvider> {
  private final MembersInjector<LoanTypeNodeRuleProvider> loanTypeNodeRuleProviderMembersInjector;

  public LoanTypeNodeRuleProvider_Factory(
      MembersInjector<LoanTypeNodeRuleProvider> loanTypeNodeRuleProviderMembersInjector) {
    assert loanTypeNodeRuleProviderMembersInjector != null;
    this.loanTypeNodeRuleProviderMembersInjector = loanTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanTypeNodeRuleProviderMembersInjector, new LoanTypeNodeRuleProvider());
  }

  public static Factory<LoanTypeNodeRuleProvider> create(
      MembersInjector<LoanTypeNodeRuleProvider> loanTypeNodeRuleProviderMembersInjector) {
    return new LoanTypeNodeRuleProvider_Factory(loanTypeNodeRuleProviderMembersInjector);
  }
}
