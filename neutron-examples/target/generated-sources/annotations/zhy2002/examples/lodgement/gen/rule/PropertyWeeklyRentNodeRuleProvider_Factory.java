package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyWeeklyRentNodeRuleProvider_Factory
    implements Factory<PropertyWeeklyRentNodeRuleProvider> {
  private final MembersInjector<PropertyWeeklyRentNodeRuleProvider>
      propertyWeeklyRentNodeRuleProviderMembersInjector;

  public PropertyWeeklyRentNodeRuleProvider_Factory(
      MembersInjector<PropertyWeeklyRentNodeRuleProvider>
          propertyWeeklyRentNodeRuleProviderMembersInjector) {
    assert propertyWeeklyRentNodeRuleProviderMembersInjector != null;
    this.propertyWeeklyRentNodeRuleProviderMembersInjector =
        propertyWeeklyRentNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyWeeklyRentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyWeeklyRentNodeRuleProviderMembersInjector,
        new PropertyWeeklyRentNodeRuleProvider());
  }

  public static Factory<PropertyWeeklyRentNodeRuleProvider> create(
      MembersInjector<PropertyWeeklyRentNodeRuleProvider>
          propertyWeeklyRentNodeRuleProviderMembersInjector) {
    return new PropertyWeeklyRentNodeRuleProvider_Factory(
        propertyWeeklyRentNodeRuleProviderMembersInjector);
  }
}
