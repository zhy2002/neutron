package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductsNodeChildProvider_Factory implements Factory<ProductsNodeChildProvider> {
  private final MembersInjector<ProductsNodeChildProvider> productsNodeChildProviderMembersInjector;

  public ProductsNodeChildProvider_Factory(
      MembersInjector<ProductsNodeChildProvider> productsNodeChildProviderMembersInjector) {
    assert productsNodeChildProviderMembersInjector != null;
    this.productsNodeChildProviderMembersInjector = productsNodeChildProviderMembersInjector;
  }

  @Override
  public ProductsNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        productsNodeChildProviderMembersInjector, new ProductsNodeChildProvider());
  }

  public static Factory<ProductsNodeChildProvider> create(
      MembersInjector<ProductsNodeChildProvider> productsNodeChildProviderMembersInjector) {
    return new ProductsNodeChildProvider_Factory(productsNodeChildProviderMembersInjector);
  }
}
