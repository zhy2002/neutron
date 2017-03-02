package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardBreakCostNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CreditCardBreakCostNodeModule module;

  public CreditCardBreakCostNodeModule_ProvideUiNodeFactory(CreditCardBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CreditCardBreakCostNodeModule module) {
    return new CreditCardBreakCostNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardBreakCostNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CreditCardBreakCostNodeModule instance) {
    return instance.provideUiNode();
  }
}
