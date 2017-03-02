package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardClearingFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardClearingFlagNode_MembersInjector
    implements MembersInjector<CreditCardClearingFlagNode> {
  private final Provider<CreditCardClearingFlagNodeComponent.Builder> builderProvider;

  public CreditCardClearingFlagNode_MembersInjector(
      Provider<CreditCardClearingFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardClearingFlagNode> create(
      Provider<CreditCardClearingFlagNodeComponent.Builder> builderProvider) {
    return new CreditCardClearingFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardClearingFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardClearingFlagNode instance,
      Provider<CreditCardClearingFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
