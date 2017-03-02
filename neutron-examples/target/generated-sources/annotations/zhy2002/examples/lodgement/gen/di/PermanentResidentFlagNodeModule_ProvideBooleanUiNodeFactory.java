package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PermanentResidentFlagNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final PermanentResidentFlagNodeModule module;

  public PermanentResidentFlagNodeModule_ProvideBooleanUiNodeFactory(
      PermanentResidentFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(PermanentResidentFlagNodeModule module) {
    return new PermanentResidentFlagNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link PermanentResidentFlagNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      PermanentResidentFlagNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
