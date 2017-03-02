package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLenderNameNodeRuleProvider_Factory
    implements Factory<LoanLenderNameNodeRuleProvider> {
  private final MembersInjector<LoanLenderNameNodeRuleProvider>
      loanLenderNameNodeRuleProviderMembersInjector;

  public LoanLenderNameNodeRuleProvider_Factory(
      MembersInjector<LoanLenderNameNodeRuleProvider>
          loanLenderNameNodeRuleProviderMembersInjector) {
    assert loanLenderNameNodeRuleProviderMembersInjector != null;
    this.loanLenderNameNodeRuleProviderMembersInjector =
        loanLenderNameNodeRuleProviderMembersInjector;
  }

  @Override
  public LoanLenderNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        loanLenderNameNodeRuleProviderMembersInjector, new LoanLenderNameNodeRuleProvider());
  }

  public static Factory<LoanLenderNameNodeRuleProvider> create(
      MembersInjector<LoanLenderNameNodeRuleProvider>
          loanLenderNameNodeRuleProviderMembersInjector) {
    return new LoanLenderNameNodeRuleProvider_Factory(
        loanLenderNameNodeRuleProviderMembersInjector);
  }
}
