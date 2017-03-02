package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.CompanyOtherIncomeListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNodeModule_ProvideCompanyOtherIncomeListNodeFactory
    implements Factory<CompanyOtherIncomeListNode> {
  private final CompanyOtherIncomeListNodeModule module;

  public CompanyOtherIncomeListNodeModule_ProvideCompanyOtherIncomeListNodeFactory(
      CompanyOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CompanyOtherIncomeListNode get() {
    return Preconditions.checkNotNull(
        module.provideCompanyOtherIncomeListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CompanyOtherIncomeListNode> create(
      CompanyOtherIncomeListNodeModule module) {
    return new CompanyOtherIncomeListNodeModule_ProvideCompanyOtherIncomeListNodeFactory(module);
  }

  /** Proxies {@link CompanyOtherIncomeListNodeModule#provideCompanyOtherIncomeListNode()}. */
  public static CompanyOtherIncomeListNode proxyProvideCompanyOtherIncomeListNode(
      CompanyOtherIncomeListNodeModule instance) {
    return instance.provideCompanyOtherIncomeListNode();
  }
}
