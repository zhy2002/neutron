package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeChildProvider_MembersInjector
    implements MembersInjector<SelectRelatedPersonNodeChildProvider> {
  private final MembersInjector<RelatedPersonReferenceNode>
      relatedPersonReferenceNodeInjectorMembersInjector;

  private final MembersInjector<SelectRelatedPersonFlagNode>
      selectRelatedPersonFlagNodeInjectorMembersInjector;

  public SelectRelatedPersonNodeChildProvider_MembersInjector(
      MembersInjector<RelatedPersonReferenceNode> relatedPersonReferenceNodeInjectorMembersInjector,
      MembersInjector<SelectRelatedPersonFlagNode>
          selectRelatedPersonFlagNodeInjectorMembersInjector) {
    assert relatedPersonReferenceNodeInjectorMembersInjector != null;
    this.relatedPersonReferenceNodeInjectorMembersInjector =
        relatedPersonReferenceNodeInjectorMembersInjector;
    assert selectRelatedPersonFlagNodeInjectorMembersInjector != null;
    this.selectRelatedPersonFlagNodeInjectorMembersInjector =
        selectRelatedPersonFlagNodeInjectorMembersInjector;
  }

  public static MembersInjector<SelectRelatedPersonNodeChildProvider> create(
      MembersInjector<RelatedPersonReferenceNode> relatedPersonReferenceNodeInjectorMembersInjector,
      MembersInjector<SelectRelatedPersonFlagNode>
          selectRelatedPersonFlagNodeInjectorMembersInjector) {
    return new SelectRelatedPersonNodeChildProvider_MembersInjector(
        relatedPersonReferenceNodeInjectorMembersInjector,
        selectRelatedPersonFlagNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SelectRelatedPersonNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.relatedPersonReferenceNodeInjector = relatedPersonReferenceNodeInjectorMembersInjector;
    instance.selectRelatedPersonFlagNodeInjector =
        selectRelatedPersonFlagNodeInjectorMembersInjector;
  }

  public static void injectRelatedPersonReferenceNodeInjector(
      SelectRelatedPersonNodeChildProvider instance,
      MembersInjector<RelatedPersonReferenceNode> relatedPersonReferenceNodeInjector) {
    instance.relatedPersonReferenceNodeInjector = relatedPersonReferenceNodeInjector;
  }

  public static void injectSelectRelatedPersonFlagNodeInjector(
      SelectRelatedPersonNodeChildProvider instance,
      MembersInjector<SelectRelatedPersonFlagNode> selectRelatedPersonFlagNodeInjector) {
    instance.selectRelatedPersonFlagNodeInjector = selectRelatedPersonFlagNodeInjector;
  }
}
