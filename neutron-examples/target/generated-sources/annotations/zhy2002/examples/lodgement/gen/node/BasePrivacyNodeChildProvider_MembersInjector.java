package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BasePrivacyNodeChildProvider_MembersInjector
    implements MembersInjector<BasePrivacyNodeChildProvider> {
  private final MembersInjector<ThirdPartyDisclosureFlagNode>
      thirdPartyDisclosureFlagNodeInjectorMembersInjector;

  private final MembersInjector<CreditHistoryListNode> creditHistoryListNodeInjectorMembersInjector;

  private final MembersInjector<LegalActionNode> legalActionNodeInjectorMembersInjector;

  private final MembersInjector<CreditCheckFlagNode> creditCheckFlagNodeInjectorMembersInjector;

  public BasePrivacyNodeChildProvider_MembersInjector(
      MembersInjector<ThirdPartyDisclosureFlagNode>
          thirdPartyDisclosureFlagNodeInjectorMembersInjector,
      MembersInjector<CreditHistoryListNode> creditHistoryListNodeInjectorMembersInjector,
      MembersInjector<LegalActionNode> legalActionNodeInjectorMembersInjector,
      MembersInjector<CreditCheckFlagNode> creditCheckFlagNodeInjectorMembersInjector) {
    assert thirdPartyDisclosureFlagNodeInjectorMembersInjector != null;
    this.thirdPartyDisclosureFlagNodeInjectorMembersInjector =
        thirdPartyDisclosureFlagNodeInjectorMembersInjector;
    assert creditHistoryListNodeInjectorMembersInjector != null;
    this.creditHistoryListNodeInjectorMembersInjector =
        creditHistoryListNodeInjectorMembersInjector;
    assert legalActionNodeInjectorMembersInjector != null;
    this.legalActionNodeInjectorMembersInjector = legalActionNodeInjectorMembersInjector;
    assert creditCheckFlagNodeInjectorMembersInjector != null;
    this.creditCheckFlagNodeInjectorMembersInjector = creditCheckFlagNodeInjectorMembersInjector;
  }

  public static MembersInjector<BasePrivacyNodeChildProvider> create(
      MembersInjector<ThirdPartyDisclosureFlagNode>
          thirdPartyDisclosureFlagNodeInjectorMembersInjector,
      MembersInjector<CreditHistoryListNode> creditHistoryListNodeInjectorMembersInjector,
      MembersInjector<LegalActionNode> legalActionNodeInjectorMembersInjector,
      MembersInjector<CreditCheckFlagNode> creditCheckFlagNodeInjectorMembersInjector) {
    return new BasePrivacyNodeChildProvider_MembersInjector(
        thirdPartyDisclosureFlagNodeInjectorMembersInjector,
        creditHistoryListNodeInjectorMembersInjector,
        legalActionNodeInjectorMembersInjector,
        creditCheckFlagNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(BasePrivacyNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.thirdPartyDisclosureFlagNodeInjector =
        thirdPartyDisclosureFlagNodeInjectorMembersInjector;
    instance.creditHistoryListNodeInjector = creditHistoryListNodeInjectorMembersInjector;
    instance.legalActionNodeInjector = legalActionNodeInjectorMembersInjector;
    instance.creditCheckFlagNodeInjector = creditCheckFlagNodeInjectorMembersInjector;
  }

  public static void injectThirdPartyDisclosureFlagNodeInjector(
      BasePrivacyNodeChildProvider instance,
      MembersInjector<ThirdPartyDisclosureFlagNode> thirdPartyDisclosureFlagNodeInjector) {
    instance.thirdPartyDisclosureFlagNodeInjector = thirdPartyDisclosureFlagNodeInjector;
  }

  public static void injectCreditHistoryListNodeInjector(
      BasePrivacyNodeChildProvider instance,
      MembersInjector<CreditHistoryListNode> creditHistoryListNodeInjector) {
    instance.creditHistoryListNodeInjector = creditHistoryListNodeInjector;
  }

  public static void injectLegalActionNodeInjector(
      BasePrivacyNodeChildProvider instance,
      MembersInjector<LegalActionNode> legalActionNodeInjector) {
    instance.legalActionNodeInjector = legalActionNodeInjector;
  }

  public static void injectCreditCheckFlagNodeInjector(
      BasePrivacyNodeChildProvider instance,
      MembersInjector<CreditCheckFlagNode> creditCheckFlagNodeInjector) {
    instance.creditCheckFlagNodeInjector = creditCheckFlagNodeInjector;
  }
}
