package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final AddressRefNodeModule module;

  public AddressRefNodeModule_ProvideUiNodeFactory(AddressRefNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AddressRefNodeModule module) {
    return new AddressRefNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AddressRefNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AddressRefNodeModule instance) {
    return instance.provideUiNode();
  }
}
