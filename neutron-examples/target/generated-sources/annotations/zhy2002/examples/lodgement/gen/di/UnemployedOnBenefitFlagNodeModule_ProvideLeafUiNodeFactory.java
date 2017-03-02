package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedOnBenefitFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final UnemployedOnBenefitFlagNodeModule module;

  public UnemployedOnBenefitFlagNodeModule_ProvideLeafUiNodeFactory(
      UnemployedOnBenefitFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(UnemployedOnBenefitFlagNodeModule module) {
    return new UnemployedOnBenefitFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link UnemployedOnBenefitFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      UnemployedOnBenefitFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
