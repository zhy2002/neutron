package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityBreakCostNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherLiabilityBreakCostNodeModule module;

  public OtherLiabilityBreakCostNodeModule_ProvideUiNodeFactory(
      OtherLiabilityBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityBreakCostNodeModule module) {
    return new OtherLiabilityBreakCostNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityBreakCostNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityBreakCostNodeModule instance) {
    return instance.provideUiNode();
  }
}
