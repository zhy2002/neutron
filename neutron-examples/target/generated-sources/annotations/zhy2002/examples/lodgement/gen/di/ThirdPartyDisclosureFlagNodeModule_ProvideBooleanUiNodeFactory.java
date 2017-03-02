package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDisclosureFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final ThirdPartyDisclosureFlagNodeModule module;

  public ThirdPartyDisclosureFlagNodeModule_ProvideBooleanUiNodeFactory(
      ThirdPartyDisclosureFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(ThirdPartyDisclosureFlagNodeModule module) {
    return new ThirdPartyDisclosureFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDisclosureFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      ThirdPartyDisclosureFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
