package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PropertyNodeModule module;

  public PropertyNodeModule_ProvideUiNodeFactory(PropertyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PropertyNodeModule module) {
    return new PropertyNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PropertyNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PropertyNodeModule instance) {
    return instance.provideUiNode();
  }
}
