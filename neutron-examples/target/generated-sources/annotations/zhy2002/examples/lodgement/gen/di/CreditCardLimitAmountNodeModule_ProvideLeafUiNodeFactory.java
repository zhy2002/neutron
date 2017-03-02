package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLimitAmountNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CreditCardLimitAmountNodeModule module;

  public CreditCardLimitAmountNodeModule_ProvideLeafUiNodeFactory(
      CreditCardLimitAmountNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CreditCardLimitAmountNodeModule module) {
    return new CreditCardLimitAmountNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardLimitAmountNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CreditCardLimitAmountNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
