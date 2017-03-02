package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyTypeNodeRuleProvider_Factory
    implements Factory<PropertyTypeNodeRuleProvider> {
  private final MembersInjector<PropertyTypeNodeRuleProvider>
      propertyTypeNodeRuleProviderMembersInjector;

  public PropertyTypeNodeRuleProvider_Factory(
      MembersInjector<PropertyTypeNodeRuleProvider> propertyTypeNodeRuleProviderMembersInjector) {
    assert propertyTypeNodeRuleProviderMembersInjector != null;
    this.propertyTypeNodeRuleProviderMembersInjector = propertyTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyTypeNodeRuleProviderMembersInjector, new PropertyTypeNodeRuleProvider());
  }

  public static Factory<PropertyTypeNodeRuleProvider> create(
      MembersInjector<PropertyTypeNodeRuleProvider> propertyTypeNodeRuleProviderMembersInjector) {
    return new PropertyTypeNodeRuleProvider_Factory(propertyTypeNodeRuleProviderMembersInjector);
  }
}
