package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final AreaCodeNodeModule module;

  public AreaCodeNodeModule_ProvideUiNodeFactory(AreaCodeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AreaCodeNodeModule module) {
    return new AreaCodeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AreaCodeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AreaCodeNodeModule instance) {
    return instance.provideUiNode();
  }
}
