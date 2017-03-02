package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessContactFirstNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactFirstNameNode_MembersInjector
    implements MembersInjector<AccessContactFirstNameNode> {
  private final Provider<AccessContactFirstNameNodeComponent.Builder> builderProvider;

  public AccessContactFirstNameNode_MembersInjector(
      Provider<AccessContactFirstNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessContactFirstNameNode> create(
      Provider<AccessContactFirstNameNodeComponent.Builder> builderProvider) {
    return new AccessContactFirstNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessContactFirstNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessContactFirstNameNode instance,
      Provider<AccessContactFirstNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
