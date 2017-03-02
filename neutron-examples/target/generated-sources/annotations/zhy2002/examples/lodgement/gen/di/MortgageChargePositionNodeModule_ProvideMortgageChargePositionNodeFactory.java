package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.MortgageChargePositionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageChargePositionNodeModule_ProvideMortgageChargePositionNodeFactory
    implements Factory<MortgageChargePositionNode> {
  private final MortgageChargePositionNodeModule module;

  public MortgageChargePositionNodeModule_ProvideMortgageChargePositionNodeFactory(
      MortgageChargePositionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public MortgageChargePositionNode get() {
    return Preconditions.checkNotNull(
        module.provideMortgageChargePositionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MortgageChargePositionNode> create(
      MortgageChargePositionNodeModule module) {
    return new MortgageChargePositionNodeModule_ProvideMortgageChargePositionNodeFactory(module);
  }

  /** Proxies {@link MortgageChargePositionNodeModule#provideMortgageChargePositionNode()}. */
  public static MortgageChargePositionNode proxyProvideMortgageChargePositionNode(
      MortgageChargePositionNodeModule instance) {
    return instance.provideMortgageChargePositionNode();
  }
}
