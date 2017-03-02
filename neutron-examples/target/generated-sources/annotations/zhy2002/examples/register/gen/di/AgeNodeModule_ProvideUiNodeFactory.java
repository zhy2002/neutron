package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AgeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final AgeNodeModule module;

  public AgeNodeModule_ProvideUiNodeFactory(AgeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AgeNodeModule module) {
    return new AgeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AgeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AgeNodeModule instance) {
    return instance.provideUiNode();
  }
}
