package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNodeRuleProvider_Factory
    implements Factory<OtherAssetNodeRuleProvider> {
  private final MembersInjector<OtherAssetNodeRuleProvider>
      otherAssetNodeRuleProviderMembersInjector;

  public OtherAssetNodeRuleProvider_Factory(
      MembersInjector<OtherAssetNodeRuleProvider> otherAssetNodeRuleProviderMembersInjector) {
    assert otherAssetNodeRuleProviderMembersInjector != null;
    this.otherAssetNodeRuleProviderMembersInjector = otherAssetNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherAssetNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetNodeRuleProviderMembersInjector, new OtherAssetNodeRuleProvider());
  }

  public static Factory<OtherAssetNodeRuleProvider> create(
      MembersInjector<OtherAssetNodeRuleProvider> otherAssetNodeRuleProviderMembersInjector) {
    return new OtherAssetNodeRuleProvider_Factory(otherAssetNodeRuleProviderMembersInjector);
  }
}
