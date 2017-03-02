package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TrustAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustAddressNodeModule_ProvideTrustAddressNodeFactory
    implements Factory<TrustAddressNode> {
  private final TrustAddressNodeModule module;

  public TrustAddressNodeModule_ProvideTrustAddressNodeFactory(TrustAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TrustAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideTrustAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TrustAddressNode> create(TrustAddressNodeModule module) {
    return new TrustAddressNodeModule_ProvideTrustAddressNodeFactory(module);
  }

  /** Proxies {@link TrustAddressNodeModule#provideTrustAddressNode()}. */
  public static TrustAddressNode proxyProvideTrustAddressNode(TrustAddressNodeModule instance) {
    return instance.provideTrustAddressNode();
  }
}
