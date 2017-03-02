package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EstimatedMarketValueNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EstimatedMarketValueNodeModule_ProvideEstimatedMarketValueNodeFactory
    implements Factory<EstimatedMarketValueNode> {
  private final EstimatedMarketValueNodeModule module;

  public EstimatedMarketValueNodeModule_ProvideEstimatedMarketValueNodeFactory(
      EstimatedMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EstimatedMarketValueNode get() {
    return Preconditions.checkNotNull(
        module.provideEstimatedMarketValueNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EstimatedMarketValueNode> create(EstimatedMarketValueNodeModule module) {
    return new EstimatedMarketValueNodeModule_ProvideEstimatedMarketValueNodeFactory(module);
  }

  /** Proxies {@link EstimatedMarketValueNodeModule#provideEstimatedMarketValueNode()}. */
  public static EstimatedMarketValueNode proxyProvideEstimatedMarketValueNode(
      EstimatedMarketValueNodeModule instance) {
    return instance.provideEstimatedMarketValueNode();
  }
}
