package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsedAsSecurityFlagNodeRuleProvider_Factory
    implements Factory<UsedAsSecurityFlagNodeRuleProvider> {
  private final MembersInjector<UsedAsSecurityFlagNodeRuleProvider>
      usedAsSecurityFlagNodeRuleProviderMembersInjector;

  public UsedAsSecurityFlagNodeRuleProvider_Factory(
      MembersInjector<UsedAsSecurityFlagNodeRuleProvider>
          usedAsSecurityFlagNodeRuleProviderMembersInjector) {
    assert usedAsSecurityFlagNodeRuleProviderMembersInjector != null;
    this.usedAsSecurityFlagNodeRuleProviderMembersInjector =
        usedAsSecurityFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public UsedAsSecurityFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        usedAsSecurityFlagNodeRuleProviderMembersInjector,
        new UsedAsSecurityFlagNodeRuleProvider());
  }

  public static Factory<UsedAsSecurityFlagNodeRuleProvider> create(
      MembersInjector<UsedAsSecurityFlagNodeRuleProvider>
          usedAsSecurityFlagNodeRuleProviderMembersInjector) {
    return new UsedAsSecurityFlagNodeRuleProvider_Factory(
        usedAsSecurityFlagNodeRuleProviderMembersInjector);
  }
}
