package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyApplicationTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicationTypeNodeModule_ProvideCompanyApplicationTypeNodeFactory
    implements Factory<CompanyApplicationTypeNode> {
  private final CompanyApplicationTypeNodeModule module;

  public CompanyApplicationTypeNodeModule_ProvideCompanyApplicationTypeNodeFactory(
      CompanyApplicationTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyApplicationTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyApplicationTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyApplicationTypeNode> create(
      CompanyApplicationTypeNodeModule module) {
    return new CompanyApplicationTypeNodeModule_ProvideCompanyApplicationTypeNodeFactory(module);
  }

  /** Proxies {@link CompanyApplicationTypeNodeModule#provideCompanyApplicationTypeNode()}. */
  public static CompanyApplicationTypeNode proxyProvideCompanyApplicationTypeNode(
      CompanyApplicationTypeNodeModule instance) {
    return instance.provideCompanyApplicationTypeNode();
  }
}
