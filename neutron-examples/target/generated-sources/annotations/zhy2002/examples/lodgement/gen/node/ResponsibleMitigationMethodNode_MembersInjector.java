package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ResponsibleMitigationMethodNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleMitigationMethodNode_MembersInjector
    implements MembersInjector<ResponsibleMitigationMethodNode> {
  private final Provider<ResponsibleMitigationMethodNodeComponent.Builder> builderProvider;

  public ResponsibleMitigationMethodNode_MembersInjector(
      Provider<ResponsibleMitigationMethodNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ResponsibleMitigationMethodNode> create(
      Provider<ResponsibleMitigationMethodNodeComponent.Builder> builderProvider) {
    return new ResponsibleMitigationMethodNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ResponsibleMitigationMethodNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ResponsibleMitigationMethodNode instance,
      Provider<ResponsibleMitigationMethodNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
