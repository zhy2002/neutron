package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.UnemployedOnBenefitFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedOnBenefitFlagNodeModule_ProvideUnemployedOnBenefitFlagNodeFactory
    implements Factory<UnemployedOnBenefitFlagNode> {
  private final UnemployedOnBenefitFlagNodeModule module;

  public UnemployedOnBenefitFlagNodeModule_ProvideUnemployedOnBenefitFlagNodeFactory(
      UnemployedOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UnemployedOnBenefitFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideUnemployedOnBenefitFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UnemployedOnBenefitFlagNode> create(
      UnemployedOnBenefitFlagNodeModule module) {
    return new UnemployedOnBenefitFlagNodeModule_ProvideUnemployedOnBenefitFlagNodeFactory(module);
  }

  /** Proxies {@link UnemployedOnBenefitFlagNodeModule#provideUnemployedOnBenefitFlagNode()}. */
  public static UnemployedOnBenefitFlagNode proxyProvideUnemployedOnBenefitFlagNode(
      UnemployedOnBenefitFlagNodeModule instance) {
    return instance.provideUnemployedOnBenefitFlagNode();
  }
}
