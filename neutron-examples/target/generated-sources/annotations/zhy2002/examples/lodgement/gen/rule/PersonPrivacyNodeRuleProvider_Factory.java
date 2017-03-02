package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonPrivacyNodeRuleProvider_Factory
    implements Factory<PersonPrivacyNodeRuleProvider> {
  private final MembersInjector<PersonPrivacyNodeRuleProvider>
      personPrivacyNodeRuleProviderMembersInjector;

  public PersonPrivacyNodeRuleProvider_Factory(
      MembersInjector<PersonPrivacyNodeRuleProvider> personPrivacyNodeRuleProviderMembersInjector) {
    assert personPrivacyNodeRuleProviderMembersInjector != null;
    this.personPrivacyNodeRuleProviderMembersInjector =
        personPrivacyNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonPrivacyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personPrivacyNodeRuleProviderMembersInjector, new PersonPrivacyNodeRuleProvider());
  }

  public static Factory<PersonPrivacyNodeRuleProvider> create(
      MembersInjector<PersonPrivacyNodeRuleProvider> personPrivacyNodeRuleProviderMembersInjector) {
    return new PersonPrivacyNodeRuleProvider_Factory(personPrivacyNodeRuleProviderMembersInjector);
  }
}
