package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyDetailsNodeRuleProvider_Factory
    implements Factory<PropertyDetailsNodeRuleProvider> {
  private final MembersInjector<PropertyDetailsNodeRuleProvider>
      propertyDetailsNodeRuleProviderMembersInjector;

  public PropertyDetailsNodeRuleProvider_Factory(
      MembersInjector<PropertyDetailsNodeRuleProvider>
          propertyDetailsNodeRuleProviderMembersInjector) {
    assert propertyDetailsNodeRuleProviderMembersInjector != null;
    this.propertyDetailsNodeRuleProviderMembersInjector =
        propertyDetailsNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyDetailsNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyDetailsNodeRuleProviderMembersInjector, new PropertyDetailsNodeRuleProvider());
  }

  public static Factory<PropertyDetailsNodeRuleProvider> create(
      MembersInjector<PropertyDetailsNodeRuleProvider>
          propertyDetailsNodeRuleProviderMembersInjector) {
    return new PropertyDetailsNodeRuleProvider_Factory(
        propertyDetailsNodeRuleProviderMembersInjector);
  }
}
