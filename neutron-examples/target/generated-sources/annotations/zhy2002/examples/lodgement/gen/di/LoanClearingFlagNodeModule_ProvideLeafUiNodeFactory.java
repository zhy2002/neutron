package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanClearingFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final LoanClearingFlagNodeModule module;

  public LoanClearingFlagNodeModule_ProvideLeafUiNodeFactory(LoanClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(LoanClearingFlagNodeModule module) {
    return new LoanClearingFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link LoanClearingFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(LoanClearingFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
