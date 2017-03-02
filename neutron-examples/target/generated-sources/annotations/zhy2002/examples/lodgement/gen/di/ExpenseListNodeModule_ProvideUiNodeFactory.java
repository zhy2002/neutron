package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ExpenseListNodeModule module;

  public ExpenseListNodeModule_ProvideUiNodeFactory(ExpenseListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ExpenseListNodeModule module) {
    return new ExpenseListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ExpenseListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ExpenseListNodeModule instance) {
    return instance.provideUiNode();
  }
}
