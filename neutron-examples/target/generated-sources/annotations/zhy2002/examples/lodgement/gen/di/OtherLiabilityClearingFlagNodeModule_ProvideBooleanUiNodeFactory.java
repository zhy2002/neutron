package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityClearingFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final OtherLiabilityClearingFlagNodeModule module;

  public OtherLiabilityClearingFlagNodeModule_ProvideBooleanUiNodeFactory(
      OtherLiabilityClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(OtherLiabilityClearingFlagNodeModule module) {
    return new OtherLiabilityClearingFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityClearingFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      OtherLiabilityClearingFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
