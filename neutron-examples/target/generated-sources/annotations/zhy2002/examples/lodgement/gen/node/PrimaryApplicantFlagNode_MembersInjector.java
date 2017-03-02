package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PrimaryApplicantFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimaryApplicantFlagNode_MembersInjector
    implements MembersInjector<PrimaryApplicantFlagNode> {
  private final Provider<PrimaryApplicantFlagNodeComponent.Builder> builderProvider;

  public PrimaryApplicantFlagNode_MembersInjector(
      Provider<PrimaryApplicantFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PrimaryApplicantFlagNode> create(
      Provider<PrimaryApplicantFlagNodeComponent.Builder> builderProvider) {
    return new PrimaryApplicantFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PrimaryApplicantFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PrimaryApplicantFlagNode instance,
      Provider<PrimaryApplicantFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
