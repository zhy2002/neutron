package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessNodeChildProvider_MembersInjector
    implements MembersInjector<AccessNodeChildProvider> {
  private final MembersInjector<AccessContactLastNameNode>
      accessContactLastNameNodeInjectorMembersInjector;

  private final MembersInjector<AccessOtherDescriptionNode>
      accessOtherDescriptionNodeInjectorMembersInjector;

  private final MembersInjector<AccessContactFirstNameNode>
      accessContactFirstNameNodeInjectorMembersInjector;

  private final MembersInjector<AccessContactTypeNode> accessContactTypeNodeInjectorMembersInjector;

  private final MembersInjector<AccessContactTitleNode>
      accessContactTitleNodeInjectorMembersInjector;

  private final MembersInjector<AccessTelephoneNode> accessTelephoneNodeInjectorMembersInjector;

  private final MembersInjector<AccessCompanyNameNode> accessCompanyNameNodeInjectorMembersInjector;

  public AccessNodeChildProvider_MembersInjector(
      MembersInjector<AccessContactLastNameNode> accessContactLastNameNodeInjectorMembersInjector,
      MembersInjector<AccessOtherDescriptionNode> accessOtherDescriptionNodeInjectorMembersInjector,
      MembersInjector<AccessContactFirstNameNode> accessContactFirstNameNodeInjectorMembersInjector,
      MembersInjector<AccessContactTypeNode> accessContactTypeNodeInjectorMembersInjector,
      MembersInjector<AccessContactTitleNode> accessContactTitleNodeInjectorMembersInjector,
      MembersInjector<AccessTelephoneNode> accessTelephoneNodeInjectorMembersInjector,
      MembersInjector<AccessCompanyNameNode> accessCompanyNameNodeInjectorMembersInjector) {
    assert accessContactLastNameNodeInjectorMembersInjector != null;
    this.accessContactLastNameNodeInjectorMembersInjector =
        accessContactLastNameNodeInjectorMembersInjector;
    assert accessOtherDescriptionNodeInjectorMembersInjector != null;
    this.accessOtherDescriptionNodeInjectorMembersInjector =
        accessOtherDescriptionNodeInjectorMembersInjector;
    assert accessContactFirstNameNodeInjectorMembersInjector != null;
    this.accessContactFirstNameNodeInjectorMembersInjector =
        accessContactFirstNameNodeInjectorMembersInjector;
    assert accessContactTypeNodeInjectorMembersInjector != null;
    this.accessContactTypeNodeInjectorMembersInjector =
        accessContactTypeNodeInjectorMembersInjector;
    assert accessContactTitleNodeInjectorMembersInjector != null;
    this.accessContactTitleNodeInjectorMembersInjector =
        accessContactTitleNodeInjectorMembersInjector;
    assert accessTelephoneNodeInjectorMembersInjector != null;
    this.accessTelephoneNodeInjectorMembersInjector = accessTelephoneNodeInjectorMembersInjector;
    assert accessCompanyNameNodeInjectorMembersInjector != null;
    this.accessCompanyNameNodeInjectorMembersInjector =
        accessCompanyNameNodeInjectorMembersInjector;
  }

  public static MembersInjector<AccessNodeChildProvider> create(
      MembersInjector<AccessContactLastNameNode> accessContactLastNameNodeInjectorMembersInjector,
      MembersInjector<AccessOtherDescriptionNode> accessOtherDescriptionNodeInjectorMembersInjector,
      MembersInjector<AccessContactFirstNameNode> accessContactFirstNameNodeInjectorMembersInjector,
      MembersInjector<AccessContactTypeNode> accessContactTypeNodeInjectorMembersInjector,
      MembersInjector<AccessContactTitleNode> accessContactTitleNodeInjectorMembersInjector,
      MembersInjector<AccessTelephoneNode> accessTelephoneNodeInjectorMembersInjector,
      MembersInjector<AccessCompanyNameNode> accessCompanyNameNodeInjectorMembersInjector) {
    return new AccessNodeChildProvider_MembersInjector(
        accessContactLastNameNodeInjectorMembersInjector,
        accessOtherDescriptionNodeInjectorMembersInjector,
        accessContactFirstNameNodeInjectorMembersInjector,
        accessContactTypeNodeInjectorMembersInjector,
        accessContactTitleNodeInjectorMembersInjector,
        accessTelephoneNodeInjectorMembersInjector,
        accessCompanyNameNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(AccessNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.accessContactLastNameNodeInjector = accessContactLastNameNodeInjectorMembersInjector;
    instance.accessOtherDescriptionNodeInjector = accessOtherDescriptionNodeInjectorMembersInjector;
    instance.accessContactFirstNameNodeInjector = accessContactFirstNameNodeInjectorMembersInjector;
    instance.accessContactTypeNodeInjector = accessContactTypeNodeInjectorMembersInjector;
    instance.accessContactTitleNodeInjector = accessContactTitleNodeInjectorMembersInjector;
    instance.accessTelephoneNodeInjector = accessTelephoneNodeInjectorMembersInjector;
    instance.accessCompanyNameNodeInjector = accessCompanyNameNodeInjectorMembersInjector;
  }

  public static void injectAccessContactLastNameNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessContactLastNameNode> accessContactLastNameNodeInjector) {
    instance.accessContactLastNameNodeInjector = accessContactLastNameNodeInjector;
  }

  public static void injectAccessOtherDescriptionNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessOtherDescriptionNode> accessOtherDescriptionNodeInjector) {
    instance.accessOtherDescriptionNodeInjector = accessOtherDescriptionNodeInjector;
  }

  public static void injectAccessContactFirstNameNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessContactFirstNameNode> accessContactFirstNameNodeInjector) {
    instance.accessContactFirstNameNodeInjector = accessContactFirstNameNodeInjector;
  }

  public static void injectAccessContactTypeNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessContactTypeNode> accessContactTypeNodeInjector) {
    instance.accessContactTypeNodeInjector = accessContactTypeNodeInjector;
  }

  public static void injectAccessContactTitleNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessContactTitleNode> accessContactTitleNodeInjector) {
    instance.accessContactTitleNodeInjector = accessContactTitleNodeInjector;
  }

  public static void injectAccessTelephoneNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessTelephoneNode> accessTelephoneNodeInjector) {
    instance.accessTelephoneNodeInjector = accessTelephoneNodeInjector;
  }

  public static void injectAccessCompanyNameNodeInjector(
      AccessNodeChildProvider instance,
      MembersInjector<AccessCompanyNameNode> accessCompanyNameNodeInjector) {
    instance.accessCompanyNameNodeInjector = accessCompanyNameNodeInjector;
  }
}
