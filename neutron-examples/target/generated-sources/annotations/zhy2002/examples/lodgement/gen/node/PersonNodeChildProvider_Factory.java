package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeChildProvider_Factory implements Factory<PersonNodeChildProvider> {
  private final MembersInjector<PersonNodeChildProvider> personNodeChildProviderMembersInjector;

  public PersonNodeChildProvider_Factory(
      MembersInjector<PersonNodeChildProvider> personNodeChildProviderMembersInjector) {
    assert personNodeChildProviderMembersInjector != null;
    this.personNodeChildProviderMembersInjector = personNodeChildProviderMembersInjector;
  }

  @Override
  public PersonNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        personNodeChildProviderMembersInjector, new PersonNodeChildProvider());
  }

  public static Factory<PersonNodeChildProvider> create(
      MembersInjector<PersonNodeChildProvider> personNodeChildProviderMembersInjector) {
    return new PersonNodeChildProvider_Factory(personNodeChildProviderMembersInjector);
  }
}
