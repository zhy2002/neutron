package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyPrivacyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyPrivacyNodeModule_ProvideCompanyPrivacyNodeFactory
    implements Factory<CompanyPrivacyNode> {
  private final CompanyPrivacyNodeModule module;

  public CompanyPrivacyNodeModule_ProvideCompanyPrivacyNodeFactory(
      CompanyPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyPrivacyNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyPrivacyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyPrivacyNode> create(CompanyPrivacyNodeModule module) {
    return new CompanyPrivacyNodeModule_ProvideCompanyPrivacyNodeFactory(module);
  }

  /** Proxies {@link CompanyPrivacyNodeModule#provideCompanyPrivacyNode()}. */
  public static CompanyPrivacyNode proxyProvideCompanyPrivacyNode(
      CompanyPrivacyNodeModule instance) {
    return instance.provideCompanyPrivacyNode();
  }
}
