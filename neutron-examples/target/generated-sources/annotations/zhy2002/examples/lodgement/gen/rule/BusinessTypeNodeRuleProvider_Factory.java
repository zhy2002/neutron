package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BusinessTypeNodeRuleProvider_Factory
    implements Factory<BusinessTypeNodeRuleProvider> {
  private final MembersInjector<BusinessTypeNodeRuleProvider>
      businessTypeNodeRuleProviderMembersInjector;

  public BusinessTypeNodeRuleProvider_Factory(
      MembersInjector<BusinessTypeNodeRuleProvider> businessTypeNodeRuleProviderMembersInjector) {
    assert businessTypeNodeRuleProviderMembersInjector != null;
    this.businessTypeNodeRuleProviderMembersInjector = businessTypeNodeRuleProviderMembersInjector;
  }

  @Override
  public BusinessTypeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        businessTypeNodeRuleProviderMembersInjector, new BusinessTypeNodeRuleProvider());
  }

  public static Factory<BusinessTypeNodeRuleProvider> create(
      MembersInjector<BusinessTypeNodeRuleProvider> businessTypeNodeRuleProviderMembersInjector) {
    return new BusinessTypeNodeRuleProvider_Factory(businessTypeNodeRuleProviderMembersInjector);
  }
}
