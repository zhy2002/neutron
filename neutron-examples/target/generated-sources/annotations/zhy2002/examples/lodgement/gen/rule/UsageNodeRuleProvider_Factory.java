package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsageNodeRuleProvider_Factory implements Factory<UsageNodeRuleProvider> {
  private final MembersInjector<UsageNodeRuleProvider> usageNodeRuleProviderMembersInjector;

  public UsageNodeRuleProvider_Factory(
      MembersInjector<UsageNodeRuleProvider> usageNodeRuleProviderMembersInjector) {
    assert usageNodeRuleProviderMembersInjector != null;
    this.usageNodeRuleProviderMembersInjector = usageNodeRuleProviderMembersInjector;
  }

  @Override
  public UsageNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        usageNodeRuleProviderMembersInjector, new UsageNodeRuleProvider());
  }

  public static Factory<UsageNodeRuleProvider> create(
      MembersInjector<UsageNodeRuleProvider> usageNodeRuleProviderMembersInjector) {
    return new UsageNodeRuleProvider_Factory(usageNodeRuleProviderMembersInjector);
  }
}
