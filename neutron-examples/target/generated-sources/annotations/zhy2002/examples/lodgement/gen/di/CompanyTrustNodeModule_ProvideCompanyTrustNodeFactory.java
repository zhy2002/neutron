package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyTrustNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTrustNodeModule_ProvideCompanyTrustNodeFactory
    implements Factory<CompanyTrustNode> {
  private final CompanyTrustNodeModule module;

  public CompanyTrustNodeModule_ProvideCompanyTrustNodeFactory(CompanyTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyTrustNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyTrustNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyTrustNode> create(CompanyTrustNodeModule module) {
    return new CompanyTrustNodeModule_ProvideCompanyTrustNodeFactory(module);
  }

  /** Proxies {@link CompanyTrustNodeModule#provideCompanyTrustNode()}. */
  public static CompanyTrustNode proxyProvideCompanyTrustNode(CompanyTrustNodeModule instance) {
    return instance.provideCompanyTrustNode();
  }
}
