package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedFromPreviousAddressNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final MovedFromPreviousAddressNodeModule module;

  public MovedFromPreviousAddressNodeModule_ProvideObjectUiNodeFactory(
      MovedFromPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(MovedFromPreviousAddressNodeModule module) {
    return new MovedFromPreviousAddressNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link MovedFromPreviousAddressNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(
      MovedFromPreviousAddressNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
