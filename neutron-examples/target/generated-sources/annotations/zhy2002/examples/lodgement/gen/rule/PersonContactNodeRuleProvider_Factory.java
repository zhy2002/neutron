package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonContactNodeRuleProvider_Factory
    implements Factory<PersonContactNodeRuleProvider> {
  private final MembersInjector<PersonContactNodeRuleProvider>
      personContactNodeRuleProviderMembersInjector;

  public PersonContactNodeRuleProvider_Factory(
      MembersInjector<PersonContactNodeRuleProvider> personContactNodeRuleProviderMembersInjector) {
    assert personContactNodeRuleProviderMembersInjector != null;
    this.personContactNodeRuleProviderMembersInjector =
        personContactNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonContactNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personContactNodeRuleProviderMembersInjector, new PersonContactNodeRuleProvider());
  }

  public static Factory<PersonContactNodeRuleProvider> create(
      MembersInjector<PersonContactNodeRuleProvider> personContactNodeRuleProviderMembersInjector) {
    return new PersonContactNodeRuleProvider_Factory(personContactNodeRuleProviderMembersInjector);
  }
}
