package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDobNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ThirdPartyDobNodeModule module;

  public ThirdPartyDobNodeModule_ProvideLeafUiNodeFactory(ThirdPartyDobNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ThirdPartyDobNodeModule module) {
    return new ThirdPartyDobNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDobNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ThirdPartyDobNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
