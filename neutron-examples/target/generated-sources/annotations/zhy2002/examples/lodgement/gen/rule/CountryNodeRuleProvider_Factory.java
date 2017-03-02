package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryNodeRuleProvider_Factory implements Factory<CountryNodeRuleProvider> {
  private final MembersInjector<CountryNodeRuleProvider> countryNodeRuleProviderMembersInjector;

  public CountryNodeRuleProvider_Factory(
      MembersInjector<CountryNodeRuleProvider> countryNodeRuleProviderMembersInjector) {
    assert countryNodeRuleProviderMembersInjector != null;
    this.countryNodeRuleProviderMembersInjector = countryNodeRuleProviderMembersInjector;
  }

  @Override
  public CountryNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        countryNodeRuleProviderMembersInjector, new CountryNodeRuleProvider());
  }

  public static Factory<CountryNodeRuleProvider> create(
      MembersInjector<CountryNodeRuleProvider> countryNodeRuleProviderMembersInjector) {
    return new CountryNodeRuleProvider_Factory(countryNodeRuleProviderMembersInjector);
  }
}
