package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AdditionalCommentNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalCommentNode_MembersInjector
    implements MembersInjector<AdditionalCommentNode> {
  private final Provider<AdditionalCommentNodeComponent.Builder> builderProvider;

  public AdditionalCommentNode_MembersInjector(
      Provider<AdditionalCommentNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AdditionalCommentNode> create(
      Provider<AdditionalCommentNodeComponent.Builder> builderProvider) {
    return new AdditionalCommentNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AdditionalCommentNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AdditionalCommentNode instance,
      Provider<AdditionalCommentNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
