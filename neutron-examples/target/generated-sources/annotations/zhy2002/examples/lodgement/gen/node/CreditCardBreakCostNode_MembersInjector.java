package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCardBreakCostNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardBreakCostNode_MembersInjector
    implements MembersInjector<CreditCardBreakCostNode> {
  private final Provider<CreditCardBreakCostNodeComponent.Builder> builderProvider;

  public CreditCardBreakCostNode_MembersInjector(
      Provider<CreditCardBreakCostNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCardBreakCostNode> create(
      Provider<CreditCardBreakCostNodeComponent.Builder> builderProvider) {
    return new CreditCardBreakCostNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCardBreakCostNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCardBreakCostNode instance,
      Provider<CreditCardBreakCostNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
