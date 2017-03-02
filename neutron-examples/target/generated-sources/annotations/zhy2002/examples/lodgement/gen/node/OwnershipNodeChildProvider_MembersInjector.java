package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipNodeChildProvider_MembersInjector
    implements MembersInjector<OwnershipNodeChildProvider> {
  private final MembersInjector<ApplicantReferenceNode>
      applicantReferenceNodeInjectorMembersInjector;

  private final MembersInjector<AverageFlagNode> averageFlagNodeInjectorMembersInjector;

  private final MembersInjector<OwnershipPercentageNode>
      ownershipPercentageNodeInjectorMembersInjector;

  public OwnershipNodeChildProvider_MembersInjector(
      MembersInjector<ApplicantReferenceNode> applicantReferenceNodeInjectorMembersInjector,
      MembersInjector<AverageFlagNode> averageFlagNodeInjectorMembersInjector,
      MembersInjector<OwnershipPercentageNode> ownershipPercentageNodeInjectorMembersInjector) {
    assert applicantReferenceNodeInjectorMembersInjector != null;
    this.applicantReferenceNodeInjectorMembersInjector =
        applicantReferenceNodeInjectorMembersInjector;
    assert averageFlagNodeInjectorMembersInjector != null;
    this.averageFlagNodeInjectorMembersInjector = averageFlagNodeInjectorMembersInjector;
    assert ownershipPercentageNodeInjectorMembersInjector != null;
    this.ownershipPercentageNodeInjectorMembersInjector =
        ownershipPercentageNodeInjectorMembersInjector;
  }

  public static MembersInjector<OwnershipNodeChildProvider> create(
      MembersInjector<ApplicantReferenceNode> applicantReferenceNodeInjectorMembersInjector,
      MembersInjector<AverageFlagNode> averageFlagNodeInjectorMembersInjector,
      MembersInjector<OwnershipPercentageNode> ownershipPercentageNodeInjectorMembersInjector) {
    return new OwnershipNodeChildProvider_MembersInjector(
        applicantReferenceNodeInjectorMembersInjector,
        averageFlagNodeInjectorMembersInjector,
        ownershipPercentageNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(OwnershipNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.applicantReferenceNodeInjector = applicantReferenceNodeInjectorMembersInjector;
    instance.averageFlagNodeInjector = averageFlagNodeInjectorMembersInjector;
    instance.ownershipPercentageNodeInjector = ownershipPercentageNodeInjectorMembersInjector;
  }

  public static void injectApplicantReferenceNodeInjector(
      OwnershipNodeChildProvider instance,
      MembersInjector<ApplicantReferenceNode> applicantReferenceNodeInjector) {
    instance.applicantReferenceNodeInjector = applicantReferenceNodeInjector;
  }

  public static void injectAverageFlagNodeInjector(
      OwnershipNodeChildProvider instance,
      MembersInjector<AverageFlagNode> averageFlagNodeInjector) {
    instance.averageFlagNodeInjector = averageFlagNodeInjector;
  }

  public static void injectOwnershipPercentageNodeInjector(
      OwnershipNodeChildProvider instance,
      MembersInjector<OwnershipPercentageNode> ownershipPercentageNodeInjector) {
    instance.ownershipPercentageNodeInjector = ownershipPercentageNodeInjector;
  }
}
