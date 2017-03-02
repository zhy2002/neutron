package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityClearingFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherLiabilityClearingFlagNodeModule module;

  public OtherLiabilityClearingFlagNodeModule_ProvideUiNodeFactory(
      OtherLiabilityClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityClearingFlagNodeModule module) {
    return new OtherLiabilityClearingFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityClearingFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityClearingFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
