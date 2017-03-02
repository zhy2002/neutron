package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExpenseDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseDescriptionNode_MembersInjector
    implements MembersInjector<ExpenseDescriptionNode> {
  private final Provider<ExpenseDescriptionNodeComponent.Builder> builderProvider;

  public ExpenseDescriptionNode_MembersInjector(
      Provider<ExpenseDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExpenseDescriptionNode> create(
      Provider<ExpenseDescriptionNodeComponent.Builder> builderProvider) {
    return new ExpenseDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ExpenseDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ExpenseDescriptionNode instance,
      Provider<ExpenseDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
