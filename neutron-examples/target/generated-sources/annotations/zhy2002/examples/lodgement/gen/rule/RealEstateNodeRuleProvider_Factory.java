package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateNodeRuleProvider_Factory
    implements Factory<RealEstateNodeRuleProvider> {
  private final MembersInjector<RealEstateNodeRuleProvider>
      realEstateNodeRuleProviderMembersInjector;

  public RealEstateNodeRuleProvider_Factory(
      MembersInjector<RealEstateNodeRuleProvider> realEstateNodeRuleProviderMembersInjector) {
    assert realEstateNodeRuleProviderMembersInjector != null;
    this.realEstateNodeRuleProviderMembersInjector = realEstateNodeRuleProviderMembersInjector;
  }

  @Override
  public RealEstateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        realEstateNodeRuleProviderMembersInjector, new RealEstateNodeRuleProvider());
  }

  public static Factory<RealEstateNodeRuleProvider> create(
      MembersInjector<RealEstateNodeRuleProvider> realEstateNodeRuleProviderMembersInjector) {
    return new RealEstateNodeRuleProvider_Factory(realEstateNodeRuleProviderMembersInjector);
  }
}
