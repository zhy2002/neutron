package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RealEstateListNodeRuleProvider_Factory
    implements Factory<RealEstateListNodeRuleProvider> {
  private final MembersInjector<RealEstateListNodeRuleProvider>
      realEstateListNodeRuleProviderMembersInjector;

  public RealEstateListNodeRuleProvider_Factory(
      MembersInjector<RealEstateListNodeRuleProvider>
          realEstateListNodeRuleProviderMembersInjector) {
    assert realEstateListNodeRuleProviderMembersInjector != null;
    this.realEstateListNodeRuleProviderMembersInjector =
        realEstateListNodeRuleProviderMembersInjector;
  }

  @Override
  public RealEstateListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        realEstateListNodeRuleProviderMembersInjector, new RealEstateListNodeRuleProvider());
  }

  public static Factory<RealEstateListNodeRuleProvider> create(
      MembersInjector<RealEstateListNodeRuleProvider>
          realEstateListNodeRuleProviderMembersInjector) {
    return new RealEstateListNodeRuleProvider_Factory(
        realEstateListNodeRuleProviderMembersInjector);
  }
}
