package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerNameNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final EmployerNameNodeModule module;

  public EmployerNameNodeModule_ProvideUiNodeFactory(EmployerNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(EmployerNameNodeModule module) {
    return new EmployerNameNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link EmployerNameNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(EmployerNameNodeModule instance) {
    return instance.provideUiNode();
  }
}
