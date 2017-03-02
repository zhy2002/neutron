package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanOwingAmountNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LoanOwingAmountNodeModule module;

  public LoanOwingAmountNodeModule_ProvideUiNodeFactory(LoanOwingAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LoanOwingAmountNodeModule module) {
    return new LoanOwingAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LoanOwingAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LoanOwingAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}
