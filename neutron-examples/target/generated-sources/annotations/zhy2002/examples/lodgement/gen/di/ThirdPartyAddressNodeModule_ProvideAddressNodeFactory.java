package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyAddressNodeModule_ProvideAddressNodeFactory
    implements Factory<AddressNode<?>> {
  private final ThirdPartyAddressNodeModule module;

  public ThirdPartyAddressNodeModule_ProvideAddressNodeFactory(ThirdPartyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AddressNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideAddressNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AddressNode<?>> create(ThirdPartyAddressNodeModule module) {
    return new ThirdPartyAddressNodeModule_ProvideAddressNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyAddressNodeModule#provideAddressNode()}. */
  public static AddressNode<?> proxyProvideAddressNode(ThirdPartyAddressNodeModule instance) {
    return instance.provideAddressNode();
  }
}
