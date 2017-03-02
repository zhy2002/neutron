package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustAddressNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final TrustAddressNodeModule module;

  public TrustAddressNodeModule_ProvideObjectUiNodeFactory(TrustAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(TrustAddressNodeModule module) {
    return new TrustAddressNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link TrustAddressNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(TrustAddressNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
