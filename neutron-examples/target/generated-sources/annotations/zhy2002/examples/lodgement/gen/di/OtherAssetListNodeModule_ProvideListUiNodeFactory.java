package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherAssetListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final OtherAssetListNodeModule module;

  public OtherAssetListNodeModule_ProvideListUiNodeFactory(OtherAssetListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(OtherAssetListNodeModule module) {
    return new OtherAssetListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link OtherAssetListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(OtherAssetListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
