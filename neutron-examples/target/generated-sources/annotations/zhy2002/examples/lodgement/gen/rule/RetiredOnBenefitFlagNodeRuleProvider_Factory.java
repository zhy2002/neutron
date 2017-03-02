package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredOnBenefitFlagNodeRuleProvider_Factory
    implements Factory<RetiredOnBenefitFlagNodeRuleProvider> {
  private final MembersInjector<RetiredOnBenefitFlagNodeRuleProvider>
      retiredOnBenefitFlagNodeRuleProviderMembersInjector;

  public RetiredOnBenefitFlagNodeRuleProvider_Factory(
      MembersInjector<RetiredOnBenefitFlagNodeRuleProvider>
          retiredOnBenefitFlagNodeRuleProviderMembersInjector) {
    assert retiredOnBenefitFlagNodeRuleProviderMembersInjector != null;
    this.retiredOnBenefitFlagNodeRuleProviderMembersInjector =
        retiredOnBenefitFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public RetiredOnBenefitFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        retiredOnBenefitFlagNodeRuleProviderMembersInjector,
        new RetiredOnBenefitFlagNodeRuleProvider());
  }

  public static Factory<RetiredOnBenefitFlagNodeRuleProvider> create(
      MembersInjector<RetiredOnBenefitFlagNodeRuleProvider>
          retiredOnBenefitFlagNodeRuleProviderMembersInjector) {
    return new RetiredOnBenefitFlagNodeRuleProvider_Factory(
        retiredOnBenefitFlagNodeRuleProviderMembersInjector);
  }
}
