package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductRepaymentFrequencyNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductRepaymentFrequencyNodeModule module;

  public ProductRepaymentFrequencyNodeModule_ProvideUiNodeFactory(
      ProductRepaymentFrequencyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductRepaymentFrequencyNodeModule module) {
    return new ProductRepaymentFrequencyNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductRepaymentFrequencyNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductRepaymentFrequencyNodeModule instance) {
    return instance.provideUiNode();
  }
}