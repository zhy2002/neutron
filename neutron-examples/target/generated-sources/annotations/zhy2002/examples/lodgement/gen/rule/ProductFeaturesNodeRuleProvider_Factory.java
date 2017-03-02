package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeaturesNodeRuleProvider_Factory
    implements Factory<ProductFeaturesNodeRuleProvider> {
  private final MembersInjector<ProductFeaturesNodeRuleProvider>
      productFeaturesNodeRuleProviderMembersInjector;

  public ProductFeaturesNodeRuleProvider_Factory(
      MembersInjector<ProductFeaturesNodeRuleProvider>
          productFeaturesNodeRuleProviderMembersInjector) {
    assert productFeaturesNodeRuleProviderMembersInjector != null;
    this.productFeaturesNodeRuleProviderMembersInjector =
        productFeaturesNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductFeaturesNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productFeaturesNodeRuleProviderMembersInjector, new ProductFeaturesNodeRuleProvider());
  }

  public static Factory<ProductFeaturesNodeRuleProvider> create(
      MembersInjector<ProductFeaturesNodeRuleProvider>
          productFeaturesNodeRuleProviderMembersInjector) {
    return new ProductFeaturesNodeRuleProvider_Factory(
        productFeaturesNodeRuleProviderMembersInjector);
  }
}
