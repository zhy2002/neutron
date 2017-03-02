package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HousingStatusNodeRuleProvider_Factory
    implements Factory<HousingStatusNodeRuleProvider> {
  private final MembersInjector<HousingStatusNodeRuleProvider>
      housingStatusNodeRuleProviderMembersInjector;

  public HousingStatusNodeRuleProvider_Factory(
      MembersInjector<HousingStatusNodeRuleProvider> housingStatusNodeRuleProviderMembersInjector) {
    assert housingStatusNodeRuleProviderMembersInjector != null;
    this.housingStatusNodeRuleProviderMembersInjector =
        housingStatusNodeRuleProviderMembersInjector;
  }

  @Override
  public HousingStatusNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        housingStatusNodeRuleProviderMembersInjector, new HousingStatusNodeRuleProvider());
  }

  public static Factory<HousingStatusNodeRuleProvider> create(
      MembersInjector<HousingStatusNodeRuleProvider> housingStatusNodeRuleProviderMembersInjector) {
    return new HousingStatusNodeRuleProvider_Factory(housingStatusNodeRuleProviderMembersInjector);
  }
}
