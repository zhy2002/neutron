package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PostcodeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostcodeNode_MembersInjector implements MembersInjector<PostcodeNode> {
  private final Provider<PostcodeNodeComponent.Builder> builderProvider;

  public PostcodeNode_MembersInjector(Provider<PostcodeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PostcodeNode> create(
      Provider<PostcodeNodeComponent.Builder> builderProvider) {
    return new PostcodeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PostcodeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PostcodeNode instance, Provider<PostcodeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
