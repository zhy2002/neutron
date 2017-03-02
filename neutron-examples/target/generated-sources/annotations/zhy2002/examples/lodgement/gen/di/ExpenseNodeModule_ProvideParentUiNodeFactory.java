package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final ExpenseNodeModule module;

  public ExpenseNodeModule_ProvideParentUiNodeFactory(ExpenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(ExpenseNodeModule module) {
    return new ExpenseNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link ExpenseNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(ExpenseNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
