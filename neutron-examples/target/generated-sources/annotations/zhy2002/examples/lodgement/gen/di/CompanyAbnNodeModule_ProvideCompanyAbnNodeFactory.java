package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyAbnNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbnNodeModule_ProvideCompanyAbnNodeFactory
    implements Factory<CompanyAbnNode> {
  private final CompanyAbnNodeModule module;

  public CompanyAbnNodeModule_ProvideCompanyAbnNodeFactory(CompanyAbnNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyAbnNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyAbnNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyAbnNode> create(CompanyAbnNodeModule module) {
    return new CompanyAbnNodeModule_ProvideCompanyAbnNodeFactory(module);
  }

  /** Proxies {@link CompanyAbnNodeModule#provideCompanyAbnNode()}. */
  public static CompanyAbnNode proxyProvideCompanyAbnNode(CompanyAbnNodeModule instance) {
    return instance.provideCompanyAbnNode();
  }
}
