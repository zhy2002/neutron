package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExpenseTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseTypeNode_MembersInjector implements MembersInjector<ExpenseTypeNode> {
  private final Provider<ExpenseTypeNodeComponent.Builder> builderProvider;

  public ExpenseTypeNode_MembersInjector(
      Provider<ExpenseTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExpenseTypeNode> create(
      Provider<ExpenseTypeNodeComponent.Builder> builderProvider) {
    return new ExpenseTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ExpenseTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ExpenseTypeNode instance, Provider<ExpenseTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
