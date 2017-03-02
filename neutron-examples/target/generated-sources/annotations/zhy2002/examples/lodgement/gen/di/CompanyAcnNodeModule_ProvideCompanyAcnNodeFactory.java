package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyAcnNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAcnNodeModule_ProvideCompanyAcnNodeFactory
    implements Factory<CompanyAcnNode> {
  private final CompanyAcnNodeModule module;

  public CompanyAcnNodeModule_ProvideCompanyAcnNodeFactory(CompanyAcnNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyAcnNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyAcnNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyAcnNode> create(CompanyAcnNodeModule module) {
    return new CompanyAcnNodeModule_ProvideCompanyAcnNodeFactory(module);
  }

  /** Proxies {@link CompanyAcnNodeModule#provideCompanyAcnNode()}. */
  public static CompanyAcnNode proxyProvideCompanyAcnNode(CompanyAcnNodeModule instance) {
    return instance.provideCompanyAcnNode();
  }
}
