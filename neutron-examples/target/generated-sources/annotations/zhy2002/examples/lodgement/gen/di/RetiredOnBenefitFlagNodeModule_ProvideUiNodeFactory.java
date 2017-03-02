package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredOnBenefitFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final RetiredOnBenefitFlagNodeModule module;

  public RetiredOnBenefitFlagNodeModule_ProvideUiNodeFactory(
      RetiredOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(RetiredOnBenefitFlagNodeModule module) {
    return new RetiredOnBenefitFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link RetiredOnBenefitFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(RetiredOnBenefitFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
