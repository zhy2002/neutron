package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SpouseNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final SpouseNodeModule module;

  public SpouseNodeModule_ProvideUiNodeFactory(SpouseNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(SpouseNodeModule module) {
    return new SpouseNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link SpouseNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(SpouseNodeModule instance) {
    return instance.provideUiNode();
  }
}
