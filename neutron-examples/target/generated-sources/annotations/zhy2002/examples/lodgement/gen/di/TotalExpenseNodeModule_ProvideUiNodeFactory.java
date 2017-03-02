package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalExpenseNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final TotalExpenseNodeModule module;

  public TotalExpenseNodeModule_ProvideUiNodeFactory(TotalExpenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TotalExpenseNodeModule module) {
    return new TotalExpenseNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TotalExpenseNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TotalExpenseNodeModule instance) {
    return instance.provideUiNode();
  }
}
