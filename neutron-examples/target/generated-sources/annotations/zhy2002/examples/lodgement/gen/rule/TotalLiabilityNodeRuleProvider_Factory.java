package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalLiabilityNodeRuleProvider_Factory
    implements Factory<TotalLiabilityNodeRuleProvider> {
  private final MembersInjector<TotalLiabilityNodeRuleProvider>
      totalLiabilityNodeRuleProviderMembersInjector;

  public TotalLiabilityNodeRuleProvider_Factory(
      MembersInjector<TotalLiabilityNodeRuleProvider>
          totalLiabilityNodeRuleProviderMembersInjector) {
    assert totalLiabilityNodeRuleProviderMembersInjector != null;
    this.totalLiabilityNodeRuleProviderMembersInjector =
        totalLiabilityNodeRuleProviderMembersInjector;
  }

  @Override
  public TotalLiabilityNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        totalLiabilityNodeRuleProviderMembersInjector, new TotalLiabilityNodeRuleProvider());
  }

  public static Factory<TotalLiabilityNodeRuleProvider> create(
      MembersInjector<TotalLiabilityNodeRuleProvider>
          totalLiabilityNodeRuleProviderMembersInjector) {
    return new TotalLiabilityNodeRuleProvider_Factory(
        totalLiabilityNodeRuleProviderMembersInjector);
  }
}
