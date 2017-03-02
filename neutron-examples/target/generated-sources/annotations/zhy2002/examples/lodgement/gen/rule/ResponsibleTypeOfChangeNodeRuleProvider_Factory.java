package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleTypeOfChangeNodeRuleProvider_Factory
    implements Factory<ResponsibleTypeOfChangeNodeRuleProvider> {
  private final MembersInjector<ResponsibleTypeOfChangeNodeRuleProvider>
      responsibleTypeOfChangeNodeRuleProviderMembersInjector;

  public ResponsibleTypeOfChangeNodeRuleProvider_Factory(
      MembersInjector<ResponsibleTypeOfChangeNodeRuleProvider>
          responsibleTypeOfChangeNodeRuleProviderMembersInjector) {
    assert responsibleTypeOfChangeNodeRuleProviderMembersInjector != null;
    this.responsibleTypeOfChangeNodeRuleProviderMembersInjector =
        responsibleTypeOfChangeNodeRuleProviderMembersInjector;
  }

  @Override
  public ResponsibleTypeOfChangeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        responsibleTypeOfChangeNodeRuleProviderMembersInjector,
        new ResponsibleTypeOfChangeNodeRuleProvider());
  }

  public static Factory<ResponsibleTypeOfChangeNodeRuleProvider> create(
      MembersInjector<ResponsibleTypeOfChangeNodeRuleProvider>
          responsibleTypeOfChangeNodeRuleProviderMembersInjector) {
    return new ResponsibleTypeOfChangeNodeRuleProvider_Factory(
        responsibleTypeOfChangeNodeRuleProviderMembersInjector);
  }
}
