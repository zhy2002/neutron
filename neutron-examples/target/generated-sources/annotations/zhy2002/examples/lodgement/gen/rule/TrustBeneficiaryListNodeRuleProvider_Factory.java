package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficiaryListNodeRuleProvider_Factory
    implements Factory<TrustBeneficiaryListNodeRuleProvider> {
  private final MembersInjector<TrustBeneficiaryListNodeRuleProvider>
      trustBeneficiaryListNodeRuleProviderMembersInjector;

  public TrustBeneficiaryListNodeRuleProvider_Factory(
      MembersInjector<TrustBeneficiaryListNodeRuleProvider>
          trustBeneficiaryListNodeRuleProviderMembersInjector) {
    assert trustBeneficiaryListNodeRuleProviderMembersInjector != null;
    this.trustBeneficiaryListNodeRuleProviderMembersInjector =
        trustBeneficiaryListNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustBeneficiaryListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustBeneficiaryListNodeRuleProviderMembersInjector,
        new TrustBeneficiaryListNodeRuleProvider());
  }

  public static Factory<TrustBeneficiaryListNodeRuleProvider> create(
      MembersInjector<TrustBeneficiaryListNodeRuleProvider>
          trustBeneficiaryListNodeRuleProviderMembersInjector) {
    return new TrustBeneficiaryListNodeRuleProvider_Factory(
        trustBeneficiaryListNodeRuleProviderMembersInjector);
  }
}
