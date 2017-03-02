package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyContactLastNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactLastNameNodeModule_ProvideCompanyContactLastNameNodeFactory
    implements Factory<CompanyContactLastNameNode> {
  private final CompanyContactLastNameNodeModule module;

  public CompanyContactLastNameNodeModule_ProvideCompanyContactLastNameNodeFactory(
      CompanyContactLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyContactLastNameNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyContactLastNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyContactLastNameNode> create(
      CompanyContactLastNameNodeModule module) {
    return new CompanyContactLastNameNodeModule_ProvideCompanyContactLastNameNodeFactory(module);
  }

  /** Proxies {@link CompanyContactLastNameNodeModule#provideCompanyContactLastNameNode()}. */
  public static CompanyContactLastNameNode proxyProvideCompanyContactLastNameNode(
      CompanyContactLastNameNodeModule instance) {
    return instance.provideCompanyContactLastNameNode();
  }
}
