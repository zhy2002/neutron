package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ApprovalInPrincipleFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApprovalInPrincipleFlagNode_MembersInjector
    implements MembersInjector<ApprovalInPrincipleFlagNode> {
  private final Provider<ApprovalInPrincipleFlagNodeComponent.Builder> builderProvider;

  public ApprovalInPrincipleFlagNode_MembersInjector(
      Provider<ApprovalInPrincipleFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ApprovalInPrincipleFlagNode> create(
      Provider<ApprovalInPrincipleFlagNodeComponent.Builder> builderProvider) {
    return new ApprovalInPrincipleFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ApprovalInPrincipleFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ApprovalInPrincipleFlagNode instance,
      Provider<ApprovalInPrincipleFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
