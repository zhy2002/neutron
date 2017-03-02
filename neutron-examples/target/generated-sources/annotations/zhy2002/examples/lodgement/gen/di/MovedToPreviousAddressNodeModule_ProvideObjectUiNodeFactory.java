package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final MovedToPreviousAddressNodeModule module;

  public MovedToPreviousAddressNodeModule_ProvideObjectUiNodeFactory(
      MovedToPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(MovedToPreviousAddressNodeModule module) {
    return new MovedToPreviousAddressNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link MovedToPreviousAddressNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(
      MovedToPreviousAddressNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
