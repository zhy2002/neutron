package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelfEmployedNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final SelfEmployedNodeModule module;

  public SelfEmployedNodeModule_ProvideObjectUiNodeFactory(SelfEmployedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(SelfEmployedNodeModule module) {
    return new SelfEmployedNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link SelfEmployedNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(SelfEmployedNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
