package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanySelectDirectorNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanySelectDirectorNodeModule_ProvideCompanySelectDirectorNodeFactory
    implements Factory<CompanySelectDirectorNode> {
  private final CompanySelectDirectorNodeModule module;

  public CompanySelectDirectorNodeModule_ProvideCompanySelectDirectorNodeFactory(
      CompanySelectDirectorNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanySelectDirectorNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanySelectDirectorNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanySelectDirectorNode> create(CompanySelectDirectorNodeModule module) {
    return new CompanySelectDirectorNodeModule_ProvideCompanySelectDirectorNodeFactory(module);
  }

  /** Proxies {@link CompanySelectDirectorNodeModule#provideCompanySelectDirectorNode()}. */
  public static CompanySelectDirectorNode proxyProvideCompanySelectDirectorNode(
      CompanySelectDirectorNodeModule instance) {
    return instance.provideCompanySelectDirectorNode();
  }
}
