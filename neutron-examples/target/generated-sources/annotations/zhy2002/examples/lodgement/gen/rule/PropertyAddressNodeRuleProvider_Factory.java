package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyAddressNodeRuleProvider_Factory
    implements Factory<PropertyAddressNodeRuleProvider> {
  private final MembersInjector<PropertyAddressNodeRuleProvider>
      propertyAddressNodeRuleProviderMembersInjector;

  public PropertyAddressNodeRuleProvider_Factory(
      MembersInjector<PropertyAddressNodeRuleProvider>
          propertyAddressNodeRuleProviderMembersInjector) {
    assert propertyAddressNodeRuleProviderMembersInjector != null;
    this.propertyAddressNodeRuleProviderMembersInjector =
        propertyAddressNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyAddressNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyAddressNodeRuleProviderMembersInjector, new PropertyAddressNodeRuleProvider());
  }

  public static Factory<PropertyAddressNodeRuleProvider> create(
      MembersInjector<PropertyAddressNodeRuleProvider>
          propertyAddressNodeRuleProviderMembersInjector) {
    return new PropertyAddressNodeRuleProvider_Factory(
        propertyAddressNodeRuleProviderMembersInjector);
  }
}
