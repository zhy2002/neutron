package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AreaCodeNodeRuleProvider_Factory implements Factory<AreaCodeNodeRuleProvider> {
  private final MembersInjector<AreaCodeNodeRuleProvider> areaCodeNodeRuleProviderMembersInjector;

  public AreaCodeNodeRuleProvider_Factory(
      MembersInjector<AreaCodeNodeRuleProvider> areaCodeNodeRuleProviderMembersInjector) {
    assert areaCodeNodeRuleProviderMembersInjector != null;
    this.areaCodeNodeRuleProviderMembersInjector = areaCodeNodeRuleProviderMembersInjector;
  }

  @Override
  public AreaCodeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        areaCodeNodeRuleProviderMembersInjector, new AreaCodeNodeRuleProvider());
  }

  public static Factory<AreaCodeNodeRuleProvider> create(
      MembersInjector<AreaCodeNodeRuleProvider> areaCodeNodeRuleProviderMembersInjector) {
    return new AreaCodeNodeRuleProvider_Factory(areaCodeNodeRuleProviderMembersInjector);
  }
}
