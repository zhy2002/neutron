package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerAddressNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final EmployerAddressNodeModule module;

  public EmployerAddressNodeModule_ProvideUiNodeFactory(EmployerAddressNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(EmployerAddressNodeModule module) {
    return new EmployerAddressNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link EmployerAddressNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(EmployerAddressNodeModule instance) {
    return instance.provideUiNode();
  }
}
