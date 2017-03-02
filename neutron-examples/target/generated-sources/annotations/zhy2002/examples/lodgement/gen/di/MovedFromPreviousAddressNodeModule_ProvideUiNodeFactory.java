package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MovedFromPreviousAddressNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MovedFromPreviousAddressNodeModule module;

  public MovedFromPreviousAddressNodeModule_ProvideUiNodeFactory(
      MovedFromPreviousAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MovedFromPreviousAddressNodeModule module) {
    return new MovedFromPreviousAddressNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MovedFromPreviousAddressNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MovedFromPreviousAddressNodeModule instance) {
    return instance.provideUiNode();
  }
}
