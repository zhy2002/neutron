package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenderNodeModule_ProvideLeafUiNodeFactory implements Factory<LeafUiNode<?, ?>> {
  private final GenderNodeModule module;

  public GenderNodeModule_ProvideLeafUiNodeFactory(GenderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(GenderNodeModule module) {
    return new GenderNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link GenderNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(GenderNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
