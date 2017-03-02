package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageMonthlyRepaymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageMonthlyRepaymentNode_MembersInjector
    implements MembersInjector<MortgageMonthlyRepaymentNode> {
  private final Provider<MortgageMonthlyRepaymentNodeComponent.Builder> builderProvider;

  public MortgageMonthlyRepaymentNode_MembersInjector(
      Provider<MortgageMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageMonthlyRepaymentNode> create(
      Provider<MortgageMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    return new MortgageMonthlyRepaymentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageMonthlyRepaymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageMonthlyRepaymentNode instance,
      Provider<MortgageMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
