package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityNodeRuleProvider_Factory
    implements Factory<OtherLiabilityNodeRuleProvider> {
  private final MembersInjector<OtherLiabilityNodeRuleProvider>
      otherLiabilityNodeRuleProviderMembersInjector;

  public OtherLiabilityNodeRuleProvider_Factory(
      MembersInjector<OtherLiabilityNodeRuleProvider>
          otherLiabilityNodeRuleProviderMembersInjector) {
    assert otherLiabilityNodeRuleProviderMembersInjector != null;
    this.otherLiabilityNodeRuleProviderMembersInjector =
        otherLiabilityNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherLiabilityNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherLiabilityNodeRuleProviderMembersInjector, new OtherLiabilityNodeRuleProvider());
  }

  public static Factory<OtherLiabilityNodeRuleProvider> create(
      MembersInjector<OtherLiabilityNodeRuleProvider>
          otherLiabilityNodeRuleProviderMembersInjector) {
    return new OtherLiabilityNodeRuleProvider_Factory(
        otherLiabilityNodeRuleProviderMembersInjector);
  }
}
