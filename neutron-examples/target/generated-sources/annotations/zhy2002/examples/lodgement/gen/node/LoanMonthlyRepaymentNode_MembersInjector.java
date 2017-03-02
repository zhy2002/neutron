package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanMonthlyRepaymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanMonthlyRepaymentNode_MembersInjector
    implements MembersInjector<LoanMonthlyRepaymentNode> {
  private final Provider<LoanMonthlyRepaymentNodeComponent.Builder> builderProvider;

  public LoanMonthlyRepaymentNode_MembersInjector(
      Provider<LoanMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanMonthlyRepaymentNode> create(
      Provider<LoanMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    return new LoanMonthlyRepaymentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanMonthlyRepaymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanMonthlyRepaymentNode instance,
      Provider<LoanMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
