package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BigDecimalUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNodeModule_ProvideBigDecimalUiNodeFactory
    implements Factory<BigDecimalUiNode<?>> {
  private final MortgageLimitAmountNodeModule module;

  public MortgageLimitAmountNodeModule_ProvideBigDecimalUiNodeFactory(
      MortgageLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BigDecimalUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBigDecimalUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BigDecimalUiNode<?>> create(MortgageLimitAmountNodeModule module) {
    return new MortgageLimitAmountNodeModule_ProvideBigDecimalUiNodeFactory(module);
  }

  /** Proxies {@link MortgageLimitAmountNodeModule#provideBigDecimalUiNode()}. */
  public static BigDecimalUiNode<?> proxyProvideBigDecimalUiNode(
      MortgageLimitAmountNodeModule instance) {
    return instance.provideBigDecimalUiNode();
  }
}
