package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalAssetNodeRuleProvider_Factory
    implements Factory<TotalAssetNodeRuleProvider> {
  private final MembersInjector<TotalAssetNodeRuleProvider>
      totalAssetNodeRuleProviderMembersInjector;

  public TotalAssetNodeRuleProvider_Factory(
      MembersInjector<TotalAssetNodeRuleProvider> totalAssetNodeRuleProviderMembersInjector) {
    assert totalAssetNodeRuleProviderMembersInjector != null;
    this.totalAssetNodeRuleProviderMembersInjector = totalAssetNodeRuleProviderMembersInjector;
  }

  @Override
  public TotalAssetNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        totalAssetNodeRuleProviderMembersInjector, new TotalAssetNodeRuleProvider());
  }

  public static Factory<TotalAssetNodeRuleProvider> create(
      MembersInjector<TotalAssetNodeRuleProvider> totalAssetNodeRuleProviderMembersInjector) {
    return new TotalAssetNodeRuleProvider_Factory(totalAssetNodeRuleProviderMembersInjector);
  }
}
