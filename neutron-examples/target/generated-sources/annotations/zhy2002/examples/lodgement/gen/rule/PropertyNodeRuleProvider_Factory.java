package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PropertyNodeRuleProvider_Factory implements Factory<PropertyNodeRuleProvider> {
  private final MembersInjector<PropertyNodeRuleProvider> propertyNodeRuleProviderMembersInjector;

  public PropertyNodeRuleProvider_Factory(
      MembersInjector<PropertyNodeRuleProvider> propertyNodeRuleProviderMembersInjector) {
    assert propertyNodeRuleProviderMembersInjector != null;
    this.propertyNodeRuleProviderMembersInjector = propertyNodeRuleProviderMembersInjector;
  }

  @Override
  public PropertyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        propertyNodeRuleProviderMembersInjector, new PropertyNodeRuleProvider());
  }

  public static Factory<PropertyNodeRuleProvider> create(
      MembersInjector<PropertyNodeRuleProvider> propertyNodeRuleProviderMembersInjector) {
    return new PropertyNodeRuleProvider_Factory(propertyNodeRuleProviderMembersInjector);
  }
}
