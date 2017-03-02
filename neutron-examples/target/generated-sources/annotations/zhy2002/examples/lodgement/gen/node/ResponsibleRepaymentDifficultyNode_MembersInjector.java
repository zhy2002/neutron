package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ResponsibleRepaymentDifficultyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleRepaymentDifficultyNode_MembersInjector
    implements MembersInjector<ResponsibleRepaymentDifficultyNode> {
  private final Provider<ResponsibleRepaymentDifficultyNodeComponent.Builder> builderProvider;

  public ResponsibleRepaymentDifficultyNode_MembersInjector(
      Provider<ResponsibleRepaymentDifficultyNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ResponsibleRepaymentDifficultyNode> create(
      Provider<ResponsibleRepaymentDifficultyNodeComponent.Builder> builderProvider) {
    return new ResponsibleRepaymentDifficultyNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ResponsibleRepaymentDifficultyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ResponsibleRepaymentDifficultyNode instance,
      Provider<ResponsibleRepaymentDifficultyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
