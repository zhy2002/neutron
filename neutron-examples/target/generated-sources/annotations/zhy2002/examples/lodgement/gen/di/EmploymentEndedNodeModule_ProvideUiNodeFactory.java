package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final EmploymentEndedNodeModule module;

  public EmploymentEndedNodeModule_ProvideUiNodeFactory(EmploymentEndedNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(EmploymentEndedNodeModule module) {
    return new EmploymentEndedNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link EmploymentEndedNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(EmploymentEndedNodeModule instance) {
    return instance.provideUiNode();
  }
}
