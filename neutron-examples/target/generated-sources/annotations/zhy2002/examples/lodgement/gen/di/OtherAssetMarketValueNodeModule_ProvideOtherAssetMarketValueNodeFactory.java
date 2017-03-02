package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherAssetMarketValueNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetMarketValueNodeModule_ProvideOtherAssetMarketValueNodeFactory
    implements Factory<OtherAssetMarketValueNode> {
  private final OtherAssetMarketValueNodeModule module;

  public OtherAssetMarketValueNodeModule_ProvideOtherAssetMarketValueNodeFactory(
      OtherAssetMarketValueNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherAssetMarketValueNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherAssetMarketValueNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherAssetMarketValueNode> create(OtherAssetMarketValueNodeModule module) {
    return new OtherAssetMarketValueNodeModule_ProvideOtherAssetMarketValueNodeFactory(module);
  }

  /** Proxies {@link OtherAssetMarketValueNodeModule#provideOtherAssetMarketValueNode()}. */
  public static OtherAssetMarketValueNode proxyProvideOtherAssetMarketValueNode(
      OtherAssetMarketValueNodeModule instance) {
    return instance.provideOtherAssetMarketValueNode();
  }
}
