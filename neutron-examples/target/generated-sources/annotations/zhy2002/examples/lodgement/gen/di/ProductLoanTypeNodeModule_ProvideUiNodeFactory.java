package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductLoanTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProductLoanTypeNodeModule module;

  public ProductLoanTypeNodeModule_ProvideUiNodeFactory(ProductLoanTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductLoanTypeNodeModule module) {
    return new ProductLoanTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductLoanTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductLoanTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
