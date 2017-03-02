package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyGeneralNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyGeneralNodeModule_ProvideCompanyGeneralNodeFactory
    implements Factory<CompanyGeneralNode> {
  private final CompanyGeneralNodeModule module;

  public CompanyGeneralNodeModule_ProvideCompanyGeneralNodeFactory(
      CompanyGeneralNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyGeneralNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyGeneralNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyGeneralNode> create(CompanyGeneralNodeModule module) {
    return new CompanyGeneralNodeModule_ProvideCompanyGeneralNodeFactory(module);
  }

  /** Proxies {@link CompanyGeneralNodeModule#provideCompanyGeneralNode()}. */
  public static CompanyGeneralNode proxyProvideCompanyGeneralNode(
      CompanyGeneralNodeModule instance) {
    return instance.provideCompanyGeneralNode();
  }
}
