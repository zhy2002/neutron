package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessOtherDescriptionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessOtherDescriptionNode_MembersInjector
    implements MembersInjector<AccessOtherDescriptionNode> {
  private final Provider<AccessOtherDescriptionNodeComponent.Builder> builderProvider;

  public AccessOtherDescriptionNode_MembersInjector(
      Provider<AccessOtherDescriptionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessOtherDescriptionNode> create(
      Provider<AccessOtherDescriptionNodeComponent.Builder> builderProvider) {
    return new AccessOtherDescriptionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessOtherDescriptionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessOtherDescriptionNode instance,
      Provider<AccessOtherDescriptionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
