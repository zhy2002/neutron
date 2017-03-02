package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyRegistrationDateNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyRegistrationDateNodeModule_ProvideCompanyRegistrationDateNodeFactory
    implements Factory<CompanyRegistrationDateNode> {
  private final CompanyRegistrationDateNodeModule module;

  public CompanyRegistrationDateNodeModule_ProvideCompanyRegistrationDateNodeFactory(
      CompanyRegistrationDateNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyRegistrationDateNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyRegistrationDateNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyRegistrationDateNode> create(
      CompanyRegistrationDateNodeModule module) {
    return new CompanyRegistrationDateNodeModule_ProvideCompanyRegistrationDateNodeFactory(module);
  }

  /** Proxies {@link CompanyRegistrationDateNodeModule#provideCompanyRegistrationDateNode()}. */
  public static CompanyRegistrationDateNode proxyProvideCompanyRegistrationDateNode(
      CompanyRegistrationDateNodeModule instance) {
    return instance.provideCompanyRegistrationDateNode();
  }
}
