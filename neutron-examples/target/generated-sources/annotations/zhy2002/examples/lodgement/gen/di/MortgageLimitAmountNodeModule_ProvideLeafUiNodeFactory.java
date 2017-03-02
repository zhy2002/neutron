package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageLimitAmountNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final MortgageLimitAmountNodeModule module;

  public MortgageLimitAmountNodeModule_ProvideLeafUiNodeFactory(
      MortgageLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(MortgageLimitAmountNodeModule module) {
    return new MortgageLimitAmountNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link MortgageLimitAmountNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(MortgageLimitAmountNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
