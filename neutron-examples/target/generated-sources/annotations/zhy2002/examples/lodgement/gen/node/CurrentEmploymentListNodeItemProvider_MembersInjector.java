package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CurrentEmploymentListNodeItemProvider_MembersInjector
    implements MembersInjector<CurrentEmploymentListNodeItemProvider> {
  private final MembersInjector<CurrentEmploymentNode> currentEmploymentNodeInjectorMembersInjector;

  public CurrentEmploymentListNodeItemProvider_MembersInjector(
      MembersInjector<CurrentEmploymentNode> currentEmploymentNodeInjectorMembersInjector) {
    assert currentEmploymentNodeInjectorMembersInjector != null;
    this.currentEmploymentNodeInjectorMembersInjector =
        currentEmploymentNodeInjectorMembersInjector;
  }

  public static MembersInjector<CurrentEmploymentListNodeItemProvider> create(
      MembersInjector<CurrentEmploymentNode> currentEmploymentNodeInjectorMembersInjector) {
    return new CurrentEmploymentListNodeItemProvider_MembersInjector(
        currentEmploymentNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(CurrentEmploymentListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.currentEmploymentNodeInjector = currentEmploymentNodeInjectorMembersInjector;
  }

  public static void injectCurrentEmploymentNodeInjector(
      CurrentEmploymentListNodeItemProvider instance,
      MembersInjector<CurrentEmploymentNode> currentEmploymentNodeInjector) {
    instance.currentEmploymentNodeInjector = currentEmploymentNodeInjector;
  }
}
