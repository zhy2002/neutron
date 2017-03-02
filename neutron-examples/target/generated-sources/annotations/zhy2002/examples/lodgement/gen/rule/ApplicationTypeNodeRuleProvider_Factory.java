package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTypeNodeRuleProvider_Factory
    implements Factory<ApplicationTypeNodeRuleProvider> {
  private final MembersInjector<ApplicationTypeNodeRuleProvider>
      applicationTypeNodeRuleProviderMembersInjector;

  public ApplicationTypeNodeRuleProvider_Factory(
      MembersInjector<ApplicationTypeNodeRuleProvider>
          applicationTypeNodeRuleProviderMembersInjector) {
    assert applicationTypeNodeRuleProviderMembersInjector != null;
    this.applicationTypeNodeRuleProviderMembersInjector =
        applicationTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public ApplicationTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        applicationTypeNodeRuleProviderMembersInjector, new ApplicationTypeNodeRuleProvider());
  }

  public static Factory<ApplicationTypeNodeRuleProvider> create(
      MembersInjector<ApplicationTypeNodeRuleProvider>
          applicationTypeNodeRuleProviderMembersInjector) {
    return new ApplicationTypeNodeRuleProvider_Factory(
        applicationTypeNodeRuleProviderMembersInjector);
  }
}
