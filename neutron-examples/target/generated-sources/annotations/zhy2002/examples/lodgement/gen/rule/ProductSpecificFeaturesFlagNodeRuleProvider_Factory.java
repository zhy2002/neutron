package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductSpecificFeaturesFlagNodeRuleProvider_Factory
    implements Factory<ProductSpecificFeaturesFlagNodeRuleProvider> {
  private final MembersInjector<ProductSpecificFeaturesFlagNodeRuleProvider>
      productSpecificFeaturesFlagNodeRuleProviderMembersInjector;

  public ProductSpecificFeaturesFlagNodeRuleProvider_Factory(
      MembersInjector<ProductSpecificFeaturesFlagNodeRuleProvider>
          productSpecificFeaturesFlagNodeRuleProviderMembersInjector) {
    assert productSpecificFeaturesFlagNodeRuleProviderMembersInjector != null;
    this.productSpecificFeaturesFlagNodeRuleProviderMembersInjector =
        productSpecificFeaturesFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ProductSpecificFeaturesFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        productSpecificFeaturesFlagNodeRuleProviderMembersInjector,
        new ProductSpecificFeaturesFlagNodeRuleProvider());
  }

  public static Factory<ProductSpecificFeaturesFlagNodeRuleProvider> create(
      MembersInjector<ProductSpecificFeaturesFlagNodeRuleProvider>
          productSpecificFeaturesFlagNodeRuleProviderMembersInjector) {
    return new ProductSpecificFeaturesFlagNodeRuleProvider_Factory(
        productSpecificFeaturesFlagNodeRuleProviderMembersInjector);
  }
}
