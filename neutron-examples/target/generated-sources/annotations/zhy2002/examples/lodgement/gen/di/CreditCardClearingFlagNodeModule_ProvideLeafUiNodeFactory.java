package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CreditCardClearingFlagNodeModule module;

  public CreditCardClearingFlagNodeModule_ProvideLeafUiNodeFactory(
      CreditCardClearingFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CreditCardClearingFlagNodeModule module) {
    return new CreditCardClearingFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardClearingFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CreditCardClearingFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
