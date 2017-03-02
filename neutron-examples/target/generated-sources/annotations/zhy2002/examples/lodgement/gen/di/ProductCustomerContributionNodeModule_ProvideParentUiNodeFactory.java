package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCustomerContributionNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ProductCustomerContributionNodeModule module;

  public ProductCustomerContributionNodeModule_ProvideParentUiNodeFactory(
      ProductCustomerContributionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ProductCustomerContributionNodeModule module) {
    return new ProductCustomerContributionNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ProductCustomerContributionNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      ProductCustomerContributionNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
