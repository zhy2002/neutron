package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductCustomerContributionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCustomerContributionNode_MembersInjector
    implements MembersInjector<ProductCustomerContributionNode> {
  private final Provider<ProductCustomerContributionNodeComponent.Builder> builderProvider;

  public ProductCustomerContributionNode_MembersInjector(
      Provider<ProductCustomerContributionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductCustomerContributionNode> create(
      Provider<ProductCustomerContributionNodeComponent.Builder> builderProvider) {
    return new ProductCustomerContributionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductCustomerContributionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductCustomerContributionNode instance,
      Provider<ProductCustomerContributionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
