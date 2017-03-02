package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonContactNodeChildProvider_Factory
    implements Factory<PersonContactNodeChildProvider> {
  private final MembersInjector<PersonContactNodeChildProvider>
      personContactNodeChildProviderMembersInjector;

  public PersonContactNodeChildProvider_Factory(
      MembersInjector<PersonContactNodeChildProvider>
          personContactNodeChildProviderMembersInjector) {
    assert personContactNodeChildProviderMembersInjector != null;
    this.personContactNodeChildProviderMembersInjector =
        personContactNodeChildProviderMembersInjector;
  }

  @Override
  public PersonContactNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        personContactNodeChildProviderMembersInjector, new PersonContactNodeChildProvider());
  }

  public static Factory<PersonContactNodeChildProvider> create(
      MembersInjector<PersonContactNodeChildProvider>
          personContactNodeChildProviderMembersInjector) {
    return new PersonContactNodeChildProvider_Factory(
        personContactNodeChildProviderMembersInjector);
  }
}
