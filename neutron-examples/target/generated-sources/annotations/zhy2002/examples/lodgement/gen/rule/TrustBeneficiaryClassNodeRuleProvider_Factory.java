package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassNodeRuleProvider_Factory
    implements Factory<TrustBeneficiaryClassNodeRuleProvider> {
  private final MembersInjector<TrustBeneficiaryClassNodeRuleProvider>
      trustBeneficiaryClassNodeRuleProviderMembersInjector;

  public TrustBeneficiaryClassNodeRuleProvider_Factory(
      MembersInjector<TrustBeneficiaryClassNodeRuleProvider>
          trustBeneficiaryClassNodeRuleProviderMembersInjector) {
    assert trustBeneficiaryClassNodeRuleProviderMembersInjector != null;
    this.trustBeneficiaryClassNodeRuleProviderMembersInjector =
        trustBeneficiaryClassNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustBeneficiaryClassNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustBeneficiaryClassNodeRuleProviderMembersInjector,
        new TrustBeneficiaryClassNodeRuleProvider());
  }

  public static Factory<TrustBeneficiaryClassNodeRuleProvider> create(
      MembersInjector<TrustBeneficiaryClassNodeRuleProvider>
          trustBeneficiaryClassNodeRuleProviderMembersInjector) {
    return new TrustBeneficiaryClassNodeRuleProvider_Factory(
        trustBeneficiaryClassNodeRuleProviderMembersInjector);
  }
}
