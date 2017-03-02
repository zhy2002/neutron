package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryClassListNodeRuleProvider_Factory
    implements Factory<TrustBeneficiaryClassListNodeRuleProvider> {
  private final MembersInjector<TrustBeneficiaryClassListNodeRuleProvider>
      trustBeneficiaryClassListNodeRuleProviderMembersInjector;

  public TrustBeneficiaryClassListNodeRuleProvider_Factory(
      MembersInjector<TrustBeneficiaryClassListNodeRuleProvider>
          trustBeneficiaryClassListNodeRuleProviderMembersInjector) {
    assert trustBeneficiaryClassListNodeRuleProviderMembersInjector != null;
    this.trustBeneficiaryClassListNodeRuleProviderMembersInjector =
        trustBeneficiaryClassListNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustBeneficiaryClassListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustBeneficiaryClassListNodeRuleProviderMembersInjector,
        new TrustBeneficiaryClassListNodeRuleProvider());
  }

  public static Factory<TrustBeneficiaryClassListNodeRuleProvider> create(
      MembersInjector<TrustBeneficiaryClassListNodeRuleProvider>
          trustBeneficiaryClassListNodeRuleProviderMembersInjector) {
    return new TrustBeneficiaryClassListNodeRuleProvider_Factory(
        trustBeneficiaryClassListNodeRuleProviderMembersInjector);
  }
}
