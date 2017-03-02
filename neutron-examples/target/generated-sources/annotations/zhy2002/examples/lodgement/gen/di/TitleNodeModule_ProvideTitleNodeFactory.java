package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TitleNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TitleNodeModule_ProvideTitleNodeFactory implements Factory<TitleNode> {
  private final TitleNodeModule module;

  public TitleNodeModule_ProvideTitleNodeFactory(TitleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TitleNode get() {
    return Preconditions.checkNotNull(
        module.provideTitleNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TitleNode> create(TitleNodeModule module) {
    return new TitleNodeModule_ProvideTitleNodeFactory(module);
  }

  /** Proxies {@link TitleNodeModule#provideTitleNode()}. */
  public static TitleNode proxyProvideTitleNode(TitleNodeModule instance) {
    return instance.provideTitleNode();
  }
}
