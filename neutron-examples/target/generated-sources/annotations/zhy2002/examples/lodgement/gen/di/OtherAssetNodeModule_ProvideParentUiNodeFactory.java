package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final OtherAssetNodeModule module;

  public OtherAssetNodeModule_ProvideParentUiNodeFactory(OtherAssetNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(OtherAssetNodeModule module) {
    return new OtherAssetNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link OtherAssetNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(OtherAssetNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
