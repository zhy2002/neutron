package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.RelatedPersonReferenceNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPersonReferenceNode_MembersInjector
    implements MembersInjector<RelatedPersonReferenceNode> {
  private final Provider<RelatedPersonReferenceNodeComponent.Builder> builderProvider;

  public RelatedPersonReferenceNode_MembersInjector(
      Provider<RelatedPersonReferenceNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<RelatedPersonReferenceNode> create(
      Provider<RelatedPersonReferenceNodeComponent.Builder> builderProvider) {
    return new RelatedPersonReferenceNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(RelatedPersonReferenceNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      RelatedPersonReferenceNode instance,
      Provider<RelatedPersonReferenceNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
