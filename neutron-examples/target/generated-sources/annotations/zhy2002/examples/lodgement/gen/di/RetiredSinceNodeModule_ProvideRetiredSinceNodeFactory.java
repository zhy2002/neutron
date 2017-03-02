package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.RetiredSinceNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNodeModule_ProvideRetiredSinceNodeFactory
    implements Factory<RetiredSinceNode> {
  private final RetiredSinceNodeModule module;

  public RetiredSinceNodeModule_ProvideRetiredSinceNodeFactory(RetiredSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RetiredSinceNode get() {
    return Preconditions.checkNotNull(
        module.provideRetiredSinceNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RetiredSinceNode> create(RetiredSinceNodeModule module) {
    return new RetiredSinceNodeModule_ProvideRetiredSinceNodeFactory(module);
  }

  /** Proxies {@link RetiredSinceNodeModule#provideRetiredSinceNode()}. */
  public static RetiredSinceNode proxyProvideRetiredSinceNode(RetiredSinceNodeModule instance) {
    return instance.provideRetiredSinceNode();
  }
}
