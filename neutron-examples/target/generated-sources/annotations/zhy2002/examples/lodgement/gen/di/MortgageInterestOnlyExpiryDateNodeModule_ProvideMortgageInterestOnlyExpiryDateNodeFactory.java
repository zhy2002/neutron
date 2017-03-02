package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageInterestOnlyExpiryDateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class MortgageInterestOnlyExpiryDateNodeModule_ProvideMortgageInterestOnlyExpiryDateNodeFactory
    implements Factory<MortgageInterestOnlyExpiryDateNode> {
  private final MortgageInterestOnlyExpiryDateNodeModule module;

  public MortgageInterestOnlyExpiryDateNodeModule_ProvideMortgageInterestOnlyExpiryDateNodeFactory(
      MortgageInterestOnlyExpiryDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageInterestOnlyExpiryDateNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageInterestOnlyExpiryDateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageInterestOnlyExpiryDateNode> create(
      MortgageInterestOnlyExpiryDateNodeModule module) {
    return new MortgageInterestOnlyExpiryDateNodeModule_ProvideMortgageInterestOnlyExpiryDateNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * MortgageInterestOnlyExpiryDateNodeModule#provideMortgageInterestOnlyExpiryDateNode()}.
   */
  public static MortgageInterestOnlyExpiryDateNode proxyProvideMortgageInterestOnlyExpiryDateNode(
      MortgageInterestOnlyExpiryDateNodeModule instance) {
    return instance.provideMortgageInterestOnlyExpiryDateNode();
  }
}
