package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ExpenseMonthlyRepaymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExpenseMonthlyRepaymentNode_MembersInjector
    implements MembersInjector<ExpenseMonthlyRepaymentNode> {
  private final Provider<ExpenseMonthlyRepaymentNodeComponent.Builder> builderProvider;

  public ExpenseMonthlyRepaymentNode_MembersInjector(
      Provider<ExpenseMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ExpenseMonthlyRepaymentNode> create(
      Provider<ExpenseMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    return new ExpenseMonthlyRepaymentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ExpenseMonthlyRepaymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ExpenseMonthlyRepaymentNode instance,
      Provider<ExpenseMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
