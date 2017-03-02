package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustRegistrationDateNodeRuleProvider_Factory
    implements Factory<TrustRegistrationDateNodeRuleProvider> {
  private final MembersInjector<TrustRegistrationDateNodeRuleProvider>
      trustRegistrationDateNodeRuleProviderMembersInjector;

  public TrustRegistrationDateNodeRuleProvider_Factory(
      MembersInjector<TrustRegistrationDateNodeRuleProvider>
          trustRegistrationDateNodeRuleProviderMembersInjector) {
    assert trustRegistrationDateNodeRuleProviderMembersInjector != null;
    this.trustRegistrationDateNodeRuleProviderMembersInjector =
        trustRegistrationDateNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustRegistrationDateNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustRegistrationDateNodeRuleProviderMembersInjector,
        new TrustRegistrationDateNodeRuleProvider());
  }

  public static Factory<TrustRegistrationDateNodeRuleProvider> create(
      MembersInjector<TrustRegistrationDateNodeRuleProvider>
          trustRegistrationDateNodeRuleProviderMembersInjector) {
    return new TrustRegistrationDateNodeRuleProvider_Factory(
        trustRegistrationDateNodeRuleProviderMembersInjector);
  }
}
