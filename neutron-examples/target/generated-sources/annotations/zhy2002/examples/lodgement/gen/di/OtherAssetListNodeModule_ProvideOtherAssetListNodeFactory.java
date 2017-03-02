package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.OtherAssetListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetListNodeModule_ProvideOtherAssetListNodeFactory
    implements Factory<OtherAssetListNode> {
  private final OtherAssetListNodeModule module;

  public OtherAssetListNodeModule_ProvideOtherAssetListNodeFactory(
      OtherAssetListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OtherAssetListNode get() {
    return Preconditions.checkNotNull(
        module.provideOtherAssetListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OtherAssetListNode> create(OtherAssetListNodeModule module) {
    return new OtherAssetListNodeModule_ProvideOtherAssetListNodeFactory(module);
  }

  /** Proxies {@link OtherAssetListNodeModule#provideOtherAssetListNode()}. */
  public static OtherAssetListNode proxyProvideOtherAssetListNode(
      OtherAssetListNodeModule instance) {
    return instance.provideOtherAssetListNode();
  }
}
