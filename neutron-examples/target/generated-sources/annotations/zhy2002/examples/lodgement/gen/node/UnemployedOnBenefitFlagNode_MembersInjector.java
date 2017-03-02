package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.UnemployedOnBenefitFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedOnBenefitFlagNode_MembersInjector
    implements MembersInjector<UnemployedOnBenefitFlagNode> {
  private final Provider<UnemployedOnBenefitFlagNodeComponent.Builder> builderProvider;

  public UnemployedOnBenefitFlagNode_MembersInjector(
      Provider<UnemployedOnBenefitFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<UnemployedOnBenefitFlagNode> create(
      Provider<UnemployedOnBenefitFlagNodeComponent.Builder> builderProvider) {
    return new UnemployedOnBenefitFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(UnemployedOnBenefitFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      UnemployedOnBenefitFlagNode instance,
      Provider<UnemployedOnBenefitFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
