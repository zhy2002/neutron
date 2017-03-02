package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNodeRuleProvider_Factory implements Factory<LoanNodeRuleProvider> {
  private final MembersInjector<LoanNodeRuleProvider> loanNodeRuleProviderMembersInjector;

  public LoanNodeRuleProvider_Factory(
      MembersInjector<LoanNodeRuleProvider> loanNodeRuleProviderMembersInjector) {
    assert loanNodeRuleProviderMembersInjector != null;
    this.loanNodeRuleProviderMembersInjector = loanNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanNodeRuleProviderMembersInjector, new LoanNodeRuleProvider());
  }

  public static Factory<LoanNodeRuleProvider> create(
      MembersInjector<LoanNodeRuleProvider> loanNodeRuleProviderMembersInjector) {
    return new LoanNodeRuleProvider_Factory(loanNodeRuleProviderMembersInjector);
  }
}
