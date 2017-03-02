package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExpenseListNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseListNode_MembersInjector implements MembersInjector<ExpenseListNode> {
  private final Provider<ExpenseListNodeItemProvider> providerProvider;

  private final Provider<ExpenseListNodeComponent.Builder> builderProvider;

  public ExpenseListNode_MembersInjector(
      Provider<ExpenseListNodeItemProvider> providerProvider,
      Provider<ExpenseListNodeComponent.Builder> builderProvider) {
    assert providerProvider != null;
    this.providerProvider = providerProvider;
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExpenseListNode> create(
      Provider<ExpenseListNodeItemProvider> providerProvider,
      Provider<ExpenseListNodeComponent.Builder> builderProvider) {
    return new ExpenseListNode_MembersInjector(providerProvider, builderProvider);
  }

  @Override
  public void injectMembers(ExpenseListNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.receiveNodeProvider(providerProvider.get());
    instance.createComponent(builderProvider.get());
  }

  public static void injectReceiveNodeProvider(
      ExpenseListNode instance, Provider<ExpenseListNodeItemProvider> providerProvider) {
    instance.receiveNodeProvider(providerProvider.get());
  }

  public static void injectCreateComponent(
      ExpenseListNode instance, Provider<ExpenseListNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
