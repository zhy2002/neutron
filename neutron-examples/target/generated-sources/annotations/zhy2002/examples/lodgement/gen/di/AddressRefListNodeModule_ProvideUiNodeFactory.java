package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressRefListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final AddressRefListNodeModule module;

  public AddressRefListNodeModule_ProvideUiNodeFactory(AddressRefListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AddressRefListNodeModule module) {
    return new AddressRefListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AddressRefListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AddressRefListNodeModule instance) {
    return instance.provideUiNode();
  }
}
