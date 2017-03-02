package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditHistoryListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final CreditHistoryListNodeModule module;

  public CreditHistoryListNodeModule_ProvideListUiNodeFactory(CreditHistoryListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(CreditHistoryListNodeModule module) {
    return new CreditHistoryListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link CreditHistoryListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(CreditHistoryListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
