package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PropertyTypeNodeModule module;

  public PropertyTypeNodeModule_ProvideUiNodeFactory(PropertyTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PropertyTypeNodeModule module) {
    return new PropertyTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PropertyTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PropertyTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
