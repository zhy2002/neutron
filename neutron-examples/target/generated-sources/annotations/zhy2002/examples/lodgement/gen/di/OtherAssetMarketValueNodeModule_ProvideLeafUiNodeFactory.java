package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetMarketValueNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final OtherAssetMarketValueNodeModule module;

  public OtherAssetMarketValueNodeModule_ProvideLeafUiNodeFactory(
      OtherAssetMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(OtherAssetMarketValueNodeModule module) {
    return new OtherAssetMarketValueNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link OtherAssetMarketValueNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(OtherAssetMarketValueNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
