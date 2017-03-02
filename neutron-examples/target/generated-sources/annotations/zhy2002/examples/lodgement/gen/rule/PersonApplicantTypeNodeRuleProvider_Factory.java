package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonApplicantTypeNodeRuleProvider_Factory
    implements Factory<PersonApplicantTypeNodeRuleProvider> {
  private final MembersInjector<PersonApplicantTypeNodeRuleProvider>
      personApplicantTypeNodeRuleProviderMembersInjector;

  public PersonApplicantTypeNodeRuleProvider_Factory(
      MembersInjector<PersonApplicantTypeNodeRuleProvider>
          personApplicantTypeNodeRuleProviderMembersInjector) {
    assert personApplicantTypeNodeRuleProviderMembersInjector != null;
    this.personApplicantTypeNodeRuleProviderMembersInjector =
        personApplicantTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonApplicantTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personApplicantTypeNodeRuleProviderMembersInjector,
        new PersonApplicantTypeNodeRuleProvider());
  }

  public static Factory<PersonApplicantTypeNodeRuleProvider> create(
      MembersInjector<PersonApplicantTypeNodeRuleProvider>
          personApplicantTypeNodeRuleProviderMembersInjector) {
    return new PersonApplicantTypeNodeRuleProvider_Factory(
        personApplicantTypeNodeRuleProviderMembersInjector);
  }
}
