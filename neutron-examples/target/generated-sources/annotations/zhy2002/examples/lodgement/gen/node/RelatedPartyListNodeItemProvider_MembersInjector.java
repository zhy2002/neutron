package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNodeItemProvider_MembersInjector
    implements MembersInjector<RelatedPartyListNodeItemProvider> {
  private final MembersInjector<RelatedPartyNode> relatedPartyNodeInjectorMembersInjector;

  public RelatedPartyListNodeItemProvider_MembersInjector(
      MembersInjector<RelatedPartyNode> relatedPartyNodeInjectorMembersInjector) {
    assert relatedPartyNodeInjectorMembersInjector != null;
    this.relatedPartyNodeInjectorMembersInjector = relatedPartyNodeInjectorMembersInjector;
  }

  public static MembersInjector<RelatedPartyListNodeItemProvider> create(
      MembersInjector<RelatedPartyNode> relatedPartyNodeInjectorMembersInjector) {
    return new RelatedPartyListNodeItemProvider_MembersInjector(
        relatedPartyNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(RelatedPartyListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.relatedPartyNodeInjector = relatedPartyNodeInjectorMembersInjector;
  }

  public static void injectRelatedPartyNodeInjector(
      RelatedPartyListNodeItemProvider instance,
      MembersInjector<RelatedPartyNode> relatedPartyNodeInjector) {
    instance.relatedPartyNodeInjector = relatedPartyNodeInjector;
  }
}
