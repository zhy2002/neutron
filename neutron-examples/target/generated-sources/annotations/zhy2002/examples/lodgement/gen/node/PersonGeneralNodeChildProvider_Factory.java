package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonGeneralNodeChildProvider_Factory
    implements Factory<PersonGeneralNodeChildProvider> {
  private final MembersInjector<PersonGeneralNodeChildProvider>
      personGeneralNodeChildProviderMembersInjector;

  public PersonGeneralNodeChildProvider_Factory(
      MembersInjector<PersonGeneralNodeChildProvider>
          personGeneralNodeChildProviderMembersInjector) {
    assert personGeneralNodeChildProviderMembersInjector != null;
    this.personGeneralNodeChildProviderMembersInjector =
        personGeneralNodeChildProviderMembersInjector;
  }

  @Override
  public PersonGeneralNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        personGeneralNodeChildProviderMembersInjector, new PersonGeneralNodeChildProvider());
  }

  public static Factory<PersonGeneralNodeChildProvider> create(
      MembersInjector<PersonGeneralNodeChildProvider>
          personGeneralNodeChildProviderMembersInjector) {
    return new PersonGeneralNodeChildProvider_Factory(
        personGeneralNodeChildProviderMembersInjector);
  }
}
