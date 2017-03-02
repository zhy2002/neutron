package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ProductRepaymentFrequencyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRepaymentFrequencyNode_MembersInjector
    implements MembersInjector<ProductRepaymentFrequencyNode> {
  private final Provider<ProductRepaymentFrequencyNodeComponent.Builder> builderProvider;

  public ProductRepaymentFrequencyNode_MembersInjector(
      Provider<ProductRepaymentFrequencyNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ProductRepaymentFrequencyNode> create(
      Provider<ProductRepaymentFrequencyNodeComponent.Builder> builderProvider) {
    return new ProductRepaymentFrequencyNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ProductRepaymentFrequencyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ProductRepaymentFrequencyNode instance,
      Provider<ProductRepaymentFrequencyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
