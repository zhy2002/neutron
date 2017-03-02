package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyWeeklyRentNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PropertyWeeklyRentNodeModule module;

  public PropertyWeeklyRentNodeModule_ProvideUiNodeFactory(PropertyWeeklyRentNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PropertyWeeklyRentNodeModule module) {
    return new PropertyWeeklyRentNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PropertyWeeklyRentNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PropertyWeeklyRentNodeModule instance) {
    return instance.provideUiNode();
  }
}
