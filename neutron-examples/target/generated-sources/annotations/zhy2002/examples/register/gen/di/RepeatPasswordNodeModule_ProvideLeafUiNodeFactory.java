package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final RepeatPasswordNodeModule module;

  public RepeatPasswordNodeModule_ProvideLeafUiNodeFactory(RepeatPasswordNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(RepeatPasswordNodeModule module) {
    return new RepeatPasswordNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link RepeatPasswordNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(RepeatPasswordNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}