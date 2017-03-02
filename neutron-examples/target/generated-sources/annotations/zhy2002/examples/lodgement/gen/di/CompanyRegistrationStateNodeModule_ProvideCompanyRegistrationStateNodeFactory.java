package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyRegistrationStateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationStateNodeModule_ProvideCompanyRegistrationStateNodeFactory
    implements Factory<CompanyRegistrationStateNode> {
  private final CompanyRegistrationStateNodeModule module;

  public CompanyRegistrationStateNodeModule_ProvideCompanyRegistrationStateNodeFactory(
      CompanyRegistrationStateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyRegistrationStateNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyRegistrationStateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyRegistrationStateNode> create(
      CompanyRegistrationStateNodeModule module) {
    return new CompanyRegistrationStateNodeModule_ProvideCompanyRegistrationStateNodeFactory(
        module);
  }

  /** Proxies {@link CompanyRegistrationStateNodeModule#provideCompanyRegistrationStateNode()}. */
  public static CompanyRegistrationStateNode proxyProvideCompanyRegistrationStateNode(
      CompanyRegistrationStateNodeModule instance) {
    return instance.provideCompanyRegistrationStateNode();
  }
}
