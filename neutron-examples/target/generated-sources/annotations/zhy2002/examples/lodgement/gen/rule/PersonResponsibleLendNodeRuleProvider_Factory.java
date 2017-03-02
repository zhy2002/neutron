package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonResponsibleLendNodeRuleProvider_Factory
    implements Factory<PersonResponsibleLendNodeRuleProvider> {
  private final MembersInjector<PersonResponsibleLendNodeRuleProvider>
      personResponsibleLendNodeRuleProviderMembersInjector;

  public PersonResponsibleLendNodeRuleProvider_Factory(
      MembersInjector<PersonResponsibleLendNodeRuleProvider>
          personResponsibleLendNodeRuleProviderMembersInjector) {
    assert personResponsibleLendNodeRuleProviderMembersInjector != null;
    this.personResponsibleLendNodeRuleProviderMembersInjector =
        personResponsibleLendNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonResponsibleLendNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personResponsibleLendNodeRuleProviderMembersInjector,
        new PersonResponsibleLendNodeRuleProvider());
  }

  public static Factory<PersonResponsibleLendNodeRuleProvider> create(
      MembersInjector<PersonResponsibleLendNodeRuleProvider>
          personResponsibleLendNodeRuleProviderMembersInjector) {
    return new PersonResponsibleLendNodeRuleProvider_Factory(
        personResponsibleLendNodeRuleProviderMembersInjector);
  }
}
