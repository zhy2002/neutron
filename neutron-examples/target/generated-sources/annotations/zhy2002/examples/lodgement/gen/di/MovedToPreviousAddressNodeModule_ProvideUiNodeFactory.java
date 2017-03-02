package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedToPreviousAddressNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MovedToPreviousAddressNodeModule module;

  public MovedToPreviousAddressNodeModule_ProvideUiNodeFactory(
      MovedToPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MovedToPreviousAddressNodeModule module) {
    return new MovedToPreviousAddressNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MovedToPreviousAddressNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MovedToPreviousAddressNodeModule instance) {
    return instance.provideUiNode();
  }
}
