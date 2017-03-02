package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final CompanyOtherIncomeListNodeModule module;

  public CompanyOtherIncomeListNodeModule_ProvideListUiNodeFactory(
      CompanyOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(CompanyOtherIncomeListNodeModule module) {
    return new CompanyOtherIncomeListNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link CompanyOtherIncomeListNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(CompanyOtherIncomeListNodeModule instance) {
    return instance.provideListUiNode();
  }
}
