package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonGeneralNodeRuleProvider_Factory
    implements Factory<PersonGeneralNodeRuleProvider> {
  private final MembersInjector<PersonGeneralNodeRuleProvider>
      personGeneralNodeRuleProviderMembersInjector;

  public PersonGeneralNodeRuleProvider_Factory(
      MembersInjector<PersonGeneralNodeRuleProvider> personGeneralNodeRuleProviderMembersInjector) {
    assert personGeneralNodeRuleProviderMembersInjector != null;
    this.personGeneralNodeRuleProviderMembersInjector =
        personGeneralNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonGeneralNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personGeneralNodeRuleProviderMembersInjector, new PersonGeneralNodeRuleProvider());
  }

  public static Factory<PersonGeneralNodeRuleProvider> create(
      MembersInjector<PersonGeneralNodeRuleProvider> personGeneralNodeRuleProviderMembersInjector) {
    return new PersonGeneralNodeRuleProvider_Factory(personGeneralNodeRuleProviderMembersInjector);
  }
}
