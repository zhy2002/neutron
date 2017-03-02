package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessContactLastNameNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactLastNameNode_MembersInjector
    implements MembersInjector<AccessContactLastNameNode> {
  private final Provider<AccessContactLastNameNodeComponent.Builder> builderProvider;

  public AccessContactLastNameNode_MembersInjector(
      Provider<AccessContactLastNameNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessContactLastNameNode> create(
      Provider<AccessContactLastNameNodeComponent.Builder> builderProvider) {
    return new AccessContactLastNameNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessContactLastNameNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessContactLastNameNode instance,
      Provider<AccessContactLastNameNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
