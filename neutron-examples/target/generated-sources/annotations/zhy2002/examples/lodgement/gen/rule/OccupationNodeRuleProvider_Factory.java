package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OccupationNodeRuleProvider_Factory
    implements Factory<OccupationNodeRuleProvider> {
  private final MembersInjector<OccupationNodeRuleProvider>
      occupationNodeRuleProviderMembersInjector;

  public OccupationNodeRuleProvider_Factory(
      MembersInjector<OccupationNodeRuleProvider> occupationNodeRuleProviderMembersInjector) {
    assert occupationNodeRuleProviderMembersInjector != null;
    this.occupationNodeRuleProviderMembersInjector = occupationNodeRuleProviderMembersInjector;
  }

  @Override
  public OccupationNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        occupationNodeRuleProviderMembersInjector, new OccupationNodeRuleProvider());
  }

  public static Factory<OccupationNodeRuleProvider> create(
      MembersInjector<OccupationNodeRuleProvider> occupationNodeRuleProviderMembersInjector) {
    return new OccupationNodeRuleProvider_Factory(occupationNodeRuleProviderMembersInjector);
  }
}
