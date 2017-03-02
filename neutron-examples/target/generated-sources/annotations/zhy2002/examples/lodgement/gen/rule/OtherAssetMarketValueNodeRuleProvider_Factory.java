package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetMarketValueNodeRuleProvider_Factory
    implements Factory<OtherAssetMarketValueNodeRuleProvider> {
  private final MembersInjector<OtherAssetMarketValueNodeRuleProvider>
      otherAssetMarketValueNodeRuleProviderMembersInjector;

  public OtherAssetMarketValueNodeRuleProvider_Factory(
      MembersInjector<OtherAssetMarketValueNodeRuleProvider>
          otherAssetMarketValueNodeRuleProviderMembersInjector) {
    assert otherAssetMarketValueNodeRuleProviderMembersInjector != null;
    this.otherAssetMarketValueNodeRuleProviderMembersInjector =
        otherAssetMarketValueNodeRuleProviderMembersInjector;
  }

  @Override
  public OtherAssetMarketValueNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        otherAssetMarketValueNodeRuleProviderMembersInjector,
        new OtherAssetMarketValueNodeRuleProvider());
  }

  public static Factory<OtherAssetMarketValueNodeRuleProvider> create(
      MembersInjector<OtherAssetMarketValueNodeRuleProvider>
          otherAssetMarketValueNodeRuleProviderMembersInjector) {
    return new OtherAssetMarketValueNodeRuleProvider_Factory(
        otherAssetMarketValueNodeRuleProviderMembersInjector);
  }
}
