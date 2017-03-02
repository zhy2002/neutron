package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyPrimaryApplicantFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final
class CompanyPrimaryApplicantFlagNodeModule_ProvideCompanyPrimaryApplicantFlagNodeFactory
    implements Factory<CompanyPrimaryApplicantFlagNode> {
  private final CompanyPrimaryApplicantFlagNodeModule module;

  public CompanyPrimaryApplicantFlagNodeModule_ProvideCompanyPrimaryApplicantFlagNodeFactory(
      CompanyPrimaryApplicantFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyPrimaryApplicantFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyPrimaryApplicantFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyPrimaryApplicantFlagNode> create(
      CompanyPrimaryApplicantFlagNodeModule module) {
    return new CompanyPrimaryApplicantFlagNodeModule_ProvideCompanyPrimaryApplicantFlagNodeFactory(
        module);
  }

  /**
   * Proxies {@link CompanyPrimaryApplicantFlagNodeModule#provideCompanyPrimaryApplicantFlagNode()}.
   */
  public static CompanyPrimaryApplicantFlagNode proxyProvideCompanyPrimaryApplicantFlagNode(
      CompanyPrimaryApplicantFlagNodeModule instance) {
    return instance.provideCompanyPrimaryApplicantFlagNode();
  }
}
