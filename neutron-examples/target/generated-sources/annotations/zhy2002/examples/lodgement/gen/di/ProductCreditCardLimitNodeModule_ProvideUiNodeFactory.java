package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductCreditCardLimitNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductCreditCardLimitNodeModule module;

  public ProductCreditCardLimitNodeModule_ProvideUiNodeFactory(
      ProductCreditCardLimitNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductCreditCardLimitNodeModule module) {
    return new ProductCreditCardLimitNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductCreditCardLimitNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductCreditCardLimitNodeModule instance) {
    return instance.provideUiNode();
  }
}
