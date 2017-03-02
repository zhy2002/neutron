package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CreditCardAmountOwingNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardAmountOwingNodeModule_ProvideCreditCardAmountOwingNodeFactory
    implements Factory<CreditCardAmountOwingNode> {
  private final CreditCardAmountOwingNodeModule module;

  public CreditCardAmountOwingNodeModule_ProvideCreditCardAmountOwingNodeFactory(
      CreditCardAmountOwingNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CreditCardAmountOwingNode get() {
    return Preconditions.checkNotNull(
        module.provideCreditCardAmountOwingNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CreditCardAmountOwingNode> create(CreditCardAmountOwingNodeModule module) {
    return new CreditCardAmountOwingNodeModule_ProvideCreditCardAmountOwingNodeFactory(module);
  }

  /** Proxies {@link CreditCardAmountOwingNodeModule#provideCreditCardAmountOwingNode()}. */
  public static CreditCardAmountOwingNode proxyProvideCreditCardAmountOwingNode(
      CreditCardAmountOwingNodeModule instance) {
    return instance.provideCreditCardAmountOwingNode();
  }
}
