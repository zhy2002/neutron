package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyDescriptionNodeModule_ProvideCompanyDescriptionNodeFactory
    implements Factory<CompanyDescriptionNode> {
  private final CompanyDescriptionNodeModule module;

  public CompanyDescriptionNodeModule_ProvideCompanyDescriptionNodeFactory(
      CompanyDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyDescriptionNode> create(CompanyDescriptionNodeModule module) {
    return new CompanyDescriptionNodeModule_ProvideCompanyDescriptionNodeFactory(module);
  }

  /** Proxies {@link CompanyDescriptionNodeModule#provideCompanyDescriptionNode()}. */
  public static CompanyDescriptionNode proxyProvideCompanyDescriptionNode(
      CompanyDescriptionNodeModule instance) {
    return instance.provideCompanyDescriptionNode();
  }
}
