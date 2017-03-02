package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProductOptOutReasonNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final ProductOptOutReasonNodeModule module;

  public ProductOptOutReasonNodeModule_ProvideUiNodeFactory(ProductOptOutReasonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProductOptOutReasonNodeModule module) {
    return new ProductOptOutReasonNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProductOptOutReasonNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProductOptOutReasonNodeModule instance) {
    return instance.provideUiNode();
  }
}
