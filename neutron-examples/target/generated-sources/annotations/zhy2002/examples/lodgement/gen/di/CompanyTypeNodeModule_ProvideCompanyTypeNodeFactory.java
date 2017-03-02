package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTypeNodeModule_ProvideCompanyTypeNodeFactory
    implements Factory<CompanyTypeNode> {
  private final CompanyTypeNodeModule module;

  public CompanyTypeNodeModule_ProvideCompanyTypeNodeFactory(CompanyTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyTypeNode> create(CompanyTypeNodeModule module) {
    return new CompanyTypeNodeModule_ProvideCompanyTypeNodeFactory(module);
  }

  /** Proxies {@link CompanyTypeNodeModule#provideCompanyTypeNode()}. */
  public static CompanyTypeNode proxyProvideCompanyTypeNode(CompanyTypeNodeModule instance) {
    return instance.provideCompanyTypeNode();
  }
}
