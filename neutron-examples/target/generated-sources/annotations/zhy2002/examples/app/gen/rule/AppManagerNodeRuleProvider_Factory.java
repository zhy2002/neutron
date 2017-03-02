package zhy2002.examples.app.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppManagerNodeRuleProvider_Factory
    implements Factory<AppManagerNodeRuleProvider> {
  private final MembersInjector<AppManagerNodeRuleProvider>
      appManagerNodeRuleProviderMembersInjector;

  public AppManagerNodeRuleProvider_Factory(
      MembersInjector<AppManagerNodeRuleProvider> appManagerNodeRuleProviderMembersInjector) {
    assert appManagerNodeRuleProviderMembersInjector != null;
    this.appManagerNodeRuleProviderMembersInjector = appManagerNodeRuleProviderMembersInjector;
  }

  @Override
  public AppManagerNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        appManagerNodeRuleProviderMembersInjector, new AppManagerNodeRuleProvider());
  }

  public static Factory<AppManagerNodeRuleProvider> create(
      MembersInjector<AppManagerNodeRuleProvider> appManagerNodeRuleProviderMembersInjector) {
    return new AppManagerNodeRuleProvider_Factory(appManagerNodeRuleProviderMembersInjector);
  }
}
