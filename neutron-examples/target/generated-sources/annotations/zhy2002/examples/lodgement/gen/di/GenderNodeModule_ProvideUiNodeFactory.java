package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GenderNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final GenderNodeModule module;

  public GenderNodeModule_ProvideUiNodeFactory(GenderNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(GenderNodeModule module) {
    return new GenderNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link GenderNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(GenderNodeModule instance) {
    return instance.provideUiNode();
  }
}
