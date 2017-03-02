package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MotorVehicleListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final MotorVehicleListNodeModule module;

  public MotorVehicleListNodeModule_ProvideListUiNodeFactory(MotorVehicleListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(MotorVehicleListNodeModule module) {
    return new MotorVehicleListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link MotorVehicleListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(MotorVehicleListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
