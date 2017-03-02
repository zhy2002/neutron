package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherAssetTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetTypeNodeModule_ProvideOtherAssetTypeNodeFactory
    implements Factory<OtherAssetTypeNode> {
  private final OtherAssetTypeNodeModule module;

  public OtherAssetTypeNodeModule_ProvideOtherAssetTypeNodeFactory(
      OtherAssetTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherAssetTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherAssetTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherAssetTypeNode> create(OtherAssetTypeNodeModule module) {
    return new OtherAssetTypeNodeModule_ProvideOtherAssetTypeNodeFactory(module);
  }

  /** Proxies {@link OtherAssetTypeNodeModule#provideOtherAssetTypeNode()}. */
  public static OtherAssetTypeNode proxyProvideOtherAssetTypeNode(
      OtherAssetTypeNodeModule instance) {
    return instance.provideOtherAssetTypeNode();
  }
}
