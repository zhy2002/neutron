package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsageNodeChildProvider_MembersInjector
    implements MembersInjector<UsageNodeChildProvider> {
  private final MembersInjector<OwnedOutrightFlagNode> ownedOutrightFlagNodeInjectorMembersInjector;

  private final MembersInjector<ApprovalInPrincipleFlagNode>
      approvalInPrincipleFlagNodeInjectorMembersInjector;

  private final MembersInjector<PrimarySecurityFlagNode>
      primarySecurityFlagNodeInjectorMembersInjector;

  private final MembersInjector<BeingPurchasedFlagNode>
      beingPurchasedFlagNodeInjectorMembersInjector;

  private final MembersInjector<UsedAsSecurityFlagNode>
      usedAsSecurityFlagNodeInjectorMembersInjector;

  private final MembersInjector<ExistingMortgageListNode>
      existingMortgageListNodeInjectorMembersInjector;

  public UsageNodeChildProvider_MembersInjector(
      MembersInjector<OwnedOutrightFlagNode> ownedOutrightFlagNodeInjectorMembersInjector,
      MembersInjector<ApprovalInPrincipleFlagNode>
          approvalInPrincipleFlagNodeInjectorMembersInjector,
      MembersInjector<PrimarySecurityFlagNode> primarySecurityFlagNodeInjectorMembersInjector,
      MembersInjector<BeingPurchasedFlagNode> beingPurchasedFlagNodeInjectorMembersInjector,
      MembersInjector<UsedAsSecurityFlagNode> usedAsSecurityFlagNodeInjectorMembersInjector,
      MembersInjector<ExistingMortgageListNode> existingMortgageListNodeInjectorMembersInjector) {
    assert ownedOutrightFlagNodeInjectorMembersInjector != null;
    this.ownedOutrightFlagNodeInjectorMembersInjector =
        ownedOutrightFlagNodeInjectorMembersInjector;
    assert approvalInPrincipleFlagNodeInjectorMembersInjector != null;
    this.approvalInPrincipleFlagNodeInjectorMembersInjector =
        approvalInPrincipleFlagNodeInjectorMembersInjector;
    assert primarySecurityFlagNodeInjectorMembersInjector != null;
    this.primarySecurityFlagNodeInjectorMembersInjector =
        primarySecurityFlagNodeInjectorMembersInjector;
    assert beingPurchasedFlagNodeInjectorMembersInjector != null;
    this.beingPurchasedFlagNodeInjectorMembersInjector =
        beingPurchasedFlagNodeInjectorMembersInjector;
    assert usedAsSecurityFlagNodeInjectorMembersInjector != null;
    this.usedAsSecurityFlagNodeInjectorMembersInjector =
        usedAsSecurityFlagNodeInjectorMembersInjector;
    assert existingMortgageListNodeInjectorMembersInjector != null;
    this.existingMortgageListNodeInjectorMembersInjector =
        existingMortgageListNodeInjectorMembersInjector;
  }

  public static MembersInjector<UsageNodeChildProvider> create(
      MembersInjector<OwnedOutrightFlagNode> ownedOutrightFlagNodeInjectorMembersInjector,
      MembersInjector<ApprovalInPrincipleFlagNode>
          approvalInPrincipleFlagNodeInjectorMembersInjector,
      MembersInjector<PrimarySecurityFlagNode> primarySecurityFlagNodeInjectorMembersInjector,
      MembersInjector<BeingPurchasedFlagNode> beingPurchasedFlagNodeInjectorMembersInjector,
      MembersInjector<UsedAsSecurityFlagNode> usedAsSecurityFlagNodeInjectorMembersInjector,
      MembersInjector<ExistingMortgageListNode> existingMortgageListNodeInjectorMembersInjector) {
    return new UsageNodeChildProvider_MembersInjector(
        ownedOutrightFlagNodeInjectorMembersInjector,
        approvalInPrincipleFlagNodeInjectorMembersInjector,
        primarySecurityFlagNodeInjectorMembersInjector,
        beingPurchasedFlagNodeInjectorMembersInjector,
        usedAsSecurityFlagNodeInjectorMembersInjector,
        existingMortgageListNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(UsageNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.ownedOutrightFlagNodeInjector = ownedOutrightFlagNodeInjectorMembersInjector;
    instance.approvalInPrincipleFlagNodeInjector =
        approvalInPrincipleFlagNodeInjectorMembersInjector;
    instance.primarySecurityFlagNodeInjector = primarySecurityFlagNodeInjectorMembersInjector;
    instance.beingPurchasedFlagNodeInjector = beingPurchasedFlagNodeInjectorMembersInjector;
    instance.usedAsSecurityFlagNodeInjector = usedAsSecurityFlagNodeInjectorMembersInjector;
    instance.existingMortgageListNodeInjector = existingMortgageListNodeInjectorMembersInjector;
  }

  public static void injectOwnedOutrightFlagNodeInjector(
      UsageNodeChildProvider instance,
      MembersInjector<OwnedOutrightFlagNode> ownedOutrightFlagNodeInjector) {
    instance.ownedOutrightFlagNodeInjector = ownedOutrightFlagNodeInjector;
  }

  public static void injectApprovalInPrincipleFlagNodeInjector(
      UsageNodeChildProvider instance,
      MembersInjector<ApprovalInPrincipleFlagNode> approvalInPrincipleFlagNodeInjector) {
    instance.approvalInPrincipleFlagNodeInjector = approvalInPrincipleFlagNodeInjector;
  }

  public static void injectPrimarySecurityFlagNodeInjector(
      UsageNodeChildProvider instance,
      MembersInjector<PrimarySecurityFlagNode> primarySecurityFlagNodeInjector) {
    instance.primarySecurityFlagNodeInjector = primarySecurityFlagNodeInjector;
  }

  public static void injectBeingPurchasedFlagNodeInjector(
      UsageNodeChildProvider instance,
      MembersInjector<BeingPurchasedFlagNode> beingPurchasedFlagNodeInjector) {
    instance.beingPurchasedFlagNodeInjector = beingPurchasedFlagNodeInjector;
  }

  public static void injectUsedAsSecurityFlagNodeInjector(
      UsageNodeChildProvider instance,
      MembersInjector<UsedAsSecurityFlagNode> usedAsSecurityFlagNodeInjector) {
    instance.usedAsSecurityFlagNodeInjector = usedAsSecurityFlagNodeInjector;
  }

  public static void injectExistingMortgageListNodeInjector(
      UsageNodeChildProvider instance,
      MembersInjector<ExistingMortgageListNode> existingMortgageListNodeInjector) {
    instance.existingMortgageListNodeInjector = existingMortgageListNodeInjector;
  }
}
