package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GrossYearlySalaryNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final GrossYearlySalaryNodeModule module;

  public GrossYearlySalaryNodeModule_ProvideUiNodeFactory(GrossYearlySalaryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(GrossYearlySalaryNodeModule module) {
    return new GrossYearlySalaryNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link GrossYearlySalaryNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(GrossYearlySalaryNodeModule instance) {
    return instance.provideUiNode();
  }
}
