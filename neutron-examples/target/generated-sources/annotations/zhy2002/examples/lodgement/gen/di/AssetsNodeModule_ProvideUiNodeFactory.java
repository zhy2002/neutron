package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AssetsNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final AssetsNodeModule module;

  public AssetsNodeModule_ProvideUiNodeFactory(AssetsNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AssetsNodeModule module) {
    return new AssetsNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AssetsNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AssetsNodeModule instance) {
    return instance.provideUiNode();
  }
}
