package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CountryCodeNodeRuleProvider_Factory
    implements Factory<CountryCodeNodeRuleProvider> {
  private final MembersInjector<CountryCodeNodeRuleProvider>
      countryCodeNodeRuleProviderMembersInjector;

  public CountryCodeNodeRuleProvider_Factory(
      MembersInjector<CountryCodeNodeRuleProvider> countryCodeNodeRuleProviderMembersInjector) {
    assert countryCodeNodeRuleProviderMembersInjector != null;
    this.countryCodeNodeRuleProviderMembersInjector = countryCodeNodeRuleProviderMembersInjector;
  }

  @Override
  public CountryCodeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        countryCodeNodeRuleProviderMembersInjector, new CountryCodeNodeRuleProvider());
  }

  public static Factory<CountryCodeNodeRuleProvider> create(
      MembersInjector<CountryCodeNodeRuleProvider> countryCodeNodeRuleProviderMembersInjector) {
    return new CountryCodeNodeRuleProvider_Factory(countryCodeNodeRuleProviderMembersInjector);
  }
}
