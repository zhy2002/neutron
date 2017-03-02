package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitPreviousYearNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final ProfitPreviousYearNodeModule module;

  public ProfitPreviousYearNodeModule_ProvideUiNodeFactory(ProfitPreviousYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(ProfitPreviousYearNodeModule module) {
    return new ProfitPreviousYearNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link ProfitPreviousYearNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(ProfitPreviousYearNodeModule instance) {
    return instance.provideUiNode();
  }
}
