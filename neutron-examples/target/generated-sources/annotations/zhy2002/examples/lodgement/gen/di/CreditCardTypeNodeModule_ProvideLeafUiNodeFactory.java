package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CreditCardTypeNodeModule module;

  public CreditCardTypeNodeModule_ProvideLeafUiNodeFactory(CreditCardTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CreditCardTypeNodeModule module) {
    return new CreditCardTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CreditCardTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
