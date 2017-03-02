package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityLimitAmountNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherLiabilityLimitAmountNodeModule module;

  public OtherLiabilityLimitAmountNodeModule_ProvideUiNodeFactory(
      OtherLiabilityLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityLimitAmountNodeModule module) {
    return new OtherLiabilityLimitAmountNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityLimitAmountNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityLimitAmountNodeModule instance) {
    return instance.provideUiNode();
  }
}
