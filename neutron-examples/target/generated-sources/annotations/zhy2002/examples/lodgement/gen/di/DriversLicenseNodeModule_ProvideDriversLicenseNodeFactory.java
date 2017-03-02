package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.DriversLicenseNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriversLicenseNodeModule_ProvideDriversLicenseNodeFactory
    implements Factory<DriversLicenseNode> {
  private final DriversLicenseNodeModule module;

  public DriversLicenseNodeModule_ProvideDriversLicenseNodeFactory(
      DriversLicenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DriversLicenseNode get() {
    return Preconditions.checkNotNull(
        module.provideDriversLicenseNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DriversLicenseNode> create(DriversLicenseNodeModule module) {
    return new DriversLicenseNodeModule_ProvideDriversLicenseNodeFactory(module);
  }

  /** Proxies {@link DriversLicenseNodeModule#provideDriversLicenseNode()}. */
  public static DriversLicenseNode proxyProvideDriversLicenseNode(
      DriversLicenseNodeModule instance) {
    return instance.provideDriversLicenseNode();
  }
}
