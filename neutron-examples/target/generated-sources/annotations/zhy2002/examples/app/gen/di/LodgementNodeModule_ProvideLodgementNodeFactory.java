package zhy2002.examples.app.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.app.gen.node.LodgementNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LodgementNodeModule_ProvideLodgementNodeFactory
    implements Factory<LodgementNode> {
  private final LodgementNodeModule module;

  public LodgementNodeModule_ProvideLodgementNodeFactory(LodgementNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LodgementNode get() {
    return Preconditions.checkNotNull(
        module.provideLodgementNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LodgementNode> create(LodgementNodeModule module) {
    return new LodgementNodeModule_ProvideLodgementNodeFactory(module);
  }

  /** Proxies {@link LodgementNodeModule#provideLodgementNode()}. */
  public static LodgementNode proxyProvideLodgementNode(LodgementNodeModule instance) {
    return instance.provideLodgementNode();
  }
}
