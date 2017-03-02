package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyAddressNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final ThirdPartyAddressNodeModule module;

  public ThirdPartyAddressNodeModule_ProvideObjectUiNodeFactory(
      ThirdPartyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(ThirdPartyAddressNodeModule module) {
    return new ThirdPartyAddressNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyAddressNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(ThirdPartyAddressNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
