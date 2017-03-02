package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredSinceNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final RetiredSinceNodeModule module;

  public RetiredSinceNodeModule_ProvideUiNodeFactory(RetiredSinceNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RetiredSinceNodeModule module) {
    return new RetiredSinceNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RetiredSinceNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RetiredSinceNodeModule instance) {
    return instance.provideUiNode();
  }
}
