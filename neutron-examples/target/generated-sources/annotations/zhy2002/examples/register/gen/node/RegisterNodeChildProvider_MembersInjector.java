package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RegisterNodeChildProvider_MembersInjector
    implements MembersInjector<RegisterNodeChildProvider> {
  private final MembersInjector<PlanNode> planNodeInjectorMembersInjector;

  private final MembersInjector<ReceiveOffersNode> receiveOffersNodeInjectorMembersInjector;

  private final MembersInjector<UsernameNode> usernameNodeInjectorMembersInjector;

  private final MembersInjector<RepeatPasswordNode> repeatPasswordNodeInjectorMembersInjector;

  private final MembersInjector<PropertyDetailsNode> propertyDetailsNodeInjectorMembersInjector;

  private final MembersInjector<PhoneInfoNode> phoneInfoNodeInjectorMembersInjector;

  private final MembersInjector<PasswordNode> passwordNodeInjectorMembersInjector;

  private final MembersInjector<OwnInvestmentPropertyNode>
      ownInvestmentPropertyNodeInjectorMembersInjector;

  private final MembersInjector<ErrorListNode> errorListNodeInjectorMembersInjector;

  private final MembersInjector<EmailNode> emailNodeInjectorMembersInjector;

  private final MembersInjector<AgeNode> ageNodeInjectorMembersInjector;

  public RegisterNodeChildProvider_MembersInjector(
      MembersInjector<PlanNode> planNodeInjectorMembersInjector,
      MembersInjector<ReceiveOffersNode> receiveOffersNodeInjectorMembersInjector,
      MembersInjector<UsernameNode> usernameNodeInjectorMembersInjector,
      MembersInjector<RepeatPasswordNode> repeatPasswordNodeInjectorMembersInjector,
      MembersInjector<PropertyDetailsNode> propertyDetailsNodeInjectorMembersInjector,
      MembersInjector<PhoneInfoNode> phoneInfoNodeInjectorMembersInjector,
      MembersInjector<PasswordNode> passwordNodeInjectorMembersInjector,
      MembersInjector<OwnInvestmentPropertyNode> ownInvestmentPropertyNodeInjectorMembersInjector,
      MembersInjector<ErrorListNode> errorListNodeInjectorMembersInjector,
      MembersInjector<EmailNode> emailNodeInjectorMembersInjector,
      MembersInjector<AgeNode> ageNodeInjectorMembersInjector) {
    assert planNodeInjectorMembersInjector != null;
    this.planNodeInjectorMembersInjector = planNodeInjectorMembersInjector;
    assert receiveOffersNodeInjectorMembersInjector != null;
    this.receiveOffersNodeInjectorMembersInjector = receiveOffersNodeInjectorMembersInjector;
    assert usernameNodeInjectorMembersInjector != null;
    this.usernameNodeInjectorMembersInjector = usernameNodeInjectorMembersInjector;
    assert repeatPasswordNodeInjectorMembersInjector != null;
    this.repeatPasswordNodeInjectorMembersInjector = repeatPasswordNodeInjectorMembersInjector;
    assert propertyDetailsNodeInjectorMembersInjector != null;
    this.propertyDetailsNodeInjectorMembersInjector = propertyDetailsNodeInjectorMembersInjector;
    assert phoneInfoNodeInjectorMembersInjector != null;
    this.phoneInfoNodeInjectorMembersInjector = phoneInfoNodeInjectorMembersInjector;
    assert passwordNodeInjectorMembersInjector != null;
    this.passwordNodeInjectorMembersInjector = passwordNodeInjectorMembersInjector;
    assert ownInvestmentPropertyNodeInjectorMembersInjector != null;
    this.ownInvestmentPropertyNodeInjectorMembersInjector =
        ownInvestmentPropertyNodeInjectorMembersInjector;
    assert errorListNodeInjectorMembersInjector != null;
    this.errorListNodeInjectorMembersInjector = errorListNodeInjectorMembersInjector;
    assert emailNodeInjectorMembersInjector != null;
    this.emailNodeInjectorMembersInjector = emailNodeInjectorMembersInjector;
    assert ageNodeInjectorMembersInjector != null;
    this.ageNodeInjectorMembersInjector = ageNodeInjectorMembersInjector;
  }

  public static MembersInjector<RegisterNodeChildProvider> create(
      MembersInjector<PlanNode> planNodeInjectorMembersInjector,
      MembersInjector<ReceiveOffersNode> receiveOffersNodeInjectorMembersInjector,
      MembersInjector<UsernameNode> usernameNodeInjectorMembersInjector,
      MembersInjector<RepeatPasswordNode> repeatPasswordNodeInjectorMembersInjector,
      MembersInjector<PropertyDetailsNode> propertyDetailsNodeInjectorMembersInjector,
      MembersInjector<PhoneInfoNode> phoneInfoNodeInjectorMembersInjector,
      MembersInjector<PasswordNode> passwordNodeInjectorMembersInjector,
      MembersInjector<OwnInvestmentPropertyNode> ownInvestmentPropertyNodeInjectorMembersInjector,
      MembersInjector<ErrorListNode> errorListNodeInjectorMembersInjector,
      MembersInjector<EmailNode> emailNodeInjectorMembersInjector,
      MembersInjector<AgeNode> ageNodeInjectorMembersInjector) {
    return new RegisterNodeChildProvider_MembersInjector(
        planNodeInjectorMembersInjector,
        receiveOffersNodeInjectorMembersInjector,
        usernameNodeInjectorMembersInjector,
        repeatPasswordNodeInjectorMembersInjector,
        propertyDetailsNodeInjectorMembersInjector,
        phoneInfoNodeInjectorMembersInjector,
        passwordNodeInjectorMembersInjector,
        ownInvestmentPropertyNodeInjectorMembersInjector,
        errorListNodeInjectorMembersInjector,
        emailNodeInjectorMembersInjector,
        ageNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(RegisterNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.planNodeInjector = planNodeInjectorMembersInjector;
    instance.receiveOffersNodeInjector = receiveOffersNodeInjectorMembersInjector;
    instance.usernameNodeInjector = usernameNodeInjectorMembersInjector;
    instance.repeatPasswordNodeInjector = repeatPasswordNodeInjectorMembersInjector;
    instance.propertyDetailsNodeInjector = propertyDetailsNodeInjectorMembersInjector;
    instance.phoneInfoNodeInjector = phoneInfoNodeInjectorMembersInjector;
    instance.passwordNodeInjector = passwordNodeInjectorMembersInjector;
    instance.ownInvestmentPropertyNodeInjector = ownInvestmentPropertyNodeInjectorMembersInjector;
    instance.errorListNodeInjector = errorListNodeInjectorMembersInjector;
    instance.emailNodeInjector = emailNodeInjectorMembersInjector;
    instance.ageNodeInjector = ageNodeInjectorMembersInjector;
  }

  public static void injectPlanNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<PlanNode> planNodeInjector) {
    instance.planNodeInjector = planNodeInjector;
  }

  public static void injectReceiveOffersNodeInjector(
      RegisterNodeChildProvider instance,
      MembersInjector<ReceiveOffersNode> receiveOffersNodeInjector) {
    instance.receiveOffersNodeInjector = receiveOffersNodeInjector;
  }

  public static void injectUsernameNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<UsernameNode> usernameNodeInjector) {
    instance.usernameNodeInjector = usernameNodeInjector;
  }

  public static void injectRepeatPasswordNodeInjector(
      RegisterNodeChildProvider instance,
      MembersInjector<RepeatPasswordNode> repeatPasswordNodeInjector) {
    instance.repeatPasswordNodeInjector = repeatPasswordNodeInjector;
  }

  public static void injectPropertyDetailsNodeInjector(
      RegisterNodeChildProvider instance,
      MembersInjector<PropertyDetailsNode> propertyDetailsNodeInjector) {
    instance.propertyDetailsNodeInjector = propertyDetailsNodeInjector;
  }

  public static void injectPhoneInfoNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<PhoneInfoNode> phoneInfoNodeInjector) {
    instance.phoneInfoNodeInjector = phoneInfoNodeInjector;
  }

  public static void injectPasswordNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<PasswordNode> passwordNodeInjector) {
    instance.passwordNodeInjector = passwordNodeInjector;
  }

  public static void injectOwnInvestmentPropertyNodeInjector(
      RegisterNodeChildProvider instance,
      MembersInjector<OwnInvestmentPropertyNode> ownInvestmentPropertyNodeInjector) {
    instance.ownInvestmentPropertyNodeInjector = ownInvestmentPropertyNodeInjector;
  }

  public static void injectErrorListNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<ErrorListNode> errorListNodeInjector) {
    instance.errorListNodeInjector = errorListNodeInjector;
  }

  public static void injectEmailNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<EmailNode> emailNodeInjector) {
    instance.emailNodeInjector = emailNodeInjector;
  }

  public static void injectAgeNodeInjector(
      RegisterNodeChildProvider instance, MembersInjector<AgeNode> ageNodeInjector) {
    instance.ageNodeInjector = ageNodeInjector;
  }
}
