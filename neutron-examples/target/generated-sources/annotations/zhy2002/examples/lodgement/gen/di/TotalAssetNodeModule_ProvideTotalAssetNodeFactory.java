package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TotalAssetNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalAssetNodeModule_ProvideTotalAssetNodeFactory
    implements Factory<TotalAssetNode> {
  private final TotalAssetNodeModule module;

  public TotalAssetNodeModule_ProvideTotalAssetNodeFactory(TotalAssetNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TotalAssetNode get() {
    return Preconditions.checkNotNull(
        module.provideTotalAssetNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TotalAssetNode> create(TotalAssetNodeModule module) {
    return new TotalAssetNodeModule_ProvideTotalAssetNodeFactory(module);
  }

  /** Proxies {@link TotalAssetNodeModule#provideTotalAssetNode()}. */
  public static TotalAssetNode proxyProvideTotalAssetNode(TotalAssetNodeModule instance) {
    return instance.provideTotalAssetNode();
  }
}
