package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseOtherIncomeListNodeItemProvider_Factory
    implements Factory<BaseOtherIncomeListNodeItemProvider> {
  private final MembersInjector<BaseOtherIncomeListNodeItemProvider>
      baseOtherIncomeListNodeItemProviderMembersInjector;

  public BaseOtherIncomeListNodeItemProvider_Factory(
      MembersInjector<BaseOtherIncomeListNodeItemProvider>
          baseOtherIncomeListNodeItemProviderMembersInjector) {
    assert baseOtherIncomeListNodeItemProviderMembersInjector != null;
    this.baseOtherIncomeListNodeItemProviderMembersInjector =
        baseOtherIncomeListNodeItemProviderMembersInjector;
  }

  @Override
  public BaseOtherIncomeListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        baseOtherIncomeListNodeItemProviderMembersInjector,
        new BaseOtherIncomeListNodeItemProvider());
  }

  public static Factory<BaseOtherIncomeListNodeItemProvider> create(
      MembersInjector<BaseOtherIncomeListNodeItemProvider>
          baseOtherIncomeListNodeItemProviderMembersInjector) {
    return new BaseOtherIncomeListNodeItemProvider_Factory(
        baseOtherIncomeListNodeItemProviderMembersInjector);
  }
}
