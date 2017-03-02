package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyAbrnNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyAbrnNodeModule_ProvideCompanyAbrnNodeFactory
    implements Factory<CompanyAbrnNode> {
  private final CompanyAbrnNodeModule module;

  public CompanyAbrnNodeModule_ProvideCompanyAbrnNodeFactory(CompanyAbrnNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyAbrnNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyAbrnNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyAbrnNode> create(CompanyAbrnNodeModule module) {
    return new CompanyAbrnNodeModule_ProvideCompanyAbrnNodeFactory(module);
  }

  /** Proxies {@link CompanyAbrnNodeModule#provideCompanyAbrnNode()}. */
  public static CompanyAbrnNode proxyProvideCompanyAbrnNode(CompanyAbrnNodeModule instance) {
    return instance.provideCompanyAbrnNode();
  }
}
