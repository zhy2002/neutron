package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstHomeBuyerFlagNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final FirstHomeBuyerFlagNodeModule module;

  public FirstHomeBuyerFlagNodeModule_ProvideUiNodeFactory(FirstHomeBuyerFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(FirstHomeBuyerFlagNodeModule module) {
    return new FirstHomeBuyerFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link FirstHomeBuyerFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(FirstHomeBuyerFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
