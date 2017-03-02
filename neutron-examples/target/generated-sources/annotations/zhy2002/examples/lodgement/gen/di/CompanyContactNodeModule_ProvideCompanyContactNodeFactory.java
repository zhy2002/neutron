package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyContactNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNodeModule_ProvideCompanyContactNodeFactory
    implements Factory<CompanyContactNode> {
  private final CompanyContactNodeModule module;

  public CompanyContactNodeModule_ProvideCompanyContactNodeFactory(
      CompanyContactNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyContactNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyContactNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyContactNode> create(CompanyContactNodeModule module) {
    return new CompanyContactNodeModule_ProvideCompanyContactNodeFactory(module);
  }

  /** Proxies {@link CompanyContactNodeModule#provideCompanyContactNode()}. */
  public static CompanyContactNode proxyProvideCompanyContactNode(
      CompanyContactNodeModule instance) {
    return instance.provideCompanyContactNode();
  }
}
