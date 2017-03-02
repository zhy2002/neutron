package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final CompanyOtherIncomeListNodeModule module;

  public CompanyOtherIncomeListNodeModule_ProvideUiNodeFactory(
      CompanyOtherIncomeListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(CompanyOtherIncomeListNodeModule module) {
    return new CompanyOtherIncomeListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link CompanyOtherIncomeListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(CompanyOtherIncomeListNodeModule instance) {
    return instance.provideUiNode();
  }
}
