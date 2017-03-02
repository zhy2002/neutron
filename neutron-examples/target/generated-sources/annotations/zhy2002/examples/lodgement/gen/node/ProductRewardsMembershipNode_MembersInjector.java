package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductRewardsMembershipNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRewardsMembershipNode_MembersInjector
    implements MembersInjector<ProductRewardsMembershipNode> {
  private final Provider<ProductRewardsMembershipNodeComponent.Builder> builderProvider;

  public ProductRewardsMembershipNode_MembersInjector(
      Provider<ProductRewardsMembershipNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductRewardsMembershipNode> create(
      Provider<ProductRewardsMembershipNodeComponent.Builder> builderProvider) {
    return new ProductRewardsMembershipNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductRewardsMembershipNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductRewardsMembershipNode instance,
      Provider<ProductRewardsMembershipNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
