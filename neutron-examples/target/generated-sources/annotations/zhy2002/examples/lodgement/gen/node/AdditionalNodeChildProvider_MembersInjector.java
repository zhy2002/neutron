package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalNodeChildProvider_MembersInjector
    implements MembersInjector<AdditionalNodeChildProvider> {
  private final MembersInjector<RelatedPartyListNode> relatedPartyListNodeInjectorMembersInjector;

  private final MembersInjector<AdditionalCommentNode> additionalCommentNodeInjectorMembersInjector;

  public AdditionalNodeChildProvider_MembersInjector(
      MembersInjector<RelatedPartyListNode> relatedPartyListNodeInjectorMembersInjector,
      MembersInjector<AdditionalCommentNode> additionalCommentNodeInjectorMembersInjector) {
    assert relatedPartyListNodeInjectorMembersInjector != null;
    this.relatedPartyListNodeInjectorMembersInjector = relatedPartyListNodeInjectorMembersInjector;
    assert additionalCommentNodeInjectorMembersInjector != null;
    this.additionalCommentNodeInjectorMembersInjector =
        additionalCommentNodeInjectorMembersInjector;
  }

  public static MembersInjector<AdditionalNodeChildProvider> create(
      MembersInjector<RelatedPartyListNode> relatedPartyListNodeInjectorMembersInjector,
      MembersInjector<AdditionalCommentNode> additionalCommentNodeInjectorMembersInjector) {
    return new AdditionalNodeChildProvider_MembersInjector(
        relatedPartyListNodeInjectorMembersInjector, additionalCommentNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(AdditionalNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.relatedPartyListNodeInjector = relatedPartyListNodeInjectorMembersInjector;
    instance.additionalCommentNodeInjector = additionalCommentNodeInjectorMembersInjector;
  }

  public static void injectRelatedPartyListNodeInjector(
      AdditionalNodeChildProvider instance,
      MembersInjector<RelatedPartyListNode> relatedPartyListNodeInjector) {
    instance.relatedPartyListNodeInjector = relatedPartyListNodeInjector;
  }

  public static void injectAdditionalCommentNodeInjector(
      AdditionalNodeChildProvider instance,
      MembersInjector<AdditionalCommentNode> additionalCommentNodeInjector) {
    instance.additionalCommentNodeInjector = additionalCommentNodeInjector;
  }
}
