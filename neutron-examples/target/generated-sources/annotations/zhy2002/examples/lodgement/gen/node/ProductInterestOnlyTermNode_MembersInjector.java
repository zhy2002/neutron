package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductInterestOnlyTermNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductInterestOnlyTermNode_MembersInjector
    implements MembersInjector<ProductInterestOnlyTermNode> {
  private final Provider<ProductInterestOnlyTermNodeComponent.Builder> builderProvider;

  public ProductInterestOnlyTermNode_MembersInjector(
      Provider<ProductInterestOnlyTermNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductInterestOnlyTermNode> create(
      Provider<ProductInterestOnlyTermNodeComponent.Builder> builderProvider) {
    return new ProductInterestOnlyTermNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductInterestOnlyTermNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductInterestOnlyTermNode instance,
      Provider<ProductInterestOnlyTermNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
