package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseContactNodeChildProvider_MembersInjector
    implements MembersInjector<BaseContactNodeChildProvider> {
  private final MembersInjector<MovedFromPreviousAddressNode>
      movedFromPreviousAddressNodeInjectorMembersInjector;

  private final MembersInjector<ContactAddressNode> contactAddressNodeInjectorMembersInjector;

  private final MembersInjector<ContactTelephoneNode> contactTelephoneNodeInjectorMembersInjector;

  private final MembersInjector<ContactEmailNode> contactEmailNodeInjectorMembersInjector;

  private final MembersInjector<MovedToPreviousAddressNode>
      movedToPreviousAddressNodeInjectorMembersInjector;

  private final MembersInjector<MobileNumberNode> mobileNumberNodeInjectorMembersInjector;

  private final MembersInjector<MovedToCurrentAddressNode>
      movedToCurrentAddressNodeInjectorMembersInjector;

  public BaseContactNodeChildProvider_MembersInjector(
      MembersInjector<MovedFromPreviousAddressNode>
          movedFromPreviousAddressNodeInjectorMembersInjector,
      MembersInjector<ContactAddressNode> contactAddressNodeInjectorMembersInjector,
      MembersInjector<ContactTelephoneNode> contactTelephoneNodeInjectorMembersInjector,
      MembersInjector<ContactEmailNode> contactEmailNodeInjectorMembersInjector,
      MembersInjector<MovedToPreviousAddressNode> movedToPreviousAddressNodeInjectorMembersInjector,
      MembersInjector<MobileNumberNode> mobileNumberNodeInjectorMembersInjector,
      MembersInjector<MovedToCurrentAddressNode> movedToCurrentAddressNodeInjectorMembersInjector) {
    assert movedFromPreviousAddressNodeInjectorMembersInjector != null;
    this.movedFromPreviousAddressNodeInjectorMembersInjector =
        movedFromPreviousAddressNodeInjectorMembersInjector;
    assert contactAddressNodeInjectorMembersInjector != null;
    this.contactAddressNodeInjectorMembersInjector = contactAddressNodeInjectorMembersInjector;
    assert contactTelephoneNodeInjectorMembersInjector != null;
    this.contactTelephoneNodeInjectorMembersInjector = contactTelephoneNodeInjectorMembersInjector;
    assert contactEmailNodeInjectorMembersInjector != null;
    this.contactEmailNodeInjectorMembersInjector = contactEmailNodeInjectorMembersInjector;
    assert movedToPreviousAddressNodeInjectorMembersInjector != null;
    this.movedToPreviousAddressNodeInjectorMembersInjector =
        movedToPreviousAddressNodeInjectorMembersInjector;
    assert mobileNumberNodeInjectorMembersInjector != null;
    this.mobileNumberNodeInjectorMembersInjector = mobileNumberNodeInjectorMembersInjector;
    assert movedToCurrentAddressNodeInjectorMembersInjector != null;
    this.movedToCurrentAddressNodeInjectorMembersInjector =
        movedToCurrentAddressNodeInjectorMembersInjector;
  }

  public static MembersInjector<BaseContactNodeChildProvider> create(
      MembersInjector<MovedFromPreviousAddressNode>
          movedFromPreviousAddressNodeInjectorMembersInjector,
      MembersInjector<ContactAddressNode> contactAddressNodeInjectorMembersInjector,
      MembersInjector<ContactTelephoneNode> contactTelephoneNodeInjectorMembersInjector,
      MembersInjector<ContactEmailNode> contactEmailNodeInjectorMembersInjector,
      MembersInjector<MovedToPreviousAddressNode> movedToPreviousAddressNodeInjectorMembersInjector,
      MembersInjector<MobileNumberNode> mobileNumberNodeInjectorMembersInjector,
      MembersInjector<MovedToCurrentAddressNode> movedToCurrentAddressNodeInjectorMembersInjector) {
    return new BaseContactNodeChildProvider_MembersInjector(
        movedFromPreviousAddressNodeInjectorMembersInjector,
        contactAddressNodeInjectorMembersInjector,
        contactTelephoneNodeInjectorMembersInjector,
        contactEmailNodeInjectorMembersInjector,
        movedToPreviousAddressNodeInjectorMembersInjector,
        mobileNumberNodeInjectorMembersInjector,
        movedToCurrentAddressNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(BaseContactNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.movedFromPreviousAddressNodeInjector =
        movedFromPreviousAddressNodeInjectorMembersInjector;
    instance.contactAddressNodeInjector = contactAddressNodeInjectorMembersInjector;
    instance.contactTelephoneNodeInjector = contactTelephoneNodeInjectorMembersInjector;
    instance.contactEmailNodeInjector = contactEmailNodeInjectorMembersInjector;
    instance.movedToPreviousAddressNodeInjector = movedToPreviousAddressNodeInjectorMembersInjector;
    instance.mobileNumberNodeInjector = mobileNumberNodeInjectorMembersInjector;
    instance.movedToCurrentAddressNodeInjector = movedToCurrentAddressNodeInjectorMembersInjector;
  }

  public static void injectMovedFromPreviousAddressNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<MovedFromPreviousAddressNode> movedFromPreviousAddressNodeInjector) {
    instance.movedFromPreviousAddressNodeInjector = movedFromPreviousAddressNodeInjector;
  }

  public static void injectContactAddressNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<ContactAddressNode> contactAddressNodeInjector) {
    instance.contactAddressNodeInjector = contactAddressNodeInjector;
  }

  public static void injectContactTelephoneNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<ContactTelephoneNode> contactTelephoneNodeInjector) {
    instance.contactTelephoneNodeInjector = contactTelephoneNodeInjector;
  }

  public static void injectContactEmailNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<ContactEmailNode> contactEmailNodeInjector) {
    instance.contactEmailNodeInjector = contactEmailNodeInjector;
  }

  public static void injectMovedToPreviousAddressNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<MovedToPreviousAddressNode> movedToPreviousAddressNodeInjector) {
    instance.movedToPreviousAddressNodeInjector = movedToPreviousAddressNodeInjector;
  }

  public static void injectMobileNumberNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<MobileNumberNode> mobileNumberNodeInjector) {
    instance.mobileNumberNodeInjector = mobileNumberNodeInjector;
  }

  public static void injectMovedToCurrentAddressNodeInjector(
      BaseContactNodeChildProvider instance,
      MembersInjector<MovedToCurrentAddressNode> movedToCurrentAddressNodeInjector) {
    instance.movedToCurrentAddressNodeInjector = movedToCurrentAddressNodeInjector;
  }
}
