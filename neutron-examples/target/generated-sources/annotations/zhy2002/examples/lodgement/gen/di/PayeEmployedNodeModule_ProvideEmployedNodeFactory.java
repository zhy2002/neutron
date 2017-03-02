package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.EmployedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeModule_ProvideEmployedNodeFactory
    implements Factory<EmployedNode> {
  private final PayeEmployedNodeModule module;

  public PayeEmployedNodeModule_ProvideEmployedNodeFactory(PayeEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public EmployedNode get() {
    return Preconditions.checkNotNull(
        module.provideEmployedNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EmployedNode> create(PayeEmployedNodeModule module) {
    return new PayeEmployedNodeModule_ProvideEmployedNodeFactory(module);
  }

  /** Proxies {@link PayeEmployedNodeModule#provideEmployedNode()}. */
  public static EmployedNode proxyProvideEmployedNode(PayeEmployedNodeModule instance) {
    return instance.provideEmployedNode();
  }
}
