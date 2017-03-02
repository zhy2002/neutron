package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardTypeNode_MembersInjector
    implements MembersInjector<CreditCardTypeNode> {
  private final Provider<CreditCardTypeNodeComponent.Builder> builderProvider;

  public CreditCardTypeNode_MembersInjector(
      Provider<CreditCardTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardTypeNode> create(
      Provider<CreditCardTypeNodeComponent.Builder> builderProvider) {
    return new CreditCardTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardTypeNode instance, Provider<CreditCardTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
