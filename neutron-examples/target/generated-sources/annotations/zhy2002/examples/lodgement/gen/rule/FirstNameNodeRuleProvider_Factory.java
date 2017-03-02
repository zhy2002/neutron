package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstNameNodeRuleProvider_Factory implements Factory<FirstNameNodeRuleProvider> {
  private final MembersInjector<FirstNameNodeRuleProvider> firstNameNodeRuleProviderMembersInjector;

  public FirstNameNodeRuleProvider_Factory(
      MembersInjector<FirstNameNodeRuleProvider> firstNameNodeRuleProviderMembersInjector) {
    assert firstNameNodeRuleProviderMembersInjector != null;
    this.firstNameNodeRuleProviderMembersInjector = firstNameNodeRuleProviderMembersInjector;
  }

  @Override
  public FirstNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        firstNameNodeRuleProviderMembersInjector, new FirstNameNodeRuleProvider());
  }

  public static Factory<FirstNameNodeRuleProvider> create(
      MembersInjector<FirstNameNodeRuleProvider> firstNameNodeRuleProviderMembersInjector) {
    return new FirstNameNodeRuleProvider_Factory(firstNameNodeRuleProviderMembersInjector);
  }
}
