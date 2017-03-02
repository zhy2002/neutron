package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageClearingFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageClearingFlagNodeModule_ProvideMortgageClearingFlagNodeFactory
    implements Factory<MortgageClearingFlagNode> {
  private final MortgageClearingFlagNodeModule module;

  public MortgageClearingFlagNodeModule_ProvideMortgageClearingFlagNodeFactory(
      MortgageClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageClearingFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageClearingFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageClearingFlagNode> create(MortgageClearingFlagNodeModule module) {
    return new MortgageClearingFlagNodeModule_ProvideMortgageClearingFlagNodeFactory(module);
  }

  /** Proxies {@link MortgageClearingFlagNodeModule#provideMortgageClearingFlagNode()}. */
  public static MortgageClearingFlagNode proxyProvideMortgageClearingFlagNode(
      MortgageClearingFlagNodeModule instance) {
    return instance.provideMortgageClearingFlagNode();
  }
}
