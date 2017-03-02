package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveOffersNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ReceiveOffersNodeModule module;

  public ReceiveOffersNodeModule_ProvideLeafUiNodeFactory(ReceiveOffersNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ReceiveOffersNodeModule module) {
    return new ReceiveOffersNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ReceiveOffersNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ReceiveOffersNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}