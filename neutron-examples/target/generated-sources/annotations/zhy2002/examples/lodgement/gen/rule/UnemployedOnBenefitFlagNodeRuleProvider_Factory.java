package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UnemployedOnBenefitFlagNodeRuleProvider_Factory
    implements Factory<UnemployedOnBenefitFlagNodeRuleProvider> {
  private final MembersInjector<UnemployedOnBenefitFlagNodeRuleProvider>
      unemployedOnBenefitFlagNodeRuleProviderMembersInjector;

  public UnemployedOnBenefitFlagNodeRuleProvider_Factory(
      MembersInjector<UnemployedOnBenefitFlagNodeRuleProvider>
          unemployedOnBenefitFlagNodeRuleProviderMembersInjector) {
    assert unemployedOnBenefitFlagNodeRuleProviderMembersInjector != null;
    this.unemployedOnBenefitFlagNodeRuleProviderMembersInjector =
        unemployedOnBenefitFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public UnemployedOnBenefitFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        unemployedOnBenefitFlagNodeRuleProviderMembersInjector,
        new UnemployedOnBenefitFlagNodeRuleProvider());
  }

  public static Factory<UnemployedOnBenefitFlagNodeRuleProvider> create(
      MembersInjector<UnemployedOnBenefitFlagNodeRuleProvider>
          unemployedOnBenefitFlagNodeRuleProviderMembersInjector) {
    return new UnemployedOnBenefitFlagNodeRuleProvider_Factory(
        unemployedOnBenefitFlagNodeRuleProviderMembersInjector);
  }
}
