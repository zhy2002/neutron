package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final CreditCardClearingFlagNodeModule module;

  public CreditCardClearingFlagNodeModule_ProvideBooleanUiNodeFactory(
      CreditCardClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(CreditCardClearingFlagNodeModule module) {
    return new CreditCardClearingFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardClearingFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      CreditCardClearingFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
