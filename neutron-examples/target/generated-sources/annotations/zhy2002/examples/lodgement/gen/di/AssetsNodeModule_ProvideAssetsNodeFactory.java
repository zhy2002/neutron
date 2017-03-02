package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.AssetsNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNodeModule_ProvideAssetsNodeFactory implements Factory<AssetsNode> {
  private final AssetsNodeModule module;

  public AssetsNodeModule_ProvideAssetsNodeFactory(AssetsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AssetsNode get() {
    return Preconditions.checkNotNull(
        module.provideAssetsNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AssetsNode> create(AssetsNodeModule module) {
    return new AssetsNodeModule_ProvideAssetsNodeFactory(module);
  }

  /** Proxies {@link AssetsNodeModule#provideAssetsNode()}. */
  public static AssetsNode proxyProvideAssetsNode(AssetsNodeModule instance) {
    return instance.provideAssetsNode();
  }
}
