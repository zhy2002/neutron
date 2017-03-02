package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SettlementDateNodeRuleProvider_Factory
    implements Factory<SettlementDateNodeRuleProvider> {
  private final MembersInjector<SettlementDateNodeRuleProvider>
      settlementDateNodeRuleProviderMembersInjector;

  public SettlementDateNodeRuleProvider_Factory(
      MembersInjector<SettlementDateNodeRuleProvider>
          settlementDateNodeRuleProviderMembersInjector) {
    assert settlementDateNodeRuleProviderMembersInjector != null;
    this.settlementDateNodeRuleProviderMembersInjector =
        settlementDateNodeRuleProviderMembersInjector;
  }

  @Override
  public SettlementDateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        settlementDateNodeRuleProviderMembersInjector, new SettlementDateNodeRuleProvider());
  }

  public static Factory<SettlementDateNodeRuleProvider> create(
      MembersInjector<SettlementDateNodeRuleProvider>
          settlementDateNodeRuleProviderMembersInjector) {
    return new SettlementDateNodeRuleProvider_Factory(
        settlementDateNodeRuleProviderMembersInjector);
  }
}
