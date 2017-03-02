package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageTermRemainingPeriodNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class MortgageTermRemainingPeriodNodeModule_ProvideMortgageTermRemainingPeriodNodeFactory
    implements Factory<MortgageTermRemainingPeriodNode> {
  private final MortgageTermRemainingPeriodNodeModule module;

  public MortgageTermRemainingPeriodNodeModule_ProvideMortgageTermRemainingPeriodNodeFactory(
      MortgageTermRemainingPeriodNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageTermRemainingPeriodNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageTermRemainingPeriodNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageTermRemainingPeriodNode> create(
      MortgageTermRemainingPeriodNodeModule module) {
    return new MortgageTermRemainingPeriodNodeModule_ProvideMortgageTermRemainingPeriodNodeFactory(
        module);
  }

  /**
   * Proxies {@link MortgageTermRemainingPeriodNodeModule#provideMortgageTermRemainingPeriodNode()}.
   */
  public static MortgageTermRemainingPeriodNode proxyProvideMortgageTermRemainingPeriodNode(
      MortgageTermRemainingPeriodNodeModule instance) {
    return instance.provideMortgageTermRemainingPeriodNode();
  }
}
