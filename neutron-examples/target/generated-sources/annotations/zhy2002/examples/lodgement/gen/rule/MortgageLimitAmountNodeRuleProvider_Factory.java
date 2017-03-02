package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNodeRuleProvider_Factory
    implements Factory<MortgageLimitAmountNodeRuleProvider> {
  private final MembersInjector<MortgageLimitAmountNodeRuleProvider>
      mortgageLimitAmountNodeRuleProviderMembersInjector;

  public MortgageLimitAmountNodeRuleProvider_Factory(
      MembersInjector<MortgageLimitAmountNodeRuleProvider>
          mortgageLimitAmountNodeRuleProviderMembersInjector) {
    assert mortgageLimitAmountNodeRuleProviderMembersInjector != null;
    this.mortgageLimitAmountNodeRuleProviderMembersInjector =
        mortgageLimitAmountNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageLimitAmountNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageLimitAmountNodeRuleProviderMembersInjector,
        new MortgageLimitAmountNodeRuleProvider());
  }

  public static Factory<MortgageLimitAmountNodeRuleProvider> create(
      MembersInjector<MortgageLimitAmountNodeRuleProvider>
          mortgageLimitAmountNodeRuleProviderMembersInjector) {
    return new MortgageLimitAmountNodeRuleProvider_Factory(
        mortgageLimitAmountNodeRuleProviderMembersInjector);
  }
}
