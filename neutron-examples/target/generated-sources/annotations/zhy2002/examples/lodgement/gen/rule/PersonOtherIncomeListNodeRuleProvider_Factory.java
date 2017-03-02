package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonOtherIncomeListNodeRuleProvider_Factory
    implements Factory<PersonOtherIncomeListNodeRuleProvider> {
  private final MembersInjector<PersonOtherIncomeListNodeRuleProvider>
      personOtherIncomeListNodeRuleProviderMembersInjector;

  public PersonOtherIncomeListNodeRuleProvider_Factory(
      MembersInjector<PersonOtherIncomeListNodeRuleProvider>
          personOtherIncomeListNodeRuleProviderMembersInjector) {
    assert personOtherIncomeListNodeRuleProviderMembersInjector != null;
    this.personOtherIncomeListNodeRuleProviderMembersInjector =
        personOtherIncomeListNodeRuleProviderMembersInjector;
  }

  @Override
  public PersonOtherIncomeListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        personOtherIncomeListNodeRuleProviderMembersInjector,
        new PersonOtherIncomeListNodeRuleProvider());
  }

  public static Factory<PersonOtherIncomeListNodeRuleProvider> create(
      MembersInjector<PersonOtherIncomeListNodeRuleProvider>
          personOtherIncomeListNodeRuleProviderMembersInjector) {
    return new PersonOtherIncomeListNodeRuleProvider_Factory(
        personOtherIncomeListNodeRuleProviderMembersInjector);
  }
}
