package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyAddressNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ThirdPartyAddressNodeModule module;

  public ThirdPartyAddressNodeModule_ProvideParentUiNodeFactory(
      ThirdPartyAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ThirdPartyAddressNodeModule module) {
    return new ThirdPartyAddressNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyAddressNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ThirdPartyAddressNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
