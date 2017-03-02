package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentFlagNodeRuleProvider_Factory
    implements Factory<StudentFlagNodeRuleProvider> {
  private final MembersInjector<StudentFlagNodeRuleProvider>
      studentFlagNodeRuleProviderMembersInjector;

  public StudentFlagNodeRuleProvider_Factory(
      MembersInjector<StudentFlagNodeRuleProvider> studentFlagNodeRuleProviderMembersInjector) {
    assert studentFlagNodeRuleProviderMembersInjector != null;
    this.studentFlagNodeRuleProviderMembersInjector = studentFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public StudentFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        studentFlagNodeRuleProviderMembersInjector, new StudentFlagNodeRuleProvider());
  }

  public static Factory<StudentFlagNodeRuleProvider> create(
      MembersInjector<StudentFlagNodeRuleProvider> studentFlagNodeRuleProviderMembersInjector) {
    return new StudentFlagNodeRuleProvider_Factory(studentFlagNodeRuleProviderMembersInjector);
  }
}
