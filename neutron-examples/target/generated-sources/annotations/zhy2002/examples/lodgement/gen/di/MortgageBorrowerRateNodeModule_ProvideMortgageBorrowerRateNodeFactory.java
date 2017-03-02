package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageBorrowerRateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBorrowerRateNodeModule_ProvideMortgageBorrowerRateNodeFactory
    implements Factory<MortgageBorrowerRateNode> {
  private final MortgageBorrowerRateNodeModule module;

  public MortgageBorrowerRateNodeModule_ProvideMortgageBorrowerRateNodeFactory(
      MortgageBorrowerRateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageBorrowerRateNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageBorrowerRateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageBorrowerRateNode> create(MortgageBorrowerRateNodeModule module) {
    return new MortgageBorrowerRateNodeModule_ProvideMortgageBorrowerRateNodeFactory(module);
  }

  /** Proxies {@link MortgageBorrowerRateNodeModule#provideMortgageBorrowerRateNode()}. */
  public static MortgageBorrowerRateNode proxyProvideMortgageBorrowerRateNode(
      MortgageBorrowerRateNodeModule instance) {
    return instance.provideMortgageBorrowerRateNode();
  }
}
