package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final AreaCodeNodeModule module;

  public AreaCodeNodeModule_ProvideLeafUiNodeFactory(AreaCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(AreaCodeNodeModule module) {
    return new AreaCodeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link AreaCodeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(AreaCodeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
