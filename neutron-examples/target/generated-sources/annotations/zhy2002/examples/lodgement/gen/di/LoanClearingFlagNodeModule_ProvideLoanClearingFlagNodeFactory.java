package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanClearingFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanClearingFlagNodeModule_ProvideLoanClearingFlagNodeFactory
    implements Factory<LoanClearingFlagNode> {
  private final LoanClearingFlagNodeModule module;

  public LoanClearingFlagNodeModule_ProvideLoanClearingFlagNodeFactory(
      LoanClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanClearingFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanClearingFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanClearingFlagNode> create(LoanClearingFlagNodeModule module) {
    return new LoanClearingFlagNodeModule_ProvideLoanClearingFlagNodeFactory(module);
  }

  /** Proxies {@link LoanClearingFlagNodeModule#provideLoanClearingFlagNode()}. */
  public static LoanClearingFlagNode proxyProvideLoanClearingFlagNode(
      LoanClearingFlagNodeModule instance) {
    return instance.provideLoanClearingFlagNode();
  }
}
