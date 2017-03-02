package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessCompanyNameNodeRuleProvider_Factory
    implements Factory<AccessCompanyNameNodeRuleProvider> {
  private final MembersInjector<AccessCompanyNameNodeRuleProvider>
      accessCompanyNameNodeRuleProviderMembersInjector;

  public AccessCompanyNameNodeRuleProvider_Factory(
      MembersInjector<AccessCompanyNameNodeRuleProvider>
          accessCompanyNameNodeRuleProviderMembersInjector) {
    assert accessCompanyNameNodeRuleProviderMembersInjector != null;
    this.accessCompanyNameNodeRuleProviderMembersInjector =
        accessCompanyNameNodeRuleProviderMembersInjector;
  }

  @Override
  public AccessCompanyNameNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        accessCompanyNameNodeRuleProviderMembersInjector, new AccessCompanyNameNodeRuleProvider());
  }

  public static Factory<AccessCompanyNameNodeRuleProvider> create(
      MembersInjector<AccessCompanyNameNodeRuleProvider>
          accessCompanyNameNodeRuleProviderMembersInjector) {
    return new AccessCompanyNameNodeRuleProvider_Factory(
        accessCompanyNameNodeRuleProviderMembersInjector);
  }
}
