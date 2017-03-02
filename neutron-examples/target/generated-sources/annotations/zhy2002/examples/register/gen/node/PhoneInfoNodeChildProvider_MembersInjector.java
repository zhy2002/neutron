package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PhoneInfoNodeChildProvider_MembersInjector
    implements MembersInjector<PhoneInfoNodeChildProvider> {
  private final MembersInjector<PhoneNumberNode> phoneNumberNodeInjectorMembersInjector;

  private final MembersInjector<PhoneInfoFieldNode> phoneInfoFieldNodeInjectorMembersInjector;

  private final MembersInjector<CountryCodeNode> countryCodeNodeInjectorMembersInjector;

  private final MembersInjector<AreaCodeNode> areaCodeNodeInjectorMembersInjector;

  public PhoneInfoNodeChildProvider_MembersInjector(
      MembersInjector<PhoneNumberNode> phoneNumberNodeInjectorMembersInjector,
      MembersInjector<PhoneInfoFieldNode> phoneInfoFieldNodeInjectorMembersInjector,
      MembersInjector<CountryCodeNode> countryCodeNodeInjectorMembersInjector,
      MembersInjector<AreaCodeNode> areaCodeNodeInjectorMembersInjector) {
    assert phoneNumberNodeInjectorMembersInjector != null;
    this.phoneNumberNodeInjectorMembersInjector = phoneNumberNodeInjectorMembersInjector;
    assert phoneInfoFieldNodeInjectorMembersInjector != null;
    this.phoneInfoFieldNodeInjectorMembersInjector = phoneInfoFieldNodeInjectorMembersInjector;
    assert countryCodeNodeInjectorMembersInjector != null;
    this.countryCodeNodeInjectorMembersInjector = countryCodeNodeInjectorMembersInjector;
    assert areaCodeNodeInjectorMembersInjector != null;
    this.areaCodeNodeInjectorMembersInjector = areaCodeNodeInjectorMembersInjector;
  }

  public static MembersInjector<PhoneInfoNodeChildProvider> create(
      MembersInjector<PhoneNumberNode> phoneNumberNodeInjectorMembersInjector,
      MembersInjector<PhoneInfoFieldNode> phoneInfoFieldNodeInjectorMembersInjector,
      MembersInjector<CountryCodeNode> countryCodeNodeInjectorMembersInjector,
      MembersInjector<AreaCodeNode> areaCodeNodeInjectorMembersInjector) {
    return new PhoneInfoNodeChildProvider_MembersInjector(
        phoneNumberNodeInjectorMembersInjector,
        phoneInfoFieldNodeInjectorMembersInjector,
        countryCodeNodeInjectorMembersInjector,
        areaCodeNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PhoneInfoNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.phoneNumberNodeInjector = phoneNumberNodeInjectorMembersInjector;
    instance.phoneInfoFieldNodeInjector = phoneInfoFieldNodeInjectorMembersInjector;
    instance.countryCodeNodeInjector = countryCodeNodeInjectorMembersInjector;
    instance.areaCodeNodeInjector = areaCodeNodeInjectorMembersInjector;
  }

  public static void injectPhoneNumberNodeInjector(
      PhoneInfoNodeChildProvider instance,
      MembersInjector<PhoneNumberNode> phoneNumberNodeInjector) {
    instance.phoneNumberNodeInjector = phoneNumberNodeInjector;
  }

  public static void injectPhoneInfoFieldNodeInjector(
      PhoneInfoNodeChildProvider instance,
      MembersInjector<PhoneInfoFieldNode> phoneInfoFieldNodeInjector) {
    instance.phoneInfoFieldNodeInjector = phoneInfoFieldNodeInjector;
  }

  public static void injectCountryCodeNodeInjector(
      PhoneInfoNodeChildProvider instance,
      MembersInjector<CountryCodeNode> countryCodeNodeInjector) {
    instance.countryCodeNodeInjector = countryCodeNodeInjector;
  }

  public static void injectAreaCodeNodeInjector(
      PhoneInfoNodeChildProvider instance, MembersInjector<AreaCodeNode> areaCodeNodeInjector) {
    instance.areaCodeNodeInjector = areaCodeNodeInjector;
  }
}
