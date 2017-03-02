package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final FinancialPositionNodeModule module;

  public FinancialPositionNodeModule_ProvideUiNodeFactory(FinancialPositionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(FinancialPositionNodeModule module) {
    return new FinancialPositionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link FinancialPositionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(FinancialPositionNodeModule instance) {
    return instance.provideUiNode();
  }
}
