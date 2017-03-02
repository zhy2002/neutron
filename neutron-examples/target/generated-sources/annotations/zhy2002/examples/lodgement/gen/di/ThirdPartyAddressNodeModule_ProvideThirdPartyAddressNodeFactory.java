package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyAddressNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyAddressNodeModule_ProvideThirdPartyAddressNodeFactory
    implements Factory<ThirdPartyAddressNode> {
  private final ThirdPartyAddressNodeModule module;

  public ThirdPartyAddressNodeModule_ProvideThirdPartyAddressNodeFactory(
      ThirdPartyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyAddressNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyAddressNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyAddressNode> create(ThirdPartyAddressNodeModule module) {
    return new ThirdPartyAddressNodeModule_ProvideThirdPartyAddressNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyAddressNodeModule#provideThirdPartyAddressNode()}. */
  public static ThirdPartyAddressNode proxyProvideThirdPartyAddressNode(
      ThirdPartyAddressNodeModule instance) {
    return instance.provideThirdPartyAddressNode();
  }
}
