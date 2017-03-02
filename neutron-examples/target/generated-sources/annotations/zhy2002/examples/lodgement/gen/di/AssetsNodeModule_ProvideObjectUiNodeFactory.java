package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNodeModule_ProvideObjectUiNodeFactory implements Factory<ObjectUiNode<?>> {
  private final AssetsNodeModule module;

  public AssetsNodeModule_ProvideObjectUiNodeFactory(AssetsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(AssetsNodeModule module) {
    return new AssetsNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link AssetsNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(AssetsNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
