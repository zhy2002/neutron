package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageLimitAmountNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNodeModule_ProvideMortgageLimitAmountNodeFactory
    implements Factory<MortgageLimitAmountNode> {
  private final MortgageLimitAmountNodeModule module;

  public MortgageLimitAmountNodeModule_ProvideMortgageLimitAmountNodeFactory(
      MortgageLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageLimitAmountNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageLimitAmountNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageLimitAmountNode> create(MortgageLimitAmountNodeModule module) {
    return new MortgageLimitAmountNodeModule_ProvideMortgageLimitAmountNodeFactory(module);
  }

  /** Proxies {@link MortgageLimitAmountNodeModule#provideMortgageLimitAmountNode()}. */
  public static MortgageLimitAmountNode proxyProvideMortgageLimitAmountNode(
      MortgageLimitAmountNodeModule instance) {
    return instance.provideMortgageLimitAmountNode();
  }
}
