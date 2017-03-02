package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PayeEmployedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeModule_ProvidePayeEmployedNodeFactory
    implements Factory<PayeEmployedNode> {
  private final PayeEmployedNodeModule module;

  public PayeEmployedNodeModule_ProvidePayeEmployedNodeFactory(PayeEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PayeEmployedNode get() {
    return Preconditions.checkNotNull(
        module.providePayeEmployedNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PayeEmployedNode> create(PayeEmployedNodeModule module) {
    return new PayeEmployedNodeModule_ProvidePayeEmployedNodeFactory(module);
  }

  /** Proxies {@link PayeEmployedNodeModule#providePayeEmployedNode()}. */
  public static PayeEmployedNode proxyProvidePayeEmployedNode(PayeEmployedNodeModule instance) {
    return instance.providePayeEmployedNode();
  }
}
