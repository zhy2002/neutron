package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyResponsibleLendNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyResponsibleLendNodeModule_ProvideCompanyResponsibleLendNodeFactory
    implements Factory<CompanyResponsibleLendNode> {
  private final CompanyResponsibleLendNodeModule module;

  public CompanyResponsibleLendNodeModule_ProvideCompanyResponsibleLendNodeFactory(
      CompanyResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyResponsibleLendNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyResponsibleLendNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyResponsibleLendNode> create(
      CompanyResponsibleLendNodeModule module) {
    return new CompanyResponsibleLendNodeModule_ProvideCompanyResponsibleLendNodeFactory(module);
  }

  /** Proxies {@link CompanyResponsibleLendNodeModule#provideCompanyResponsibleLendNode()}. */
  public static CompanyResponsibleLendNode proxyProvideCompanyResponsibleLendNode(
      CompanyResponsibleLendNodeModule instance) {
    return instance.provideCompanyResponsibleLendNode();
  }
}
