package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleRepaymentDifficultyNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ResponsibleRepaymentDifficultyNodeModule module;

  public ResponsibleRepaymentDifficultyNodeModule_ProvideLeafUiNodeFactory(
      ResponsibleRepaymentDifficultyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ResponsibleRepaymentDifficultyNodeModule module) {
    return new ResponsibleRepaymentDifficultyNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ResponsibleRepaymentDifficultyNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ResponsibleRepaymentDifficultyNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
