package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductListNodeItemProvider_MembersInjector
    implements MembersInjector<ProductListNodeItemProvider> {
  private final MembersInjector<ProductNode> productNodeInjectorMembersInjector;

  public ProductListNodeItemProvider_MembersInjector(
      MembersInjector<ProductNode> productNodeInjectorMembersInjector) {
    assert productNodeInjectorMembersInjector != null;
    this.productNodeInjectorMembersInjector = productNodeInjectorMembersInjector;
  }

  public static MembersInjector<ProductListNodeItemProvider> create(
      MembersInjector<ProductNode> productNodeInjectorMembersInjector) {
    return new ProductListNodeItemProvider_MembersInjector(productNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(ProductListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.productNodeInjector = productNodeInjectorMembersInjector;
  }

  public static void injectProductNodeInjector(
      ProductListNodeItemProvider instance, MembersInjector<ProductNode> productNodeInjector) {
    instance.productNodeInjector = productNodeInjector;
  }
}
