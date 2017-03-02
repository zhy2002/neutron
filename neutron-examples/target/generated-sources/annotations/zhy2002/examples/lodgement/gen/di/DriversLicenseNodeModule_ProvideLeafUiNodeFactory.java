package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DriversLicenseNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final DriversLicenseNodeModule module;

  public DriversLicenseNodeModule_ProvideLeafUiNodeFactory(DriversLicenseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(DriversLicenseNodeModule module) {
    return new DriversLicenseNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link DriversLicenseNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(DriversLicenseNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
