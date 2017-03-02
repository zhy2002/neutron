package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardBreakCostNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardBreakCostNodeModule_ProvideCreditCardBreakCostNodeFactory
    implements Factory<CreditCardBreakCostNode> {
  private final CreditCardBreakCostNodeModule module;

  public CreditCardBreakCostNodeModule_ProvideCreditCardBreakCostNodeFactory(
      CreditCardBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardBreakCostNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardBreakCostNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardBreakCostNode> create(CreditCardBreakCostNodeModule module) {
    return new CreditCardBreakCostNodeModule_ProvideCreditCardBreakCostNodeFactory(module);
  }

  /** Proxies {@link CreditCardBreakCostNodeModule#provideCreditCardBreakCostNode()}. */
  public static CreditCardBreakCostNode proxyProvideCreditCardBreakCostNode(
      CreditCardBreakCostNodeModule instance) {
    return instance.provideCreditCardBreakCostNode();
  }
}
