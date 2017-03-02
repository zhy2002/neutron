package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.Product100PercentOffsetFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Product100PercentOffsetFlagNode_MembersInjector
    implements MembersInjector<Product100PercentOffsetFlagNode> {
  private final Provider<Product100PercentOffsetFlagNodeComponent.Builder> builderProvider;

  public Product100PercentOffsetFlagNode_MembersInjector(
      Provider<Product100PercentOffsetFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<Product100PercentOffsetFlagNode> create(
      Provider<Product100PercentOffsetFlagNodeComponent.Builder> builderProvider) {
    return new Product100PercentOffsetFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(Product100PercentOffsetFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      Product100PercentOffsetFlagNode instance,
      Provider<Product100PercentOffsetFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
