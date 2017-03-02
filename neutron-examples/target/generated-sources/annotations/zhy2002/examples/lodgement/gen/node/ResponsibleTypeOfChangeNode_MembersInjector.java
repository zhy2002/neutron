package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ResponsibleTypeOfChangeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleTypeOfChangeNode_MembersInjector
    implements MembersInjector<ResponsibleTypeOfChangeNode> {
  private final Provider<ResponsibleTypeOfChangeNodeComponent.Builder> builderProvider;

  public ResponsibleTypeOfChangeNode_MembersInjector(
      Provider<ResponsibleTypeOfChangeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ResponsibleTypeOfChangeNode> create(
      Provider<ResponsibleTypeOfChangeNodeComponent.Builder> builderProvider) {
    return new ResponsibleTypeOfChangeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ResponsibleTypeOfChangeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ResponsibleTypeOfChangeNode instance,
      Provider<ResponsibleTypeOfChangeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
