package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToCurrentAddressNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final MovedToCurrentAddressNodeModule module;

  public MovedToCurrentAddressNodeModule_ProvideObjectUiNodeFactory(
      MovedToCurrentAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(MovedToCurrentAddressNodeModule module) {
    return new MovedToCurrentAddressNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link MovedToCurrentAddressNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(MovedToCurrentAddressNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
