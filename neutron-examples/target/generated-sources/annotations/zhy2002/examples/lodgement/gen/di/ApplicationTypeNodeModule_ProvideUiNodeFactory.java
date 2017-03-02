package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ApplicationTypeNodeModule module;

  public ApplicationTypeNodeModule_ProvideUiNodeFactory(ApplicationTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ApplicationTypeNodeModule module) {
    return new ApplicationTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ApplicationTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ApplicationTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
