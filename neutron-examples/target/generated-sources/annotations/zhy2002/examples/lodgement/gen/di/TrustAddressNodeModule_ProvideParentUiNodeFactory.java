package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustAddressNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final TrustAddressNodeModule module;

  public TrustAddressNodeModule_ProvideParentUiNodeFactory(TrustAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(TrustAddressNodeModule module) {
    return new TrustAddressNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link TrustAddressNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(TrustAddressNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
