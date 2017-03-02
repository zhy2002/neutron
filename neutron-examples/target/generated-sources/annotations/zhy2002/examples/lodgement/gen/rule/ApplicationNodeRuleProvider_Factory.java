package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationNodeRuleProvider_Factory
    implements Factory<ApplicationNodeRuleProvider> {
  private final MembersInjector<ApplicationNodeRuleProvider>
      applicationNodeRuleProviderMembersInjector;

  public ApplicationNodeRuleProvider_Factory(
      MembersInjector<ApplicationNodeRuleProvider> applicationNodeRuleProviderMembersInjector) {
    assert applicationNodeRuleProviderMembersInjector != null;
    this.applicationNodeRuleProviderMembersInjector = applicationNodeRuleProviderMembersInjector;
  }

  @Override
  public ApplicationNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        applicationNodeRuleProviderMembersInjector, new ApplicationNodeRuleProvider());
  }

  public static Factory<ApplicationNodeRuleProvider> create(
      MembersInjector<ApplicationNodeRuleProvider> applicationNodeRuleProviderMembersInjector) {
    return new ApplicationNodeRuleProvider_Factory(applicationNodeRuleProviderMembersInjector);
  }
}
