package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.FinancialPositionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FinancialPositionNodeModule_ProvideFinancialPositionNodeFactory
    implements Factory<FinancialPositionNode> {
  private final FinancialPositionNodeModule module;

  public FinancialPositionNodeModule_ProvideFinancialPositionNodeFactory(
      FinancialPositionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public FinancialPositionNode get() {
    return Preconditions.checkNotNull(
        module.provideFinancialPositionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<FinancialPositionNode> create(FinancialPositionNodeModule module) {
    return new FinancialPositionNodeModule_ProvideFinancialPositionNodeFactory(module);
  }

  /** Proxies {@link FinancialPositionNodeModule#provideFinancialPositionNode()}. */
  public static FinancialPositionNode proxyProvideFinancialPositionNode(
      FinancialPositionNodeModule instance) {
    return instance.provideFinancialPositionNode();
  }
}
