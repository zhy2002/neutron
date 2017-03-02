package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RetiredOnBenefitFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredOnBenefitFlagNode_MembersInjector
    implements MembersInjector<RetiredOnBenefitFlagNode> {
  private final Provider<RetiredOnBenefitFlagNodeComponent.Builder> builderProvider;

  public RetiredOnBenefitFlagNode_MembersInjector(
      Provider<RetiredOnBenefitFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RetiredOnBenefitFlagNode> create(
      Provider<RetiredOnBenefitFlagNodeComponent.Builder> builderProvider) {
    return new RetiredOnBenefitFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(RetiredOnBenefitFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      RetiredOnBenefitFlagNode instance,
      Provider<RetiredOnBenefitFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
