package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriversLicenseNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final DriversLicenseNodeModule module;

  public DriversLicenseNodeModule_ProvideUiNodeFactory(DriversLicenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(DriversLicenseNodeModule module) {
    return new DriversLicenseNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link DriversLicenseNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(DriversLicenseNodeModule instance) {
    return instance.provideUiNode();
  }
}
