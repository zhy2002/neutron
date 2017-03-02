package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExpenseNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseNode_MembersInjector implements MembersInjector<ExpenseNode> {
  private final Provider<ExpenseNodeChildProvider> providerProvider;

  private final Provider<ExpenseNodeComponent.Builder> builderProvider;

  public ExpenseNode_MembersInjector(
      Provider<ExpenseNodeChildProvider> providerProvider,
      Provider<ExpenseNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExpenseNode> create(
      Provider<ExpenseNodeChildProvider> providerProvider,
      Provider<ExpenseNodeComponent.Builder> builderProvider) {
    return new ExpenseNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ExpenseNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ExpenseNode instance, Provider<ExpenseNodeChildProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ExpenseNode instance, Provider<ExpenseNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
