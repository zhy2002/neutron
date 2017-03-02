package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeRuleProvider_Factory implements Factory<PersonNodeRuleProvider> {
  private final MembersInjector<PersonNodeRuleProvider> personNodeRuleProviderMembersInjector;

  public PersonNodeRuleProvider_Factory(
      MembersInjector<PersonNodeRuleProvider> personNodeRuleProviderMembersInjector) {
    assert personNodeRuleProviderMembersInjector != null;
    this.personNodeRuleProviderMembersInjector = personNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personNodeRuleProviderMembersInjector, new PersonNodeRuleProvider());
  }

  public static Factory<PersonNodeRuleProvider> create(
      MembersInjector<PersonNodeRuleProvider> personNodeRuleProviderMembersInjector) {
    return new PersonNodeRuleProvider_Factory(personNodeRuleProviderMembersInjector);
  }
}
