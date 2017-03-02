package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardMonthlyRepaymentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardMonthlyRepaymentNode_MembersInjector
    implements MembersInjector<CreditCardMonthlyRepaymentNode> {
  private final Provider<CreditCardMonthlyRepaymentNodeComponent.Builder> builderProvider;

  public CreditCardMonthlyRepaymentNode_MembersInjector(
      Provider<CreditCardMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardMonthlyRepaymentNode> create(
      Provider<CreditCardMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    return new CreditCardMonthlyRepaymentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardMonthlyRepaymentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardMonthlyRepaymentNode instance,
      Provider<CreditCardMonthlyRepaymentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
