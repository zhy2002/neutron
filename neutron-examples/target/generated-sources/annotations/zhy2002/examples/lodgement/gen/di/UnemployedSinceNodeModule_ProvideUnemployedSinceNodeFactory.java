package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.UnemployedSinceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedSinceNodeModule_ProvideUnemployedSinceNodeFactory
    implements Factory<UnemployedSinceNode> {
  private final UnemployedSinceNodeModule module;

  public UnemployedSinceNodeModule_ProvideUnemployedSinceNodeFactory(
      UnemployedSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UnemployedSinceNode get() {
    return Preconditions.checkNotNull(
        module.provideUnemployedSinceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UnemployedSinceNode> create(UnemployedSinceNodeModule module) {
    return new UnemployedSinceNodeModule_ProvideUnemployedSinceNodeFactory(module);
  }

  /** Proxies {@link UnemployedSinceNodeModule#provideUnemployedSinceNode()}. */
  public static UnemployedSinceNode proxyProvideUnemployedSinceNode(
      UnemployedSinceNodeModule instance) {
    return instance.provideUnemployedSinceNode();
  }
}
