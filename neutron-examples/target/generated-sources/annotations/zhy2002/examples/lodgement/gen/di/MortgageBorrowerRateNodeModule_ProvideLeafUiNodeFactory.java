package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageBorrowerRateNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageBorrowerRateNodeModule module;

  public MortgageBorrowerRateNodeModule_ProvideLeafUiNodeFactory(
      MortgageBorrowerRateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageBorrowerRateNodeModule module) {
    return new MortgageBorrowerRateNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageBorrowerRateNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(MortgageBorrowerRateNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
