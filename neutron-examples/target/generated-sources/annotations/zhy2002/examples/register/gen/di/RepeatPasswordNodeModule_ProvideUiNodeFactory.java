package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RepeatPasswordNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final RepeatPasswordNodeModule module;

  public RepeatPasswordNodeModule_ProvideUiNodeFactory(RepeatPasswordNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RepeatPasswordNodeModule module) {
    return new RepeatPasswordNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RepeatPasswordNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RepeatPasswordNodeModule instance) {
    return instance.provideUiNode();
  }
}
