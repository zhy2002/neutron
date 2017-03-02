package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyEmailNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ThirdPartyEmailNodeModule module;

  public ThirdPartyEmailNodeModule_ProvideLeafUiNodeFactory(ThirdPartyEmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ThirdPartyEmailNodeModule module) {
    return new ThirdPartyEmailNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyEmailNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ThirdPartyEmailNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
