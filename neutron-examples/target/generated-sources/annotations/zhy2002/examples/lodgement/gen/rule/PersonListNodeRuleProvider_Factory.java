package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonListNodeRuleProvider_Factory
    implements Factory<PersonListNodeRuleProvider> {
  private final MembersInjector<PersonListNodeRuleProvider>
      personListNodeRuleProviderMembersInjector;

  public PersonListNodeRuleProvider_Factory(
      MembersInjector<PersonListNodeRuleProvider> personListNodeRuleProviderMembersInjector) {
    assert personListNodeRuleProviderMembersInjector != null;
    this.personListNodeRuleProviderMembersInjector = personListNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personListNodeRuleProviderMembersInjector, new PersonListNodeRuleProvider());
  }

  public static Factory<PersonListNodeRuleProvider> create(
      MembersInjector<PersonListNodeRuleProvider> personListNodeRuleProviderMembersInjector) {
    return new PersonListNodeRuleProvider_Factory(personListNodeRuleProviderMembersInjector);
  }
}
