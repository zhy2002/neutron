package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CompanyOtherIncomeListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyOtherIncomeListNode_MembersInjector
    implements MembersInjector<CompanyOtherIncomeListNode> {
  private final Provider<BaseOtherIncomeListNodeItemProvider> providerProvider;

  private final Provider<CompanyOtherIncomeListNodeComponent.Builder> builderProvider;

  public CompanyOtherIncomeListNode_MembersInjector(
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider,
      Provider<CompanyOtherIncomeListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CompanyOtherIncomeListNode> create(
      Provider<BaseOtherIncomeListNodeItemProvider> providerProvider,
      Provider<CompanyOtherIncomeListNodeComponent.Builder> builderProvider) {
    return new CompanyOtherIncomeListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(CompanyOtherIncomeListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseOtherIncomeListNode) instance).receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CompanyOtherIncomeListNode instance,
      Provider<CompanyOtherIncomeListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
