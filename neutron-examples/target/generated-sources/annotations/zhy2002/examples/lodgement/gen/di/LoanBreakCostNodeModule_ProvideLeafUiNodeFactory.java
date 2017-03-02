package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanBreakCostNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final LoanBreakCostNodeModule module;

  public LoanBreakCostNodeModule_ProvideLeafUiNodeFactory(LoanBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(LoanBreakCostNodeModule module) {
    return new LoanBreakCostNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link LoanBreakCostNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(LoanBreakCostNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
