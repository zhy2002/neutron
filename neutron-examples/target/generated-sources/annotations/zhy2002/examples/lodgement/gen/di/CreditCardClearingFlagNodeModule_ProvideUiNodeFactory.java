package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CreditCardClearingFlagNodeModule module;

  public CreditCardClearingFlagNodeModule_ProvideUiNodeFactory(
      CreditCardClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CreditCardClearingFlagNodeModule module) {
    return new CreditCardClearingFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardClearingFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CreditCardClearingFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
