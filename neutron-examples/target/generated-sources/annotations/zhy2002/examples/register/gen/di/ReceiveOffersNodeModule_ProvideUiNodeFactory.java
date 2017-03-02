package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveOffersNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ReceiveOffersNodeModule module;

  public ReceiveOffersNodeModule_ProvideUiNodeFactory(ReceiveOffersNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ReceiveOffersNodeModule module) {
    return new ReceiveOffersNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ReceiveOffersNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ReceiveOffersNodeModule instance) {
    return instance.provideUiNode();
  }
}
