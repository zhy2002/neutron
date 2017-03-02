package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessContactTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTypeNode_MembersInjector
    implements MembersInjector<AccessContactTypeNode> {
  private final Provider<AccessContactTypeNodeComponent.Builder> builderProvider;

  public AccessContactTypeNode_MembersInjector(
      Provider<AccessContactTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessContactTypeNode> create(
      Provider<AccessContactTypeNodeComponent.Builder> builderProvider) {
    return new AccessContactTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessContactTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessContactTypeNode instance,
      Provider<AccessContactTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
