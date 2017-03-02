package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ApplicantReferenceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicantReferenceNode_MembersInjector
    implements MembersInjector<ApplicantReferenceNode> {
  private final Provider<ApplicantReferenceNodeComponent.Builder> builderProvider;

  public ApplicantReferenceNode_MembersInjector(
      Provider<ApplicantReferenceNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ApplicantReferenceNode> create(
      Provider<ApplicantReferenceNodeComponent.Builder> builderProvider) {
    return new ApplicantReferenceNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ApplicantReferenceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ApplicantReferenceNode instance,
      Provider<ApplicantReferenceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
