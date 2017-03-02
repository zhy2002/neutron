package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PayeEmployedNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PayeEmployedNodeModule module;

  public PayeEmployedNodeModule_ProvideObjectUiNodeFactory(PayeEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PayeEmployedNodeModule module) {
    return new PayeEmployedNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PayeEmployedNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PayeEmployedNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
