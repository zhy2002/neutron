package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageTermRemainingPeriodNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final MortgageTermRemainingPeriodNodeModule module;

  public MortgageTermRemainingPeriodNodeModule_ProvideUiNodeFactory(
      MortgageTermRemainingPeriodNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(MortgageTermRemainingPeriodNodeModule module) {
    return new MortgageTermRemainingPeriodNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link MortgageTermRemainingPeriodNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(MortgageTermRemainingPeriodNodeModule instance) {
    return instance.provideUiNode();
  }
}
