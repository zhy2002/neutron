package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SpouseNodeModule_ProvideLeafUiNodeFactory implements Factory<LeafUiNode<?, ?>> {
  private final SpouseNodeModule module;

  public SpouseNodeModule_ProvideLeafUiNodeFactory(SpouseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SpouseNodeModule module) {
    return new SpouseNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SpouseNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SpouseNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
