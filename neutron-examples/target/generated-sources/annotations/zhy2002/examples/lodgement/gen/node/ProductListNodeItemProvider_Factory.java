package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductListNodeItemProvider_Factory
    implements Factory<ProductListNodeItemProvider> {
  private final MembersInjector<ProductListNodeItemProvider>
      productListNodeItemProviderMembersInjector;

  public ProductListNodeItemProvider_Factory(
      MembersInjector<ProductListNodeItemProvider> productListNodeItemProviderMembersInjector) {
    assert productListNodeItemProviderMembersInjector != null;
    this.productListNodeItemProviderMembersInjector = productListNodeItemProviderMembersInjector;
  }

  @Override
  public ProductListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        productListNodeItemProviderMembersInjector, new ProductListNodeItemProvider());
  }

  public static Factory<ProductListNodeItemProvider> create(
      MembersInjector<ProductListNodeItemProvider> productListNodeItemProviderMembersInjector) {
    return new ProductListNodeItemProvider_Factory(productListNodeItemProviderMembersInjector);
  }
}
