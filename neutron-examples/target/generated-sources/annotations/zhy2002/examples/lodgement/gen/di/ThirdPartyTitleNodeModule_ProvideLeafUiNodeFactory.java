package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTitleNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ThirdPartyTitleNodeModule module;

  public ThirdPartyTitleNodeModule_ProvideLeafUiNodeFactory(ThirdPartyTitleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ThirdPartyTitleNodeModule module) {
    return new ThirdPartyTitleNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyTitleNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ThirdPartyTitleNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
