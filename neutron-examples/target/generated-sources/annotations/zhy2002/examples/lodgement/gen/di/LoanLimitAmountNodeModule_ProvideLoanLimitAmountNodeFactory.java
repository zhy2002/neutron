package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanLimitAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLimitAmountNodeModule_ProvideLoanLimitAmountNodeFactory
    implements Factory<LoanLimitAmountNode> {
  private final LoanLimitAmountNodeModule module;

  public LoanLimitAmountNodeModule_ProvideLoanLimitAmountNodeFactory(
      LoanLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanLimitAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanLimitAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanLimitAmountNode> create(LoanLimitAmountNodeModule module) {
    return new LoanLimitAmountNodeModule_ProvideLoanLimitAmountNodeFactory(module);
  }

  /** Proxies {@link LoanLimitAmountNodeModule#provideLoanLimitAmountNode()}. */
  public static LoanLimitAmountNode proxyProvideLoanLimitAmountNode(
      LoanLimitAmountNodeModule instance) {
    return instance.provideLoanLimitAmountNode();
  }
}
