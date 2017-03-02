package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DefenseServiceFlagNodeRuleProvider_Factory
    implements Factory<DefenseServiceFlagNodeRuleProvider> {
  private final MembersInjector<DefenseServiceFlagNodeRuleProvider>
      defenseServiceFlagNodeRuleProviderMembersInjector;

  public DefenseServiceFlagNodeRuleProvider_Factory(
      MembersInjector<DefenseServiceFlagNodeRuleProvider>
          defenseServiceFlagNodeRuleProviderMembersInjector) {
    assert defenseServiceFlagNodeRuleProviderMembersInjector != null;
    this.defenseServiceFlagNodeRuleProviderMembersInjector =
        defenseServiceFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public DefenseServiceFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        defenseServiceFlagNodeRuleProviderMembersInjector,
        new DefenseServiceFlagNodeRuleProvider());
  }

  public static Factory<DefenseServiceFlagNodeRuleProvider> create(
      MembersInjector<DefenseServiceFlagNodeRuleProvider>
          defenseServiceFlagNodeRuleProviderMembersInjector) {
    return new DefenseServiceFlagNodeRuleProvider_Factory(
        defenseServiceFlagNodeRuleProviderMembersInjector);
  }
}
