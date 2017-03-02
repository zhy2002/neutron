package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNodeRuleProvider_Factory implements Factory<AssetsNodeRuleProvider> {
  private final MembersInjector<AssetsNodeRuleProvider> assetsNodeRuleProviderMembersInjector;

  public AssetsNodeRuleProvider_Factory(
      MembersInjector<AssetsNodeRuleProvider> assetsNodeRuleProviderMembersInjector) {
    assert assetsNodeRuleProviderMembersInjector != null;
    this.assetsNodeRuleProviderMembersInjector = assetsNodeRuleProviderMembersInjector;
  }

  @Override
  public AssetsNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        assetsNodeRuleProviderMembersInjector, new AssetsNodeRuleProvider());
  }

  public static Factory<AssetsNodeRuleProvider> create(
      MembersInjector<AssetsNodeRuleProvider> assetsNodeRuleProviderMembersInjector) {
    return new AssetsNodeRuleProvider_Factory(assetsNodeRuleProviderMembersInjector);
  }
}
