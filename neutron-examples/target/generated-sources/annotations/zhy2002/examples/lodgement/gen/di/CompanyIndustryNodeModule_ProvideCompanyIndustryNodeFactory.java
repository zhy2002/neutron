package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyIndustryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyIndustryNodeModule_ProvideCompanyIndustryNodeFactory
    implements Factory<CompanyIndustryNode> {
  private final CompanyIndustryNodeModule module;

  public CompanyIndustryNodeModule_ProvideCompanyIndustryNodeFactory(
      CompanyIndustryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyIndustryNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyIndustryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyIndustryNode> create(CompanyIndustryNodeModule module) {
    return new CompanyIndustryNodeModule_ProvideCompanyIndustryNodeFactory(module);
  }

  /** Proxies {@link CompanyIndustryNodeModule#provideCompanyIndustryNode()}. */
  public static CompanyIndustryNode proxyProvideCompanyIndustryNode(
      CompanyIndustryNodeModule instance) {
    return instance.provideCompanyIndustryNode();
  }
}
