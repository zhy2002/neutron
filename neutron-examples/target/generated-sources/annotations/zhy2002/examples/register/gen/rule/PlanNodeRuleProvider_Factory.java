package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PlanNodeRuleProvider_Factory implements Factory<PlanNodeRuleProvider> {
  private final MembersInjector<PlanNodeRuleProvider> planNodeRuleProviderMembersInjector;

  public PlanNodeRuleProvider_Factory(
      MembersInjector<PlanNodeRuleProvider> planNodeRuleProviderMembersInjector) {
    assert planNodeRuleProviderMembersInjector != null;
    this.planNodeRuleProviderMembersInjector = planNodeRuleProviderMembersInjector;
  }

  @Override
  public PlanNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        planNodeRuleProviderMembersInjector, new PlanNodeRuleProvider());
  }

  public static Factory<PlanNodeRuleProvider> create(
      MembersInjector<PlanNodeRuleProvider> planNodeRuleProviderMembersInjector) {
    return new PlanNodeRuleProvider_Factory(planNodeRuleProviderMembersInjector);
  }
}
