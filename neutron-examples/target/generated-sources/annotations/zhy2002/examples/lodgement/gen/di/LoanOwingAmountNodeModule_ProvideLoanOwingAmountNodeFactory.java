package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanOwingAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanOwingAmountNodeModule_ProvideLoanOwingAmountNodeFactory
    implements Factory<LoanOwingAmountNode> {
  private final LoanOwingAmountNodeModule module;

  public LoanOwingAmountNodeModule_ProvideLoanOwingAmountNodeFactory(
      LoanOwingAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanOwingAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanOwingAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanOwingAmountNode> create(LoanOwingAmountNodeModule module) {
    return new LoanOwingAmountNodeModule_ProvideLoanOwingAmountNodeFactory(module);
  }

  /** Proxies {@link LoanOwingAmountNodeModule#provideLoanOwingAmountNode()}. */
  public static LoanOwingAmountNode proxyProvideLoanOwingAmountNode(
      LoanOwingAmountNodeModule instance) {
    return instance.provideLoanOwingAmountNode();
  }
}
