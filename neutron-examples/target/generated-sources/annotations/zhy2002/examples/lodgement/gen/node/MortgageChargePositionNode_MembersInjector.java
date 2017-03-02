package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageChargePositionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageChargePositionNode_MembersInjector
    implements MembersInjector<MortgageChargePositionNode> {
  private final Provider<MortgageChargePositionNodeComponent.Builder> builderProvider;

  public MortgageChargePositionNode_MembersInjector(
      Provider<MortgageChargePositionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageChargePositionNode> create(
      Provider<MortgageChargePositionNodeComponent.Builder> builderProvider) {
    return new MortgageChargePositionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageChargePositionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageChargePositionNode instance,
      Provider<MortgageChargePositionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
