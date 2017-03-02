package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DefenseServiceFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final DefenseServiceFlagNodeModule module;

  public DefenseServiceFlagNodeModule_ProvideLeafUiNodeFactory(
      DefenseServiceFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(DefenseServiceFlagNodeModule module) {
    return new DefenseServiceFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link DefenseServiceFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(DefenseServiceFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
