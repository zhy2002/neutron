package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MaritalStatusNodeRuleProvider_Factory
    implements Factory<MaritalStatusNodeRuleProvider> {
  private final MembersInjector<MaritalStatusNodeRuleProvider>
      maritalStatusNodeRuleProviderMembersInjector;

  public MaritalStatusNodeRuleProvider_Factory(
      MembersInjector<MaritalStatusNodeRuleProvider> maritalStatusNodeRuleProviderMembersInjector) {
    assert maritalStatusNodeRuleProviderMembersInjector != null;
    this.maritalStatusNodeRuleProviderMembersInjector =
        maritalStatusNodeRuleProviderMembersInjector;
  }

  @Override
  public MaritalStatusNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        maritalStatusNodeRuleProviderMembersInjector, new MaritalStatusNodeRuleProvider());
  }

  public static Factory<MaritalStatusNodeRuleProvider> create(
      MembersInjector<MaritalStatusNodeRuleProvider> maritalStatusNodeRuleProviderMembersInjector) {
    return new MaritalStatusNodeRuleProvider_Factory(maritalStatusNodeRuleProviderMembersInjector);
  }
}
