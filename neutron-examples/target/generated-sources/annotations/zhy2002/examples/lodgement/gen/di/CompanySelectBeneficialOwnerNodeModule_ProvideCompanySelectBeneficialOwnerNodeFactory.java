package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanySelectBeneficialOwnerNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class CompanySelectBeneficialOwnerNodeModule_ProvideCompanySelectBeneficialOwnerNodeFactory
    implements Factory<CompanySelectBeneficialOwnerNode> {
  private final CompanySelectBeneficialOwnerNodeModule module;

  public CompanySelectBeneficialOwnerNodeModule_ProvideCompanySelectBeneficialOwnerNodeFactory(
      CompanySelectBeneficialOwnerNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanySelectBeneficialOwnerNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanySelectBeneficialOwnerNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanySelectBeneficialOwnerNode> create(
      CompanySelectBeneficialOwnerNodeModule module) {
    return new CompanySelectBeneficialOwnerNodeModule_ProvideCompanySelectBeneficialOwnerNodeFactory(
        module);
  }

  /**
   * Proxies {@link
   * CompanySelectBeneficialOwnerNodeModule#provideCompanySelectBeneficialOwnerNode()}.
   */
  public static CompanySelectBeneficialOwnerNode proxyProvideCompanySelectBeneficialOwnerNode(
      CompanySelectBeneficialOwnerNodeModule instance) {
    return instance.provideCompanySelectBeneficialOwnerNode();
  }
}
