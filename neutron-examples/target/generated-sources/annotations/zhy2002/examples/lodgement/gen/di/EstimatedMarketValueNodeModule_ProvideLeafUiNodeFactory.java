package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EstimatedMarketValueNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final EstimatedMarketValueNodeModule module;

  public EstimatedMarketValueNodeModule_ProvideLeafUiNodeFactory(
      EstimatedMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(EstimatedMarketValueNodeModule module) {
    return new EstimatedMarketValueNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link EstimatedMarketValueNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(EstimatedMarketValueNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
