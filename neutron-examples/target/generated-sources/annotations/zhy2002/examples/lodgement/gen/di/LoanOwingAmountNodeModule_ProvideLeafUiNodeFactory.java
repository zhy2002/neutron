package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanOwingAmountNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final LoanOwingAmountNodeModule module;

  public LoanOwingAmountNodeModule_ProvideLeafUiNodeFactory(LoanOwingAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(LoanOwingAmountNodeModule module) {
    return new LoanOwingAmountNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link LoanOwingAmountNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(LoanOwingAmountNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
