package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SubmissionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubmissionNode_MembersInjector implements MembersInjector<SubmissionNode> {
  private final Provider<SubmissionNodeComponent.Builder> builderProvider;

  public SubmissionNode_MembersInjector(Provider<SubmissionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SubmissionNode> create(
      Provider<SubmissionNodeComponent.Builder> builderProvider) {
    return new SubmissionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SubmissionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SubmissionNode instance, Provider<SubmissionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
