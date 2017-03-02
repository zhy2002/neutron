package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardAmountOwingNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardAmountOwingNode_MembersInjector
    implements MembersInjector<CreditCardAmountOwingNode> {
  private final Provider<CreditCardAmountOwingNodeComponent.Builder> builderProvider;

  public CreditCardAmountOwingNode_MembersInjector(
      Provider<CreditCardAmountOwingNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardAmountOwingNode> create(
      Provider<CreditCardAmountOwingNodeComponent.Builder> builderProvider) {
    return new CreditCardAmountOwingNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardAmountOwingNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardAmountOwingNode instance,
      Provider<CreditCardAmountOwingNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
