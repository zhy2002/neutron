package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetDescriptionNodeRuleProvider_Factory
    implements Factory<OtherAssetDescriptionNodeRuleProvider> {
  private final MembersInjector<OtherAssetDescriptionNodeRuleProvider>
      otherAssetDescriptionNodeRuleProviderMembersInjector;

  public OtherAssetDescriptionNodeRuleProvider_Factory(
      MembersInjector<OtherAssetDescriptionNodeRuleProvider>
          otherAssetDescriptionNodeRuleProviderMembersInjector) {
    assert otherAssetDescriptionNodeRuleProviderMembersInjector != null;
    this.otherAssetDescriptionNodeRuleProviderMembersInjector =
        otherAssetDescriptionNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherAssetDescriptionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetDescriptionNodeRuleProviderMembersInjector,
        new OtherAssetDescriptionNodeRuleProvider());
  }

  public static Factory<OtherAssetDescriptionNodeRuleProvider> create(
      MembersInjector<OtherAssetDescriptionNodeRuleProvider>
          otherAssetDescriptionNodeRuleProviderMembersInjector) {
    return new OtherAssetDescriptionNodeRuleProvider_Factory(
        otherAssetDescriptionNodeRuleProviderMembersInjector);
  }
}
