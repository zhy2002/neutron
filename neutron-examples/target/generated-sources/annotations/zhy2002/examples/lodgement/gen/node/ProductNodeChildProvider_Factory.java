package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductNodeChildProvider_Factory implements Factory<ProductNodeChildProvider> {
  private final MembersInjector<ProductNodeChildProvider> productNodeChildProviderMembersInjector;

  public ProductNodeChildProvider_Factory(
      MembersInjector<ProductNodeChildProvider> productNodeChildProviderMembersInjector) {
    assert productNodeChildProviderMembersInjector != null;
    this.productNodeChildProviderMembersInjector = productNodeChildProviderMembersInjector;
  }

  @Override
  public ProductNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        productNodeChildProviderMembersInjector, new ProductNodeChildProvider());
  }

  public static Factory<ProductNodeChildProvider> create(
      MembersInjector<ProductNodeChildProvider> productNodeChildProviderMembersInjector) {
    return new ProductNodeChildProvider_Factory(productNodeChildProviderMembersInjector);
  }
}
