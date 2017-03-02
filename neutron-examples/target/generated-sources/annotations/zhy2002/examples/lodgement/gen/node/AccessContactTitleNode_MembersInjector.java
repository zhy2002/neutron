package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessContactTitleNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessContactTitleNode_MembersInjector
    implements MembersInjector<AccessContactTitleNode> {
  private final Provider<AccessContactTitleNodeComponent.Builder> builderProvider;

  public AccessContactTitleNode_MembersInjector(
      Provider<AccessContactTitleNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessContactTitleNode> create(
      Provider<AccessContactTitleNodeComponent.Builder> builderProvider) {
    return new AccessContactTitleNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessContactTitleNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessContactTitleNode instance,
      Provider<AccessContactTitleNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
