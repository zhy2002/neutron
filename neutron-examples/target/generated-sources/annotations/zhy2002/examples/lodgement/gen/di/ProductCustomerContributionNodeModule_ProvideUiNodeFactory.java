package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCustomerContributionNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductCustomerContributionNodeModule module;

  public ProductCustomerContributionNodeModule_ProvideUiNodeFactory(
      ProductCustomerContributionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductCustomerContributionNodeModule module) {
    return new ProductCustomerContributionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductCustomerContributionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductCustomerContributionNodeModule instance) {
    return instance.provideUiNode();
  }
}
