package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityClearingFlagNodeRuleProvider_Factory
    implements Factory<OtherLiabilityClearingFlagNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityClearingFlagNodeRuleProvider>
      otherLiabilityClearingFlagNodeRuleProviderMembersInjector;

  public OtherLiabilityClearingFlagNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityClearingFlagNodeRuleProvider>
          otherLiabilityClearingFlagNodeRuleProviderMembersInjector) {
    assert otherLiabilityClearingFlagNodeRuleProviderMembersInjector != null;
    this.otherLiabilityClearingFlagNodeRuleProviderMembersInjector =
        otherLiabilityClearingFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityClearingFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityClearingFlagNodeRuleProviderMembersInjector,
        new OtherLiabilityClearingFlagNodeRuleProvider());
  }

  public static Factory<OtherLiabilityClearingFlagNodeRuleProvider> create(
      MembersInjector<OtherLiabilityClearingFlagNodeRuleProvider>
          otherLiabilityClearingFlagNodeRuleProviderMembersInjector) {
    return new OtherLiabilityClearingFlagNodeRuleProvider_Factory(
        otherLiabilityClearingFlagNodeRuleProviderMembersInjector);
  }
}
