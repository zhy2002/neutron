package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetTypeNodeRuleProvider_Factory
    implements Factory<OtherAssetTypeNodeRuleProvider> {
  private final MembersInjector<OtherAssetTypeNodeRuleProvider>
      otherAssetTypeNodeRuleProviderMembersInjector;

  public OtherAssetTypeNodeRuleProvider_Factory(
      MembersInjector<OtherAssetTypeNodeRuleProvider>
          otherAssetTypeNodeRuleProviderMembersInjector) {
    assert otherAssetTypeNodeRuleProviderMembersInjector != null;
    this.otherAssetTypeNodeRuleProviderMembersInjector =
        otherAssetTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherAssetTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetTypeNodeRuleProviderMembersInjector, new OtherAssetTypeNodeRuleProvider());
  }

  public static Factory<OtherAssetTypeNodeRuleProvider> create(
      MembersInjector<OtherAssetTypeNodeRuleProvider>
          otherAssetTypeNodeRuleProviderMembersInjector) {
    return new OtherAssetTypeNodeRuleProvider_Factory(
        otherAssetTypeNodeRuleProviderMembersInjector);
  }
}
