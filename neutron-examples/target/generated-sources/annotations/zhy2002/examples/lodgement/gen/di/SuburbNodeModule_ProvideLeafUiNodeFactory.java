package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SuburbNodeModule_ProvideLeafUiNodeFactory implements Factory<LeafUiNode<?, ?>> {
  private final SuburbNodeModule module;

  public SuburbNodeModule_ProvideLeafUiNodeFactory(SuburbNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(SuburbNodeModule module) {
    return new SuburbNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link SuburbNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(SuburbNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
