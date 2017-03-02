package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardAmountOwingNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CreditCardAmountOwingNodeModule module;

  public CreditCardAmountOwingNodeModule_ProvideLeafUiNodeFactory(
      CreditCardAmountOwingNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CreditCardAmountOwingNodeModule module) {
    return new CreditCardAmountOwingNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardAmountOwingNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CreditCardAmountOwingNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
