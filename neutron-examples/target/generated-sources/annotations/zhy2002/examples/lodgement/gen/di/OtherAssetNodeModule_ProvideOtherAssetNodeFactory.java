package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherAssetNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNodeModule_ProvideOtherAssetNodeFactory
    implements Factory<OtherAssetNode> {
  private final OtherAssetNodeModule module;

  public OtherAssetNodeModule_ProvideOtherAssetNodeFactory(OtherAssetNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherAssetNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherAssetNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherAssetNode> create(OtherAssetNodeModule module) {
    return new OtherAssetNodeModule_ProvideOtherAssetNodeFactory(module);
  }

  /** Proxies {@link OtherAssetNodeModule#provideOtherAssetNode()}. */
  public static OtherAssetNode proxyProvideOtherAssetNode(OtherAssetNodeModule instance) {
    return instance.provideOtherAssetNode();
  }
}
