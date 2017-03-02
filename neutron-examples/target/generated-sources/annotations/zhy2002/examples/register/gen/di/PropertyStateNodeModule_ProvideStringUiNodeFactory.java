package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyStateNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final PropertyStateNodeModule module;

  public PropertyStateNodeModule_ProvideStringUiNodeFactory(PropertyStateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(PropertyStateNodeModule module) {
    return new PropertyStateNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link PropertyStateNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(PropertyStateNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
