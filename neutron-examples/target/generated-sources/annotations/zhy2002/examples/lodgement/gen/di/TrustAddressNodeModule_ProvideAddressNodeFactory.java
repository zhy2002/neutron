package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustAddressNodeModule_ProvideAddressNodeFactory
    implements Factory<AddressNode<?>> {
  private final TrustAddressNodeModule module;

  public TrustAddressNodeModule_ProvideAddressNodeFactory(TrustAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideAddressNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressNode<?>> create(TrustAddressNodeModule module) {
    return new TrustAddressNodeModule_ProvideAddressNodeFactory(module);
  }

  /** Proxies {@link TrustAddressNodeModule#provideAddressNode()}. */
  public static AddressNode<?> proxyProvideAddressNode(TrustAddressNodeModule instance) {
    return instance.provideAddressNode();
  }
}
