package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeItemProvider_MembersInjector
    implements MembersInjector<OtherLiabilityListNodeItemProvider> {
  private final MembersInjector<OtherLiabilityNode> otherLiabilityNodeInjectorMembersInjector;

  public OtherLiabilityListNodeItemProvider_MembersInjector(
      MembersInjector<OtherLiabilityNode> otherLiabilityNodeInjectorMembersInjector) {
    assert otherLiabilityNodeInjectorMembersInjector != null;
    this.otherLiabilityNodeInjectorMembersInjector = otherLiabilityNodeInjectorMembersInjector;
  }

  public static MembersInjector<OtherLiabilityListNodeItemProvider> create(
      MembersInjector<OtherLiabilityNode> otherLiabilityNodeInjectorMembersInjector) {
    return new OtherLiabilityListNodeItemProvider_MembersInjector(
        otherLiabilityNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OtherLiabilityListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.otherLiabilityNodeInjector = otherLiabilityNodeInjectorMembersInjector;
  }

  public static void injectOtherLiabilityNodeInjector(
      OtherLiabilityListNodeItemProvider instance,
      MembersInjector<OtherLiabilityNode> otherLiabilityNodeInjector) {
    instance.otherLiabilityNodeInjector = otherLiabilityNodeInjector;
  }
}
