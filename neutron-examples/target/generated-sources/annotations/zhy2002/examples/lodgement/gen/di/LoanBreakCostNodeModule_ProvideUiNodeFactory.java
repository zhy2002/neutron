package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanBreakCostNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LoanBreakCostNodeModule module;

  public LoanBreakCostNodeModule_ProvideUiNodeFactory(LoanBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LoanBreakCostNodeModule module) {
    return new LoanBreakCostNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LoanBreakCostNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LoanBreakCostNodeModule instance) {
    return instance.provideUiNode();
  }
}
