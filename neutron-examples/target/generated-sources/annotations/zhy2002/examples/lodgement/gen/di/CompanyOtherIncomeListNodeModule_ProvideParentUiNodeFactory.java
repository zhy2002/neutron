package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanyOtherIncomeListNodeModule module;

  public CompanyOtherIncomeListNodeModule_ProvideParentUiNodeFactory(
      CompanyOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanyOtherIncomeListNodeModule module) {
    return new CompanyOtherIncomeListNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanyOtherIncomeListNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      CompanyOtherIncomeListNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
