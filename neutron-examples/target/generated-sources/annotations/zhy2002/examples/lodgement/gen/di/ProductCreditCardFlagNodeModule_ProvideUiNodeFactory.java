package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductCreditCardFlagNodeModule module;

  public ProductCreditCardFlagNodeModule_ProvideUiNodeFactory(
      ProductCreditCardFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductCreditCardFlagNodeModule module) {
    return new ProductCreditCardFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductCreditCardFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
