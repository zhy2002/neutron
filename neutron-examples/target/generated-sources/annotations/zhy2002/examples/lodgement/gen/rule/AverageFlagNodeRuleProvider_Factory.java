package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AverageFlagNodeRuleProvider_Factory
    implements Factory<AverageFlagNodeRuleProvider> {
  private final MembersInjector<AverageFlagNodeRuleProvider>
      averageFlagNodeRuleProviderMembersInjector;

  public AverageFlagNodeRuleProvider_Factory(
      MembersInjector<AverageFlagNodeRuleProvider> averageFlagNodeRuleProviderMembersInjector) {
    assert averageFlagNodeRuleProviderMembersInjector != null;
    this.averageFlagNodeRuleProviderMembersInjector = averageFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public AverageFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        averageFlagNodeRuleProviderMembersInjector, new AverageFlagNodeRuleProvider());
  }

  public static Factory<AverageFlagNodeRuleProvider> create(
      MembersInjector<AverageFlagNodeRuleProvider> averageFlagNodeRuleProviderMembersInjector) {
    return new AverageFlagNodeRuleProvider_Factory(averageFlagNodeRuleProviderMembersInjector);
  }
}
