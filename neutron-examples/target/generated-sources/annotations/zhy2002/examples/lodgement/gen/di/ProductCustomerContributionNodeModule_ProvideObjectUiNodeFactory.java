package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCustomerContributionNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final ProductCustomerContributionNodeModule module;

  public ProductCustomerContributionNodeModule_ProvideObjectUiNodeFactory(
      ProductCustomerContributionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(ProductCustomerContributionNodeModule module) {
    return new ProductCustomerContributionNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link ProductCustomerContributionNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(
      ProductCustomerContributionNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
