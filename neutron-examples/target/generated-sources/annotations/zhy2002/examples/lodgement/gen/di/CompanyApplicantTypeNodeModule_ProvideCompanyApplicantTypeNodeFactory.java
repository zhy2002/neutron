package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyApplicantTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicantTypeNodeModule_ProvideCompanyApplicantTypeNodeFactory
    implements Factory<CompanyApplicantTypeNode> {
  private final CompanyApplicantTypeNodeModule module;

  public CompanyApplicantTypeNodeModule_ProvideCompanyApplicantTypeNodeFactory(
      CompanyApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyApplicantTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyApplicantTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyApplicantTypeNode> create(CompanyApplicantTypeNodeModule module) {
    return new CompanyApplicantTypeNodeModule_ProvideCompanyApplicantTypeNodeFactory(module);
  }

  /** Proxies {@link CompanyApplicantTypeNodeModule#provideCompanyApplicantTypeNode()}. */
  public static CompanyApplicantTypeNode proxyProvideCompanyApplicantTypeNode(
      CompanyApplicantTypeNodeModule instance) {
    return instance.provideCompanyApplicantTypeNode();
  }
}
