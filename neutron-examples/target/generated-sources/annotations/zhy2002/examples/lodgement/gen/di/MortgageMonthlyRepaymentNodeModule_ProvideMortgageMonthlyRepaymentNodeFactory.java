package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageMonthlyRepaymentNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageMonthlyRepaymentNodeModule_ProvideMortgageMonthlyRepaymentNodeFactory
    implements Factory<MortgageMonthlyRepaymentNode> {
  private final MortgageMonthlyRepaymentNodeModule module;

  public MortgageMonthlyRepaymentNodeModule_ProvideMortgageMonthlyRepaymentNodeFactory(
      MortgageMonthlyRepaymentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageMonthlyRepaymentNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageMonthlyRepaymentNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageMonthlyRepaymentNode> create(
      MortgageMonthlyRepaymentNodeModule module) {
    return new MortgageMonthlyRepaymentNodeModule_ProvideMortgageMonthlyRepaymentNodeFactory(
        module);
  }

  /** Proxies {@link MortgageMonthlyRepaymentNodeModule#provideMortgageMonthlyRepaymentNode()}. */
  public static MortgageMonthlyRepaymentNode proxyProvideMortgageMonthlyRepaymentNode(
      MortgageMonthlyRepaymentNodeModule instance) {
    return instance.provideMortgageMonthlyRepaymentNode();
  }
}
