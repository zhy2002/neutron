package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyStateNodeRuleProvider_Factory
    implements Factory<PropertyStateNodeRuleProvider> {
  private final MembersInjector<PropertyStateNodeRuleProvider>
      propertyStateNodeRuleProviderMembersInjector;

  public PropertyStateNodeRuleProvider_Factory(
      MembersInjector<PropertyStateNodeRuleProvider> propertyStateNodeRuleProviderMembersInjector) {
    assert propertyStateNodeRuleProviderMembersInjector != null;
    this.propertyStateNodeRuleProviderMembersInjector =
        propertyStateNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyStateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyStateNodeRuleProviderMembersInjector, new PropertyStateNodeRuleProvider());
  }

  public static Factory<PropertyStateNodeRuleProvider> create(
      MembersInjector<PropertyStateNodeRuleProvider> propertyStateNodeRuleProviderMembersInjector) {
    return new PropertyStateNodeRuleProvider_Factory(propertyStateNodeRuleProviderMembersInjector);
  }
}
