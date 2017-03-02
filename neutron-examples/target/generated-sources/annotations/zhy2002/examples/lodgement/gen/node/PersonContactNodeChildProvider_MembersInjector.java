package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonContactNodeChildProvider_MembersInjector
    implements MembersInjector<PersonContactNodeChildProvider> {
  private final MembersInjector<PersonHomePhoneNode> personHomePhoneNodeInjectorMembersInjector;

  public PersonContactNodeChildProvider_MembersInjector(
      MembersInjector<PersonHomePhoneNode> personHomePhoneNodeInjectorMembersInjector) {
    assert personHomePhoneNodeInjectorMembersInjector != null;
    this.personHomePhoneNodeInjectorMembersInjector = personHomePhoneNodeInjectorMembersInjector;
  }

  public static MembersInjector<PersonContactNodeChildProvider> create(
      MembersInjector<PersonHomePhoneNode> personHomePhoneNodeInjectorMembersInjector) {
    return new PersonContactNodeChildProvider_MembersInjector(
        personHomePhoneNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PersonContactNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.personHomePhoneNodeInjector = personHomePhoneNodeInjectorMembersInjector;
  }

  public static void injectPersonHomePhoneNodeInjector(
      PersonContactNodeChildProvider instance,
      MembersInjector<PersonHomePhoneNode> personHomePhoneNodeInjector) {
    instance.personHomePhoneNodeInjector = personHomePhoneNodeInjector;
  }
}
