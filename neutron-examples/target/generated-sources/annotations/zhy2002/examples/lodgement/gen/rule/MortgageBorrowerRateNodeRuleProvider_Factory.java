package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBorrowerRateNodeRuleProvider_Factory
    implements Factory<MortgageBorrowerRateNodeRuleProvider> {
  private final MembersInjector<MortgageBorrowerRateNodeRuleProvider>
      mortgageBorrowerRateNodeRuleProviderMembersInjector;

  public MortgageBorrowerRateNodeRuleProvider_Factory(
      MembersInjector<MortgageBorrowerRateNodeRuleProvider>
          mortgageBorrowerRateNodeRuleProviderMembersInjector) {
    assert mortgageBorrowerRateNodeRuleProviderMembersInjector != null;
    this.mortgageBorrowerRateNodeRuleProviderMembersInjector =
        mortgageBorrowerRateNodeRuleProviderMembersInjector;
  }

  @Override
  public MortgageBorrowerRateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        mortgageBorrowerRateNodeRuleProviderMembersInjector,
        new MortgageBorrowerRateNodeRuleProvider());
  }

  public static Factory<MortgageBorrowerRateNodeRuleProvider> create(
      MembersInjector<MortgageBorrowerRateNodeRuleProvider>
          mortgageBorrowerRateNodeRuleProviderMembersInjector) {
    return new MortgageBorrowerRateNodeRuleProvider_Factory(
        mortgageBorrowerRateNodeRuleProviderMembersInjector);
  }
}
