package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.LoanMonthlyRepaymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanMonthlyRepaymentNodeModule_ProvideLoanMonthlyRepaymentNodeFactory
    implements Factory<LoanMonthlyRepaymentNode> {
  private final LoanMonthlyRepaymentNodeModule module;

  public LoanMonthlyRepaymentNodeModule_ProvideLoanMonthlyRepaymentNodeFactory(
      LoanMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LoanMonthlyRepaymentNode get() {
    return Preconditions.checkNotNull(
        module.provideLoanMonthlyRepaymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LoanMonthlyRepaymentNode> create(LoanMonthlyRepaymentNodeModule module) {
    return new LoanMonthlyRepaymentNodeModule_ProvideLoanMonthlyRepaymentNodeFactory(module);
  }

  /** Proxies {@link LoanMonthlyRepaymentNodeModule#provideLoanMonthlyRepaymentNode()}. */
  public static LoanMonthlyRepaymentNode proxyProvideLoanMonthlyRepaymentNode(
      LoanMonthlyRepaymentNodeModule instance) {
    return instance.provideLoanMonthlyRepaymentNode();
  }
}
