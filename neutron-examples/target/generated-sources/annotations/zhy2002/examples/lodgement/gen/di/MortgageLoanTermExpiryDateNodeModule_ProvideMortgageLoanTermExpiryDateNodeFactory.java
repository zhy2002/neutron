package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageLoanTermExpiryDateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLoanTermExpiryDateNodeModule_ProvideMortgageLoanTermExpiryDateNodeFactory
    implements Factory<MortgageLoanTermExpiryDateNode> {
  private final MortgageLoanTermExpiryDateNodeModule module;

  public MortgageLoanTermExpiryDateNodeModule_ProvideMortgageLoanTermExpiryDateNodeFactory(
      MortgageLoanTermExpiryDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageLoanTermExpiryDateNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageLoanTermExpiryDateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageLoanTermExpiryDateNode> create(
      MortgageLoanTermExpiryDateNodeModule module) {
    return new MortgageLoanTermExpiryDateNodeModule_ProvideMortgageLoanTermExpiryDateNodeFactory(
        module);
  }

  /**
   * Proxies {@link MortgageLoanTermExpiryDateNodeModule#provideMortgageLoanTermExpiryDateNode()}.
   */
  public static MortgageLoanTermExpiryDateNode proxyProvideMortgageLoanTermExpiryDateNode(
      MortgageLoanTermExpiryDateNodeModule instance) {
    return instance.provideMortgageLoanTermExpiryDateNode();
  }
}
