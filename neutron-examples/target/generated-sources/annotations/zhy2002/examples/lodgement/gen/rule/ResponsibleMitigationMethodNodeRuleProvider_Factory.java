package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleMitigationMethodNodeRuleProvider_Factory
    implements Factory<ResponsibleMitigationMethodNodeRuleProvider> {
  private final MembersInjector<ResponsibleMitigationMethodNodeRuleProvider>
      responsibleMitigationMethodNodeRuleProviderMembersInjector;

  public ResponsibleMitigationMethodNodeRuleProvider_Factory(
      MembersInjector<ResponsibleMitigationMethodNodeRuleProvider>
          responsibleMitigationMethodNodeRuleProviderMembersInjector) {
    assert responsibleMitigationMethodNodeRuleProviderMembersInjector != null;
    this.responsibleMitigationMethodNodeRuleProviderMembersInjector =
        responsibleMitigationMethodNodeRuleProviderMembersInjector;
  }

  @Override
  public ResponsibleMitigationMethodNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        responsibleMitigationMethodNodeRuleProviderMembersInjector,
        new ResponsibleMitigationMethodNodeRuleProvider());
  }

  public static Factory<ResponsibleMitigationMethodNodeRuleProvider> create(
      MembersInjector<ResponsibleMitigationMethodNodeRuleProvider>
          responsibleMitigationMethodNodeRuleProviderMembersInjector) {
    return new ResponsibleMitigationMethodNodeRuleProvider_Factory(
        responsibleMitigationMethodNodeRuleProviderMembersInjector);
  }
}
