package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardLenderNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardLenderNameNode_MembersInjector
    implements MembersInjector<CreditCardLenderNameNode> {
  private final Provider<CreditCardLenderNameNodeComponent.Builder> builderProvider;

  public CreditCardLenderNameNode_MembersInjector(
      Provider<CreditCardLenderNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardLenderNameNode> create(
      Provider<CreditCardLenderNameNodeComponent.Builder> builderProvider) {
    return new CreditCardLenderNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardLenderNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardLenderNameNode instance,
      Provider<CreditCardLenderNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
