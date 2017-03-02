package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HouseDutiesFlagNodeRuleProvider_Factory
    implements Factory<HouseDutiesFlagNodeRuleProvider> {
  private final MembersInjector<HouseDutiesFlagNodeRuleProvider>
      houseDutiesFlagNodeRuleProviderMembersInjector;

  public HouseDutiesFlagNodeRuleProvider_Factory(
      MembersInjector<HouseDutiesFlagNodeRuleProvider>
          houseDutiesFlagNodeRuleProviderMembersInjector) {
    assert houseDutiesFlagNodeRuleProviderMembersInjector != null;
    this.houseDutiesFlagNodeRuleProviderMembersInjector =
        houseDutiesFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public HouseDutiesFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        houseDutiesFlagNodeRuleProviderMembersInjector, new HouseDutiesFlagNodeRuleProvider());
  }

  public static Factory<HouseDutiesFlagNodeRuleProvider> create(
      MembersInjector<HouseDutiesFlagNodeRuleProvider>
          houseDutiesFlagNodeRuleProviderMembersInjector) {
    return new HouseDutiesFlagNodeRuleProvider_Factory(
        houseDutiesFlagNodeRuleProviderMembersInjector);
  }
}
