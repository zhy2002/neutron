package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNodeModule_ProvideStringUiNodeFactory
    implements Factory<StringUiNode<?>> {
  private final AreaCodeNodeModule module;

  public AreaCodeNodeModule_ProvideStringUiNodeFactory(AreaCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public StringUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideStringUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<StringUiNode<?>> create(AreaCodeNodeModule module) {
    return new AreaCodeNodeModule_ProvideStringUiNodeFactory(module);
  }

  /** Proxies {@link AreaCodeNodeModule#provideStringUiNode()}. */
  public static StringUiNode<?> proxyProvideStringUiNode(AreaCodeNodeModule instance) {
    return instance.provideStringUiNode();
  }
}
