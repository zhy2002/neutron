package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageClearingFlagNodeRuleProvider_Factory
    implements Factory<MortgageClearingFlagNodeRuleProvider> {
  private final MembersInjector<MortgageClearingFlagNodeRuleProvider>
      mortgageClearingFlagNodeRuleProviderMembersInjector;

  public MortgageClearingFlagNodeRuleProvider_Factory(
      MembersInjector<MortgageClearingFlagNodeRuleProvider>
          mortgageClearingFlagNodeRuleProviderMembersInjector) {
    assert mortgageClearingFlagNodeRuleProviderMembersInjector != null;
    this.mortgageClearingFlagNodeRuleProviderMembersInjector =
        mortgageClearingFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageClearingFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageClearingFlagNodeRuleProviderMembersInjector,
        new MortgageClearingFlagNodeRuleProvider());
  }

  public static Factory<MortgageClearingFlagNodeRuleProvider> create(
      MembersInjector<MortgageClearingFlagNodeRuleProvider>
          mortgageClearingFlagNodeRuleProviderMembersInjector) {
    return new MortgageClearingFlagNodeRuleProvider_Factory(
        mortgageClearingFlagNodeRuleProviderMembersInjector);
  }
}
