package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardLimitAmountNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLimitAmountNode_MembersInjector
    implements MembersInjector<CreditCardLimitAmountNode> {
  private final Provider<CreditCardLimitAmountNodeComponent.Builder> builderProvider;

  public CreditCardLimitAmountNode_MembersInjector(
      Provider<CreditCardLimitAmountNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardLimitAmountNode> create(
      Provider<CreditCardLimitAmountNodeComponent.Builder> builderProvider) {
    return new CreditCardLimitAmountNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardLimitAmountNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardLimitAmountNode instance,
      Provider<CreditCardLimitAmountNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
