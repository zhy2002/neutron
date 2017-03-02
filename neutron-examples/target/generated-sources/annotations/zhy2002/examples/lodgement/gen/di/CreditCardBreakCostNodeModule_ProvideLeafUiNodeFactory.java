package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardBreakCostNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CreditCardBreakCostNodeModule module;

  public CreditCardBreakCostNodeModule_ProvideLeafUiNodeFactory(
      CreditCardBreakCostNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CreditCardBreakCostNodeModule module) {
    return new CreditCardBreakCostNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardBreakCostNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CreditCardBreakCostNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
