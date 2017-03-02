package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustBeneficialOwnerListNodeRuleProvider_Factory
    implements Factory<TrustBeneficialOwnerListNodeRuleProvider> {
  private final MembersInjector<TrustBeneficialOwnerListNodeRuleProvider>
      trustBeneficialOwnerListNodeRuleProviderMembersInjector;

  public TrustBeneficialOwnerListNodeRuleProvider_Factory(
      MembersInjector<TrustBeneficialOwnerListNodeRuleProvider>
          trustBeneficialOwnerListNodeRuleProviderMembersInjector) {
    assert trustBeneficialOwnerListNodeRuleProviderMembersInjector != null;
    this.trustBeneficialOwnerListNodeRuleProviderMembersInjector =
        trustBeneficialOwnerListNodeRuleProviderMembersInjector;
  }

  @Override
  public TrustBeneficialOwnerListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        trustBeneficialOwnerListNodeRuleProviderMembersInjector,
        new TrustBeneficialOwnerListNodeRuleProvider());
  }

  public static Factory<TrustBeneficialOwnerListNodeRuleProvider> create(
      MembersInjector<TrustBeneficialOwnerListNodeRuleProvider>
          trustBeneficialOwnerListNodeRuleProviderMembersInjector) {
    return new TrustBeneficialOwnerListNodeRuleProvider_Factory(
        trustBeneficialOwnerListNodeRuleProviderMembersInjector);
  }
}
