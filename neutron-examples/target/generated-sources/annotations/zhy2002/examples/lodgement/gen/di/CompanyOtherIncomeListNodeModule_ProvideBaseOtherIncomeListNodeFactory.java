package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseOtherIncomeListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNodeModule_ProvideBaseOtherIncomeListNodeFactory
    implements Factory<BaseOtherIncomeListNode<?>> {
  private final CompanyOtherIncomeListNodeModule module;

  public CompanyOtherIncomeListNodeModule_ProvideBaseOtherIncomeListNodeFactory(
      CompanyOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseOtherIncomeListNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseOtherIncomeListNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseOtherIncomeListNode<?>> create(
      CompanyOtherIncomeListNodeModule module) {
    return new CompanyOtherIncomeListNodeModule_ProvideBaseOtherIncomeListNodeFactory(module);
  }

  /** Proxies {@link CompanyOtherIncomeListNodeModule#provideBaseOtherIncomeListNode()}. */
  public static BaseOtherIncomeListNode<?> proxyProvideBaseOtherIncomeListNode(
      CompanyOtherIncomeListNodeModule instance) {
    return instance.provideBaseOtherIncomeListNode();
  }
}
