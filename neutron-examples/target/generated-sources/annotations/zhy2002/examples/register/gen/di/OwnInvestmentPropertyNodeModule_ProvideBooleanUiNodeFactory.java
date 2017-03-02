package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnInvestmentPropertyNodeModule_ProvideBooleanUiNodeFactory
    implements Factory<BooleanUiNode<?>> {
  private final OwnInvestmentPropertyNodeModule module;

  public OwnInvestmentPropertyNodeModule_ProvideBooleanUiNodeFactory(
      OwnInvestmentPropertyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BooleanUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBooleanUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BooleanUiNode<?>> create(OwnInvestmentPropertyNodeModule module) {
    return new OwnInvestmentPropertyNodeModule_ProvideBooleanUiNodeFactory(module);
  }

  /** Proxies {@link OwnInvestmentPropertyNodeModule#provideBooleanUiNode()}. */
  public static BooleanUiNode<?> proxyProvideBooleanUiNode(
      OwnInvestmentPropertyNodeModule instance) {
    return instance.provideBooleanUiNode();
  }
}
