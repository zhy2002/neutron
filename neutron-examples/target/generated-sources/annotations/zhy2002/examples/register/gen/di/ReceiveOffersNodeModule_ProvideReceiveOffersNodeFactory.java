package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.register.gen.node.ReceiveOffersNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ReceiveOffersNodeModule_ProvideReceiveOffersNodeFactory
    implements Factory<ReceiveOffersNode> {
  private final ReceiveOffersNodeModule module;

  public ReceiveOffersNodeModule_ProvideReceiveOffersNodeFactory(ReceiveOffersNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ReceiveOffersNode get() {
    return Preconditions.checkNotNull(
        module.provideReceiveOffersNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ReceiveOffersNode> create(ReceiveOffersNodeModule module) {
    return new ReceiveOffersNodeModule_ProvideReceiveOffersNodeFactory(module);
  }

  /** Proxies {@link ReceiveOffersNodeModule#provideReceiveOffersNode()}. */
  public static ReceiveOffersNode proxyProvideReceiveOffersNode(ReceiveOffersNodeModule instance) {
    return instance.provideReceiveOffersNode();
  }
}
