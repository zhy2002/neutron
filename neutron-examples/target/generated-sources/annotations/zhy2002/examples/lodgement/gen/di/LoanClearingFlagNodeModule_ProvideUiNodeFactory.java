package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanClearingFlagNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LoanClearingFlagNodeModule module;

  public LoanClearingFlagNodeModule_ProvideUiNodeFactory(LoanClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LoanClearingFlagNodeModule module) {
    return new LoanClearingFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LoanClearingFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LoanClearingFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
