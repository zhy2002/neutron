package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityBreakCostNodeRuleProvider_Factory
    implements Factory<OtherLiabilityBreakCostNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityBreakCostNodeRuleProvider>
      otherLiabilityBreakCostNodeRuleProviderMembersInjector;

  public OtherLiabilityBreakCostNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityBreakCostNodeRuleProvider>
          otherLiabilityBreakCostNodeRuleProviderMembersInjector) {
    assert otherLiabilityBreakCostNodeRuleProviderMembersInjector != null;
    this.otherLiabilityBreakCostNodeRuleProviderMembersInjector =
        otherLiabilityBreakCostNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityBreakCostNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityBreakCostNodeRuleProviderMembersInjector,
        new OtherLiabilityBreakCostNodeRuleProvider());
  }

  public static Factory<OtherLiabilityBreakCostNodeRuleProvider> create(
      MembersInjector<OtherLiabilityBreakCostNodeRuleProvider>
          otherLiabilityBreakCostNodeRuleProviderMembersInjector) {
    return new OtherLiabilityBreakCostNodeRuleProvider_Factory(
        otherLiabilityBreakCostNodeRuleProviderMembersInjector);
  }
}
