package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DateOfBirthNodeRuleProvider_Factory
    implements Factory<DateOfBirthNodeRuleProvider> {
  private final MembersInjector<DateOfBirthNodeRuleProvider>
      dateOfBirthNodeRuleProviderMembersInjector;

  public DateOfBirthNodeRuleProvider_Factory(
      MembersInjector<DateOfBirthNodeRuleProvider> dateOfBirthNodeRuleProviderMembersInjector) {
    assert dateOfBirthNodeRuleProviderMembersInjector != null;
    this.dateOfBirthNodeRuleProviderMembersInjector = dateOfBirthNodeRuleProviderMembersInjector;
  }

  @Override
  public DateOfBirthNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        dateOfBirthNodeRuleProviderMembersInjector, new DateOfBirthNodeRuleProvider());
  }

  public static Factory<DateOfBirthNodeRuleProvider> create(
      MembersInjector<DateOfBirthNodeRuleProvider> dateOfBirthNodeRuleProviderMembersInjector) {
    return new DateOfBirthNodeRuleProvider_Factory(dateOfBirthNodeRuleProviderMembersInjector);
  }
}
