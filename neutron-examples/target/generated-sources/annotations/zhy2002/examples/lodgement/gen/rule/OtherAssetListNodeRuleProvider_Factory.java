package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetListNodeRuleProvider_Factory
    implements Factory<OtherAssetListNodeRuleProvider> {
  private final MembersInjector<OtherAssetListNodeRuleProvider>
      otherAssetListNodeRuleProviderMembersInjector;

  public OtherAssetListNodeRuleProvider_Factory(
      MembersInjector<OtherAssetListNodeRuleProvider>
          otherAssetListNodeRuleProviderMembersInjector) {
    assert otherAssetListNodeRuleProviderMembersInjector != null;
    this.otherAssetListNodeRuleProviderMembersInjector =
        otherAssetListNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherAssetListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetListNodeRuleProviderMembersInjector, new OtherAssetListNodeRuleProvider());
  }

  public static Factory<OtherAssetListNodeRuleProvider> create(
      MembersInjector<OtherAssetListNodeRuleProvider>
          otherAssetListNodeRuleProviderMembersInjector) {
    return new OtherAssetListNodeRuleProvider_Factory(
        otherAssetListNodeRuleProviderMembersInjector);
  }
}
