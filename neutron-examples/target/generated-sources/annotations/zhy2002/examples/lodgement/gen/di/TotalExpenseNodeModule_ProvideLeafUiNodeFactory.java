package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalExpenseNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final TotalExpenseNodeModule module;

  public TotalExpenseNodeModule_ProvideLeafUiNodeFactory(TotalExpenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(TotalExpenseNodeModule module) {
    return new TotalExpenseNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link TotalExpenseNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(TotalExpenseNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
