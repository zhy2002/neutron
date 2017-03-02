package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductFeaturesNodeChildProvider_Factory
    implements Factory<ProductFeaturesNodeChildProvider> {
  private final MembersInjector<ProductFeaturesNodeChildProvider>
      productFeaturesNodeChildProviderMembersInjector;

  public ProductFeaturesNodeChildProvider_Factory(
      MembersInjector<ProductFeaturesNodeChildProvider>
          productFeaturesNodeChildProviderMembersInjector) {
    assert productFeaturesNodeChildProviderMembersInjector != null;
    this.productFeaturesNodeChildProviderMembersInjector =
        productFeaturesNodeChildProviderMembersInjector;
  }

  @Override
  public ProductFeaturesNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        productFeaturesNodeChildProviderMembersInjector, new ProductFeaturesNodeChildProvider());
  }

  public static Factory<ProductFeaturesNodeChildProvider> create(
      MembersInjector<ProductFeaturesNodeChildProvider>
          productFeaturesNodeChildProviderMembersInjector) {
    return new ProductFeaturesNodeChildProvider_Factory(
        productFeaturesNodeChildProviderMembersInjector);
  }
}
