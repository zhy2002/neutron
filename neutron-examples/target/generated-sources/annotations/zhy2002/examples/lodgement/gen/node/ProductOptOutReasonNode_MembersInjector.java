package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductOptOutReasonNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductOptOutReasonNode_MembersInjector
    implements MembersInjector<ProductOptOutReasonNode> {
  private final Provider<ProductOptOutReasonNodeComponent.Builder> builderProvider;

  public ProductOptOutReasonNode_MembersInjector(
      Provider<ProductOptOutReasonNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductOptOutReasonNode> create(
      Provider<ProductOptOutReasonNodeComponent.Builder> builderProvider) {
    return new ProductOptOutReasonNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductOptOutReasonNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductOptOutReasonNode instance,
      Provider<ProductOptOutReasonNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
