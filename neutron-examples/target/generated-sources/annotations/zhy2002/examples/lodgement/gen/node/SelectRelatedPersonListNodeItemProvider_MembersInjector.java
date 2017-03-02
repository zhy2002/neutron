package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonListNodeItemProvider_MembersInjector
    implements MembersInjector<SelectRelatedPersonListNodeItemProvider> {
  private final MembersInjector<SelectRelatedPersonNode>
      selectRelatedPersonNodeInjectorMembersInjector;

  public SelectRelatedPersonListNodeItemProvider_MembersInjector(
      MembersInjector<SelectRelatedPersonNode> selectRelatedPersonNodeInjectorMembersInjector) {
    assert selectRelatedPersonNodeInjectorMembersInjector != null;
    this.selectRelatedPersonNodeInjectorMembersInjector =
        selectRelatedPersonNodeInjectorMembersInjector;
  }

  public static MembersInjector<SelectRelatedPersonListNodeItemProvider> create(
      MembersInjector<SelectRelatedPersonNode> selectRelatedPersonNodeInjectorMembersInjector) {
    return new SelectRelatedPersonListNodeItemProvider_MembersInjector(
        selectRelatedPersonNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(SelectRelatedPersonListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.selectRelatedPersonNodeInjector = selectRelatedPersonNodeInjectorMembersInjector;
  }

  public static void injectSelectRelatedPersonNodeInjector(
      SelectRelatedPersonListNodeItemProvider instance,
      MembersInjector<SelectRelatedPersonNode> selectRelatedPersonNodeInjector) {
    instance.selectRelatedPersonNodeInjector = selectRelatedPersonNodeInjector;
  }
}
