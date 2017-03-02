package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertySubTypeNodeRuleProvider_Factory
    implements Factory<PropertySubTypeNodeRuleProvider> {
  private final MembersInjector<PropertySubTypeNodeRuleProvider>
      propertySubTypeNodeRuleProviderMembersInjector;

  public PropertySubTypeNodeRuleProvider_Factory(
      MembersInjector<PropertySubTypeNodeRuleProvider>
          propertySubTypeNodeRuleProviderMembersInjector) {
    assert propertySubTypeNodeRuleProviderMembersInjector != null;
    this.propertySubTypeNodeRuleProviderMembersInjector =
        propertySubTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertySubTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertySubTypeNodeRuleProviderMembersInjector, new PropertySubTypeNodeRuleProvider());
  }

  public static Factory<PropertySubTypeNodeRuleProvider> create(
      MembersInjector<PropertySubTypeNodeRuleProvider>
          propertySubTypeNodeRuleProviderMembersInjector) {
    return new PropertySubTypeNodeRuleProvider_Factory(
        propertySubTypeNodeRuleProviderMembersInjector);
  }
}
