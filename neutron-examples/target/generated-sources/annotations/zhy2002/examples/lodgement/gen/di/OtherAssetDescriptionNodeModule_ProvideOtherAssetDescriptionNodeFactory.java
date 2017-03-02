package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherAssetDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetDescriptionNodeModule_ProvideOtherAssetDescriptionNodeFactory
    implements Factory<OtherAssetDescriptionNode> {
  private final OtherAssetDescriptionNodeModule module;

  public OtherAssetDescriptionNodeModule_ProvideOtherAssetDescriptionNodeFactory(
      OtherAssetDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherAssetDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherAssetDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherAssetDescriptionNode> create(OtherAssetDescriptionNodeModule module) {
    return new OtherAssetDescriptionNodeModule_ProvideOtherAssetDescriptionNodeFactory(module);
  }

  /** Proxies {@link OtherAssetDescriptionNodeModule#provideOtherAssetDescriptionNode()}. */
  public static OtherAssetDescriptionNode proxyProvideOtherAssetDescriptionNode(
      OtherAssetDescriptionNodeModule instance) {
    return instance.provideOtherAssetDescriptionNode();
  }
}
