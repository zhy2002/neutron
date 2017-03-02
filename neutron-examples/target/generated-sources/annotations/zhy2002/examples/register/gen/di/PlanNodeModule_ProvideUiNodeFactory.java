package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlanNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PlanNodeModule module;

  public PlanNodeModule_ProvideUiNodeFactory(PlanNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PlanNodeModule module) {
    return new PlanNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PlanNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PlanNodeModule instance) {
    return instance.provideUiNode();
  }
}
