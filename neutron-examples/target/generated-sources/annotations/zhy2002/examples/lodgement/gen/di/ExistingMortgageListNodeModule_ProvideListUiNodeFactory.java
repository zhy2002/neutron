package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final ExistingMortgageListNodeModule module;

  public ExistingMortgageListNodeModule_ProvideListUiNodeFactory(
      ExistingMortgageListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(ExistingMortgageListNodeModule module) {
    return new ExistingMortgageListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link ExistingMortgageListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(ExistingMortgageListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
