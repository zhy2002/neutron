package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmployedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeModule_ProvideEmployedNodeFactory
    implements Factory<EmployedNode> {
  private final SelfEmployedNodeModule module;

  public SelfEmployedNodeModule_ProvideEmployedNodeFactory(SelfEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmployedNode get() {
    return Preconditions.checkNotNull(
        module.provideEmployedNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmployedNode> create(SelfEmployedNodeModule module) {
    return new SelfEmployedNodeModule_ProvideEmployedNodeFactory(module);
  }

  /** Proxies {@link SelfEmployedNodeModule#provideEmployedNode()}. */
  public static EmployedNode proxyProvideEmployedNode(SelfEmployedNodeModule instance) {
    return instance.provideEmployedNode();
  }
}
