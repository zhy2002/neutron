package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BigDecimalUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyWeeklyRentNodeModule_ProvideBigDecimalUiNodeFactory
    implements Factory<BigDecimalUiNode<?>> {
  private final PropertyWeeklyRentNodeModule module;

  public PropertyWeeklyRentNodeModule_ProvideBigDecimalUiNodeFactory(
      PropertyWeeklyRentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BigDecimalUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBigDecimalUiNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BigDecimalUiNode<?>> create(PropertyWeeklyRentNodeModule module) {
    return new PropertyWeeklyRentNodeModule_ProvideBigDecimalUiNodeFactory(module);
  }

  /** Proxies {@link PropertyWeeklyRentNodeModule#provideBigDecimalUiNode()}. */
  public static BigDecimalUiNode<?> proxyProvideBigDecimalUiNode(
      PropertyWeeklyRentNodeModule instance) {
    return instance.provideBigDecimalUiNode();
  }
}