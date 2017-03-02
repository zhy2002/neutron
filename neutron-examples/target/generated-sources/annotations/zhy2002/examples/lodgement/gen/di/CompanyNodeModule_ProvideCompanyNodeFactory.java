package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyNodeModule_ProvideCompanyNodeFactory implements Factory<CompanyNode> {
  private final CompanyNodeModule module;

  public CompanyNodeModule_ProvideCompanyNodeFactory(CompanyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyNode> create(CompanyNodeModule module) {
    return new CompanyNodeModule_ProvideCompanyNodeFactory(module);
  }

  /** Proxies {@link CompanyNodeModule#provideCompanyNode()}. */
  public static CompanyNode proxyProvideCompanyNode(CompanyNodeModule instance) {
    return instance.provideCompanyNode();
  }
}
