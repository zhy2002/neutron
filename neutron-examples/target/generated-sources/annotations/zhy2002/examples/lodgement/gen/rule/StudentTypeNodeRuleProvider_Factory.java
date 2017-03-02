package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class StudentTypeNodeRuleProvider_Factory
    implements Factory<StudentTypeNodeRuleProvider> {
  private final MembersInjector<StudentTypeNodeRuleProvider>
      studentTypeNodeRuleProviderMembersInjector;

  public StudentTypeNodeRuleProvider_Factory(
      MembersInjector<StudentTypeNodeRuleProvider> studentTypeNodeRuleProviderMembersInjector) {
    assert studentTypeNodeRuleProviderMembersInjector != null;
    this.studentTypeNodeRuleProviderMembersInjector = studentTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public StudentTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        studentTypeNodeRuleProviderMembersInjector, new StudentTypeNodeRuleProvider());
  }

  public static Factory<StudentTypeNodeRuleProvider> create(
      MembersInjector<StudentTypeNodeRuleProvider> studentTypeNodeRuleProviderMembersInjector) {
    return new StudentTypeNodeRuleProvider_Factory(studentTypeNodeRuleProviderMembersInjector);
  }
}
