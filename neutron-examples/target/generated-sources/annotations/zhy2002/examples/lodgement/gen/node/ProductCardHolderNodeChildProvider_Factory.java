package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCardHolderNodeChildProvider_Factory
    implements Factory<ProductCardHolderNodeChildProvider> {
  private final MembersInjector<ProductCardHolderNodeChildProvider>
      productCardHolderNodeChildProviderMembersInjector;

  public ProductCardHolderNodeChildProvider_Factory(
      MembersInjector<ProductCardHolderNodeChildProvider>
          productCardHolderNodeChildProviderMembersInjector) {
    assert productCardHolderNodeChildProviderMembersInjector != null;
    this.productCardHolderNodeChildProviderMembersInjector =
        productCardHolderNodeChildProviderMembersInjector;
  }

  @Override
  public ProductCardHolderNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        productCardHolderNodeChildProviderMembersInjector,
        new ProductCardHolderNodeChildProvider());
  }

  public static Factory<ProductCardHolderNodeChildProvider> create(
      MembersInjector<ProductCardHolderNodeChildProvider>
          productCardHolderNodeChildProviderMembersInjector) {
    return new ProductCardHolderNodeChildProvider_Factory(
        productCardHolderNodeChildProviderMembersInjector);
  }
}
