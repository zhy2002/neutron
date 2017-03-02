package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BasePercentageNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBorrowerRateNodeModule_ProvideBasePercentageNodeFactory
    implements Factory<BasePercentageNode<?>> {
  private final MortgageBorrowerRateNodeModule module;

  public MortgageBorrowerRateNodeModule_ProvideBasePercentageNodeFactory(
      MortgageBorrowerRateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BasePercentageNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBasePercentageNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BasePercentageNode<?>> create(MortgageBorrowerRateNodeModule module) {
    return new MortgageBorrowerRateNodeModule_ProvideBasePercentageNodeFactory(module);
  }

  /** Proxies {@link MortgageBorrowerRateNodeModule#provideBasePercentageNode()}. */
  public static BasePercentageNode<?> proxyProvideBasePercentageNode(
      MortgageBorrowerRateNodeModule instance) {
    return instance.provideBasePercentageNode();
  }
}
