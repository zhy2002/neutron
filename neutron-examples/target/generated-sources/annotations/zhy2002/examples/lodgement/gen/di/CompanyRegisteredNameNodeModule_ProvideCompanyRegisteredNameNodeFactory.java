package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyRegisteredNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegisteredNameNodeModule_ProvideCompanyRegisteredNameNodeFactory
    implements Factory<CompanyRegisteredNameNode> {
  private final CompanyRegisteredNameNodeModule module;

  public CompanyRegisteredNameNodeModule_ProvideCompanyRegisteredNameNodeFactory(
      CompanyRegisteredNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyRegisteredNameNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyRegisteredNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyRegisteredNameNode> create(CompanyRegisteredNameNodeModule module) {
    return new CompanyRegisteredNameNodeModule_ProvideCompanyRegisteredNameNodeFactory(module);
  }

  /** Proxies {@link CompanyRegisteredNameNodeModule#provideCompanyRegisteredNameNode()}. */
  public static CompanyRegisteredNameNode proxyProvideCompanyRegisteredNameNode(
      CompanyRegisteredNameNodeModule instance) {
    return instance.provideCompanyRegisteredNameNode();
  }
}
