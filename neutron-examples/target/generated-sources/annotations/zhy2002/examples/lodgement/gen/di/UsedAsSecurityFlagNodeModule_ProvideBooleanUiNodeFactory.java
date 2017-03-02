package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsedAsSecurityFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final UsedAsSecurityFlagNodeModule module;

  public UsedAsSecurityFlagNodeModule_ProvideBooleanUiNodeFactory(
      UsedAsSecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(UsedAsSecurityFlagNodeModule module) {
    return new UsedAsSecurityFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link UsedAsSecurityFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(UsedAsSecurityFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
