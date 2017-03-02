package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final LoanListNodeModule module;

  public LoanListNodeModule_ProvideListUiNodeFactory(LoanListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(LoanListNodeModule module) {
    return new LoanListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link LoanListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(LoanListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
