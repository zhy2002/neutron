package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertySubTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PropertySubTypeNodeModule module;

  public PropertySubTypeNodeModule_ProvideUiNodeFactory(PropertySubTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PropertySubTypeNodeModule module) {
    return new PropertySubTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PropertySubTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PropertySubTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
