package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedOnBenefitFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final UnemployedOnBenefitFlagNodeModule module;

  public UnemployedOnBenefitFlagNodeModule_ProvideUiNodeFactory(
      UnemployedOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(UnemployedOnBenefitFlagNodeModule module) {
    return new UnemployedOnBenefitFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link UnemployedOnBenefitFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(UnemployedOnBenefitFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
