package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonTrustNodeRuleProvider_Factory
    implements Factory<PersonTrustNodeRuleProvider> {
  private final MembersInjector<PersonTrustNodeRuleProvider>
      personTrustNodeRuleProviderMembersInjector;

  public PersonTrustNodeRuleProvider_Factory(
      MembersInjector<PersonTrustNodeRuleProvider> personTrustNodeRuleProviderMembersInjector) {
    assert personTrustNodeRuleProviderMembersInjector != null;
    this.personTrustNodeRuleProviderMembersInjector = personTrustNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonTrustNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personTrustNodeRuleProviderMembersInjector, new PersonTrustNodeRuleProvider());
  }

  public static Factory<PersonTrustNodeRuleProvider> create(
      MembersInjector<PersonTrustNodeRuleProvider> personTrustNodeRuleProviderMembersInjector) {
    return new PersonTrustNodeRuleProvider_Factory(personTrustNodeRuleProviderMembersInjector);
  }
}
