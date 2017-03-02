package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ApplicationTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTypeNode_MembersInjector
    implements MembersInjector<ApplicationTypeNode> {
  private final Provider<ApplicationTypeNodeComponent.Builder> builderProvider;

  public ApplicationTypeNode_MembersInjector(
      Provider<ApplicationTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ApplicationTypeNode> create(
      Provider<ApplicationTypeNodeComponent.Builder> builderProvider) {
    return new ApplicationTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ApplicationTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ApplicationTypeNode instance,
      Provider<ApplicationTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
