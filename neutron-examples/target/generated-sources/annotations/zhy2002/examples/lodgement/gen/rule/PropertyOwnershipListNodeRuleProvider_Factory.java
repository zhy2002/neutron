package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyOwnershipListNodeRuleProvider_Factory
    implements Factory<PropertyOwnershipListNodeRuleProvider> {
  private final MembersInjector<PropertyOwnershipListNodeRuleProvider>
      propertyOwnershipListNodeRuleProviderMembersInjector;

  public PropertyOwnershipListNodeRuleProvider_Factory(
      MembersInjector<PropertyOwnershipListNodeRuleProvider>
          propertyOwnershipListNodeRuleProviderMembersInjector) {
    assert propertyOwnershipListNodeRuleProviderMembersInjector != null;
    this.propertyOwnershipListNodeRuleProviderMembersInjector =
        propertyOwnershipListNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyOwnershipListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyOwnershipListNodeRuleProviderMembersInjector,
        new PropertyOwnershipListNodeRuleProvider());
  }

  public static Factory<PropertyOwnershipListNodeRuleProvider> create(
      MembersInjector<PropertyOwnershipListNodeRuleProvider>
          propertyOwnershipListNodeRuleProviderMembersInjector) {
    return new PropertyOwnershipListNodeRuleProvider_Factory(
        propertyOwnershipListNodeRuleProviderMembersInjector);
  }
}
