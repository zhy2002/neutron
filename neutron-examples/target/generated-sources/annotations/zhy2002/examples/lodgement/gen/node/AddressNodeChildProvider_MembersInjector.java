package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddressNodeChildProvider_MembersInjector
    implements MembersInjector<AddressNodeChildProvider> {
  private final MembersInjector<AddressLineNode> addressLineNodeInjectorMembersInjector;

  private final MembersInjector<PostcodeNode> postcodeNodeInjectorMembersInjector;

  private final MembersInjector<SuburbNode> suburbNodeInjectorMembersInjector;

  private final MembersInjector<CountryNode> countryNodeInjectorMembersInjector;

  public AddressNodeChildProvider_MembersInjector(
      MembersInjector<AddressLineNode> addressLineNodeInjectorMembersInjector,
      MembersInjector<PostcodeNode> postcodeNodeInjectorMembersInjector,
      MembersInjector<SuburbNode> suburbNodeInjectorMembersInjector,
      MembersInjector<CountryNode> countryNodeInjectorMembersInjector) {
    assert addressLineNodeInjectorMembersInjector != null;
    this.addressLineNodeInjectorMembersInjector = addressLineNodeInjectorMembersInjector;
    assert postcodeNodeInjectorMembersInjector != null;
    this.postcodeNodeInjectorMembersInjector = postcodeNodeInjectorMembersInjector;
    assert suburbNodeInjectorMembersInjector != null;
    this.suburbNodeInjectorMembersInjector = suburbNodeInjectorMembersInjector;
    assert countryNodeInjectorMembersInjector != null;
    this.countryNodeInjectorMembersInjector = countryNodeInjectorMembersInjector;
  }

  public static MembersInjector<AddressNodeChildProvider> create(
      MembersInjector<AddressLineNode> addressLineNodeInjectorMembersInjector,
      MembersInjector<PostcodeNode> postcodeNodeInjectorMembersInjector,
      MembersInjector<SuburbNode> suburbNodeInjectorMembersInjector,
      MembersInjector<CountryNode> countryNodeInjectorMembersInjector) {
    return new AddressNodeChildProvider_MembersInjector(
        addressLineNodeInjectorMembersInjector,
        postcodeNodeInjectorMembersInjector,
        suburbNodeInjectorMembersInjector,
        countryNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(AddressNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.addressLineNodeInjector = addressLineNodeInjectorMembersInjector;
    instance.postcodeNodeInjector = postcodeNodeInjectorMembersInjector;
    instance.suburbNodeInjector = suburbNodeInjectorMembersInjector;
    instance.countryNodeInjector = countryNodeInjectorMembersInjector;
  }

  public static void injectAddressLineNodeInjector(
      AddressNodeChildProvider instance, MembersInjector<AddressLineNode> addressLineNodeInjector) {
    instance.addressLineNodeInjector = addressLineNodeInjector;
  }

  public static void injectPostcodeNodeInjector(
      AddressNodeChildProvider instance, MembersInjector<PostcodeNode> postcodeNodeInjector) {
    instance.postcodeNodeInjector = postcodeNodeInjector;
  }

  public static void injectSuburbNodeInjector(
      AddressNodeChildProvider instance, MembersInjector<SuburbNode> suburbNodeInjector) {
    instance.suburbNodeInjector = suburbNodeInjector;
  }

  public static void injectCountryNodeInjector(
      AddressNodeChildProvider instance, MembersInjector<CountryNode> countryNodeInjector) {
    instance.countryNodeInjector = countryNodeInjector;
  }
}
