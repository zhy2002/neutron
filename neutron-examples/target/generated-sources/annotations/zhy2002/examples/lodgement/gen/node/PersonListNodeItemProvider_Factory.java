package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonListNodeItemProvider_Factory
    implements Factory<PersonListNodeItemProvider> {
  private final MembersInjector<PersonListNodeItemProvider>
      personListNodeItemProviderMembersInjector;

  public PersonListNodeItemProvider_Factory(
      MembersInjector<PersonListNodeItemProvider> personListNodeItemProviderMembersInjector) {
    assert personListNodeItemProviderMembersInjector != null;
    this.personListNodeItemProviderMembersInjector = personListNodeItemProviderMembersInjector;
  }

  @Override
  public PersonListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        personListNodeItemProviderMembersInjector, new PersonListNodeItemProvider());
  }

  public static Factory<PersonListNodeItemProvider> create(
      MembersInjector<PersonListNodeItemProvider> personListNodeItemProviderMembersInjector) {
    return new PersonListNodeItemProvider_Factory(personListNodeItemProviderMembersInjector);
  }
}
