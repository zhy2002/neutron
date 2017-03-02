package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentStartedNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final EmploymentStartedNodeModule module;

  public EmploymentStartedNodeModule_ProvideUiNodeFactory(EmploymentStartedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(EmploymentStartedNodeModule module) {
    return new EmploymentStartedNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentStartedNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(EmploymentStartedNodeModule instance) {
    return instance.provideUiNode();
  }
}
