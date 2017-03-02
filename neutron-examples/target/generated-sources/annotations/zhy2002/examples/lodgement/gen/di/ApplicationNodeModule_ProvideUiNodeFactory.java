package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ApplicationNodeModule module;

  public ApplicationNodeModule_ProvideUiNodeFactory(ApplicationNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ApplicationNodeModule module) {
    return new ApplicationNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ApplicationNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ApplicationNodeModule instance) {
    return instance.provideUiNode();
  }
}
