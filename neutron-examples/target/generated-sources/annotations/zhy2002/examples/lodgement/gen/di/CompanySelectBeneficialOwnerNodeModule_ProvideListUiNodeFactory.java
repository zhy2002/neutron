package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ListUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectBeneficialOwnerNodeModule_ProvideListUiNodeFactory
    implements Factory<ListUiNode<?, ?>> {
  private final CompanySelectBeneficialOwnerNodeModule module;

  public CompanySelectBeneficialOwnerNodeModule_ProvideListUiNodeFactory(
      CompanySelectBeneficialOwnerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ListUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideListUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ListUiNode<?, ?>> create(CompanySelectBeneficialOwnerNodeModule module) {
    return new CompanySelectBeneficialOwnerNodeModule_ProvideListUiNodeFactory(module);
  }

  /** Proxies {@link CompanySelectBeneficialOwnerNodeModule#provideListUiNode()}. */
  public static ListUiNode<?, ?> proxyProvideListUiNode(
      CompanySelectBeneficialOwnerNodeModule instance) {
    return instance.provideListUiNode();
  }
}
