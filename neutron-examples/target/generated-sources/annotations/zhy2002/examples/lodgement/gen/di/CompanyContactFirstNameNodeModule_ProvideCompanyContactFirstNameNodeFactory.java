package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyContactFirstNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactFirstNameNodeModule_ProvideCompanyContactFirstNameNodeFactory
    implements Factory<CompanyContactFirstNameNode> {
  private final CompanyContactFirstNameNodeModule module;

  public CompanyContactFirstNameNodeModule_ProvideCompanyContactFirstNameNodeFactory(
      CompanyContactFirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyContactFirstNameNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyContactFirstNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyContactFirstNameNode> create(
      CompanyContactFirstNameNodeModule module) {
    return new CompanyContactFirstNameNodeModule_ProvideCompanyContactFirstNameNodeFactory(module);
  }

  /** Proxies {@link CompanyContactFirstNameNodeModule#provideCompanyContactFirstNameNode()}. */
  public static CompanyContactFirstNameNode proxyProvideCompanyContactFirstNameNode(
      CompanyContactFirstNameNodeModule instance) {
    return instance.provideCompanyContactFirstNameNode();
  }
}
