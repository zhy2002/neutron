package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonHomePhoneNodeRuleProvider_Factory
    implements Factory<PersonHomePhoneNodeRuleProvider> {
  private final MembersInjector<PersonHomePhoneNodeRuleProvider>
      personHomePhoneNodeRuleProviderMembersInjector;

  public PersonHomePhoneNodeRuleProvider_Factory(
      MembersInjector<PersonHomePhoneNodeRuleProvider>
          personHomePhoneNodeRuleProviderMembersInjector) {
    assert personHomePhoneNodeRuleProviderMembersInjector != null;
    this.personHomePhoneNodeRuleProviderMembersInjector =
        personHomePhoneNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonHomePhoneNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personHomePhoneNodeRuleProviderMembersInjector, new PersonHomePhoneNodeRuleProvider());
  }

  public static Factory<PersonHomePhoneNodeRuleProvider> create(
      MembersInjector<PersonHomePhoneNodeRuleProvider>
          personHomePhoneNodeRuleProviderMembersInjector) {
    return new PersonHomePhoneNodeRuleProvider_Factory(
        personHomePhoneNodeRuleProviderMembersInjector);
  }
}
