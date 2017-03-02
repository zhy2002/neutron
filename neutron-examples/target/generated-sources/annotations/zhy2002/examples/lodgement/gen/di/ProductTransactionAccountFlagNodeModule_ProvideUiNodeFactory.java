package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductTransactionAccountFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductTransactionAccountFlagNodeModule module;

  public ProductTransactionAccountFlagNodeModule_ProvideUiNodeFactory(
      ProductTransactionAccountFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductTransactionAccountFlagNodeModule module) {
    return new ProductTransactionAccountFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductTransactionAccountFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductTransactionAccountFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
