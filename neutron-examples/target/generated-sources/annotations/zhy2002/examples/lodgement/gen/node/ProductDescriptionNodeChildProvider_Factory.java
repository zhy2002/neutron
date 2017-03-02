package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductDescriptionNodeChildProvider_Factory
    implements Factory<ProductDescriptionNodeChildProvider> {
  private final MembersInjector<ProductDescriptionNodeChildProvider>
      productDescriptionNodeChildProviderMembersInjector;

  public ProductDescriptionNodeChildProvider_Factory(
      MembersInjector<ProductDescriptionNodeChildProvider>
          productDescriptionNodeChildProviderMembersInjector) {
    assert productDescriptionNodeChildProviderMembersInjector != null;
    this.productDescriptionNodeChildProviderMembersInjector =
        productDescriptionNodeChildProviderMembersInjector;
  }

  @Override
  public ProductDescriptionNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        productDescriptionNodeChildProviderMembersInjector,
        new ProductDescriptionNodeChildProvider());
  }

  public static Factory<ProductDescriptionNodeChildProvider> create(
      MembersInjector<ProductDescriptionNodeChildProvider>
          productDescriptionNodeChildProviderMembersInjector) {
    return new ProductDescriptionNodeChildProvider_Factory(
        productDescriptionNodeChildProviderMembersInjector);
  }
}
