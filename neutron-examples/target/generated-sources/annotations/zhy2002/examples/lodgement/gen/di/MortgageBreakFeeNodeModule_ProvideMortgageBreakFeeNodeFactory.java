package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageBreakFeeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBreakFeeNodeModule_ProvideMortgageBreakFeeNodeFactory
    implements Factory<MortgageBreakFeeNode> {
  private final MortgageBreakFeeNodeModule module;

  public MortgageBreakFeeNodeModule_ProvideMortgageBreakFeeNodeFactory(
      MortgageBreakFeeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageBreakFeeNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageBreakFeeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageBreakFeeNode> create(MortgageBreakFeeNodeModule module) {
    return new MortgageBreakFeeNodeModule_ProvideMortgageBreakFeeNodeFactory(module);
  }

  /** Proxies {@link MortgageBreakFeeNodeModule#provideMortgageBreakFeeNode()}. */
  public static MortgageBreakFeeNode proxyProvideMortgageBreakFeeNode(
      MortgageBreakFeeNodeModule instance) {
    return instance.provideMortgageBreakFeeNode();
  }
}
