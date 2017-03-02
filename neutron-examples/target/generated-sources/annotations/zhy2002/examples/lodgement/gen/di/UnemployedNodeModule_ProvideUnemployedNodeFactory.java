package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.UnemployedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedNodeModule_ProvideUnemployedNodeFactory
    implements Factory<UnemployedNode> {
  private final UnemployedNodeModule module;

  public UnemployedNodeModule_ProvideUnemployedNodeFactory(UnemployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UnemployedNode get() {
    return Preconditions.checkNotNull(
        module.provideUnemployedNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UnemployedNode> create(UnemployedNodeModule module) {
    return new UnemployedNodeModule_ProvideUnemployedNodeFactory(module);
  }

  /** Proxies {@link UnemployedNodeModule#provideUnemployedNode()}. */
  public static UnemployedNode proxyProvideUnemployedNode(UnemployedNodeModule instance) {
    return instance.provideUnemployedNode();
  }
}
