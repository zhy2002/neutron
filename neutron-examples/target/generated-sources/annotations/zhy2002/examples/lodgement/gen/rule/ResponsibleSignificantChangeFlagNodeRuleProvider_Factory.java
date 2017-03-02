package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleSignificantChangeFlagNodeRuleProvider_Factory
    implements Factory<ResponsibleSignificantChangeFlagNodeRuleProvider> {
  private final MembersInjector<ResponsibleSignificantChangeFlagNodeRuleProvider>
      responsibleSignificantChangeFlagNodeRuleProviderMembersInjector;

  public ResponsibleSignificantChangeFlagNodeRuleProvider_Factory(
      MembersInjector<ResponsibleSignificantChangeFlagNodeRuleProvider>
          responsibleSignificantChangeFlagNodeRuleProviderMembersInjector) {
    assert responsibleSignificantChangeFlagNodeRuleProviderMembersInjector != null;
    this.responsibleSignificantChangeFlagNodeRuleProviderMembersInjector =
        responsibleSignificantChangeFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public ResponsibleSignificantChangeFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        responsibleSignificantChangeFlagNodeRuleProviderMembersInjector,
        new ResponsibleSignificantChangeFlagNodeRuleProvider());
  }

  public static Factory<ResponsibleSignificantChangeFlagNodeRuleProvider> create(
      MembersInjector<ResponsibleSignificantChangeFlagNodeRuleProvider>
          responsibleSignificantChangeFlagNodeRuleProviderMembersInjector) {
    return new ResponsibleSignificantChangeFlagNodeRuleProvider_Factory(
        responsibleSignificantChangeFlagNodeRuleProviderMembersInjector);
  }
}
