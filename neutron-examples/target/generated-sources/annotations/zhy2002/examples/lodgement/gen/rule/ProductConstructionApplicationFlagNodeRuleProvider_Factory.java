package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductConstructionApplicationFlagNodeRuleProvider_Factory
    implements Factory<ProductConstructionApplicationFlagNodeRuleProvider> {
  private final MembersInjector<ProductConstructionApplicationFlagNodeRuleProvider>
      productConstructionApplicationFlagNodeRuleProviderMembersInjector;

  public ProductConstructionApplicationFlagNodeRuleProvider_Factory(
      MembersInjector<ProductConstructionApplicationFlagNodeRuleProvider>
          productConstructionApplicationFlagNodeRuleProviderMembersInjector) {
    assert productConstructionApplicationFlagNodeRuleProviderMembersInjector != null;
    this.productConstructionApplicationFlagNodeRuleProviderMembersInjector =
        productConstructionApplicationFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductConstructionApplicationFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productConstructionApplicationFlagNodeRuleProviderMembersInjector,
        new ProductConstructionApplicationFlagNodeRuleProvider());
  }

  public static Factory<ProductConstructionApplicationFlagNodeRuleProvider> create(
      MembersInjector<ProductConstructionApplicationFlagNodeRuleProvider>
          productConstructionApplicationFlagNodeRuleProviderMembersInjector) {
    return new ProductConstructionApplicationFlagNodeRuleProvider_Factory(
        productConstructionApplicationFlagNodeRuleProviderMembersInjector);
  }
}
