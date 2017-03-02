package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseDescriptionNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ExpenseDescriptionNodeModule module;

  public ExpenseDescriptionNodeModule_ProvideLeafUiNodeFactory(
      ExpenseDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ExpenseDescriptionNodeModule module) {
    return new ExpenseDescriptionNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ExpenseDescriptionNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(ExpenseDescriptionNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
