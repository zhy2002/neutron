package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageClearingFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final MortgageClearingFlagNodeModule module;

  public MortgageClearingFlagNodeModule_ProvideBooleanUiNodeFactory(
      MortgageClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(MortgageClearingFlagNodeModule module) {
    return new MortgageClearingFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link MortgageClearingFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      MortgageClearingFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
