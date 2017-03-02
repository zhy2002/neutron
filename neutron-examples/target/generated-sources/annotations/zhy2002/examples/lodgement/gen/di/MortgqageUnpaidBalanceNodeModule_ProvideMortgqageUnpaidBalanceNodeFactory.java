package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgqageUnpaidBalanceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgqageUnpaidBalanceNodeModule_ProvideMortgqageUnpaidBalanceNodeFactory
    implements Factory<MortgqageUnpaidBalanceNode> {
  private final MortgqageUnpaidBalanceNodeModule module;

  public MortgqageUnpaidBalanceNodeModule_ProvideMortgqageUnpaidBalanceNodeFactory(
      MortgqageUnpaidBalanceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgqageUnpaidBalanceNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgqageUnpaidBalanceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgqageUnpaidBalanceNode> create(
      MortgqageUnpaidBalanceNodeModule module) {
    return new MortgqageUnpaidBalanceNodeModule_ProvideMortgqageUnpaidBalanceNodeFactory(module);
  }

  /** Proxies {@link MortgqageUnpaidBalanceNodeModule#provideMortgqageUnpaidBalanceNode()}. */
  public static MortgqageUnpaidBalanceNode proxyProvideMortgqageUnpaidBalanceNode(
      MortgqageUnpaidBalanceNodeModule instance) {
    return instance.provideMortgqageUnpaidBalanceNode();
  }
}
