package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyPurseNodeRuleProvider_Factory
    implements Factory<PropertyPurseNodeRuleProvider> {
  private final MembersInjector<PropertyPurseNodeRuleProvider>
      propertyPurseNodeRuleProviderMembersInjector;

  public PropertyPurseNodeRuleProvider_Factory(
      MembersInjector<PropertyPurseNodeRuleProvider> propertyPurseNodeRuleProviderMembersInjector) {
    assert propertyPurseNodeRuleProviderMembersInjector != null;
    this.propertyPurseNodeRuleProviderMembersInjector =
        propertyPurseNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyPurseNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyPurseNodeRuleProviderMembersInjector, new PropertyPurseNodeRuleProvider());
  }

  public static Factory<PropertyPurseNodeRuleProvider> create(
      MembersInjector<PropertyPurseNodeRuleProvider> propertyPurseNodeRuleProviderMembersInjector) {
    return new PropertyPurseNodeRuleProvider_Factory(propertyPurseNodeRuleProviderMembersInjector);
  }
}
