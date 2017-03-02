package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyListNodeModule_ProvideCompanyListNodeFactory
    implements Factory<CompanyListNode> {
  private final CompanyListNodeModule module;

  public CompanyListNodeModule_ProvideCompanyListNodeFactory(CompanyListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyListNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyListNode> create(CompanyListNodeModule module) {
    return new CompanyListNodeModule_ProvideCompanyListNodeFactory(module);
  }

  /** Proxies {@link CompanyListNodeModule#provideCompanyListNode()}. */
  public static CompanyListNode proxyProvideCompanyListNode(CompanyListNodeModule instance) {
    return instance.provideCompanyListNode();
  }
}
