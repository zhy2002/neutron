package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeItemProvider_MembersInjector
    implements MembersInjector<PreviousEmploymentListNodeItemProvider> {
  private final MembersInjector<PreviousEmploymentNode>
      previousEmploymentNodeInjectorMembersInjector;

  public PreviousEmploymentListNodeItemProvider_MembersInjector(
      MembersInjector<PreviousEmploymentNode> previousEmploymentNodeInjectorMembersInjector) {
    assert previousEmploymentNodeInjectorMembersInjector != null;
    this.previousEmploymentNodeInjectorMembersInjector =
        previousEmploymentNodeInjectorMembersInjector;
  }

  public static MembersInjector<PreviousEmploymentListNodeItemProvider> create(
      MembersInjector<PreviousEmploymentNode> previousEmploymentNodeInjectorMembersInjector) {
    return new PreviousEmploymentListNodeItemProvider_MembersInjector(
        previousEmploymentNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PreviousEmploymentListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.previousEmploymentNodeInjector = previousEmploymentNodeInjectorMembersInjector;
  }

  public static void injectPreviousEmploymentNodeInjector(
      PreviousEmploymentListNodeItemProvider instance,
      MembersInjector<PreviousEmploymentNode> previousEmploymentNodeInjector) {
    instance.previousEmploymentNodeInjector = previousEmploymentNodeInjector;
  }
}
