package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LastNameNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LastNameNodeModule module;

  public LastNameNodeModule_ProvideUiNodeFactory(LastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LastNameNodeModule module) {
    return new LastNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LastNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LastNameNodeModule instance) {
    return instance.provideUiNode();
  }
}