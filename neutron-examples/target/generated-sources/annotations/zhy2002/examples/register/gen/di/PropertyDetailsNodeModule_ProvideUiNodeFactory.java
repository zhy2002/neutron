package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PropertyDetailsNodeModule module;

  public PropertyDetailsNodeModule_ProvideUiNodeFactory(PropertyDetailsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PropertyDetailsNodeModule module) {
    return new PropertyDetailsNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PropertyDetailsNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PropertyDetailsNodeModule instance) {
    return instance.provideUiNode();
  }
}
