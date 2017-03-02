package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ThirdPartyTypeNodeModule module;

  public ThirdPartyTypeNodeModule_ProvideLeafUiNodeFactory(ThirdPartyTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ThirdPartyTypeNodeModule module) {
    return new ThirdPartyTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ThirdPartyTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
