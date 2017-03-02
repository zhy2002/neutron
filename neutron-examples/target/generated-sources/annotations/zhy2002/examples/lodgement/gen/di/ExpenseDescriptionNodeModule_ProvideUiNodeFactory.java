package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseDescriptionNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ExpenseDescriptionNodeModule module;

  public ExpenseDescriptionNodeModule_ProvideUiNodeFactory(ExpenseDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ExpenseDescriptionNodeModule module) {
    return new ExpenseDescriptionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ExpenseDescriptionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ExpenseDescriptionNodeModule instance) {
    return instance.provideUiNode();
  }
}
