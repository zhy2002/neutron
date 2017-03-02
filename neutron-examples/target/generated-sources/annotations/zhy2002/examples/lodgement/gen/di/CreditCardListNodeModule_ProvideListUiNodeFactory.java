package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final CreditCardListNodeModule module;

  public CreditCardListNodeModule_ProvideListUiNodeFactory(CreditCardListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(CreditCardListNodeModule module) {
    return new CreditCardListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link CreditCardListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(CreditCardListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
