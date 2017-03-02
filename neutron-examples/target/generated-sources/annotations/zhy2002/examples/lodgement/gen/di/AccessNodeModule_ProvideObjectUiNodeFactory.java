package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNodeModule_ProvideObjectUiNodeFactory implements Factory<ObjectUiNode<?>> {
  private final AccessNodeModule module;

  public AccessNodeModule_ProvideObjectUiNodeFactory(AccessNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(AccessNodeModule module) {
    return new AccessNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link AccessNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(AccessNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
