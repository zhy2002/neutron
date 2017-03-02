package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageInterestOnlyRemainingPeriodNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class MortgageInterestOnlyRemainingPeriodNodeModule_ProvideMortgageInterestOnlyRemainingPeriodNodeFactory
    implements Factory<MortgageInterestOnlyRemainingPeriodNode> {
  private final MortgageInterestOnlyRemainingPeriodNodeModule module;

  public
  MortgageInterestOnlyRemainingPeriodNodeModule_ProvideMortgageInterestOnlyRemainingPeriodNodeFactory(
      MortgageInterestOnlyRemainingPeriodNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageInterestOnlyRemainingPeriodNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageInterestOnlyRemainingPeriodNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageInterestOnlyRemainingPeriodNode> create(
      MortgageInterestOnlyRemainingPeriodNodeModule module) {
    return new MortgageInterestOnlyRemainingPeriodNodeModule_ProvideMortgageInterestOnlyRemainingPeriodNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * MortgageInterestOnlyRemainingPeriodNodeModule#provideMortgageInterestOnlyRemainingPeriodNode()}.
   */
  public static MortgageInterestOnlyRemainingPeriodNode
      proxyProvideMortgageInterestOnlyRemainingPeriodNode(
          MortgageInterestOnlyRemainingPeriodNodeModule instance) {
    return instance.provideMortgageInterestOnlyRemainingPeriodNode();
  }
}
