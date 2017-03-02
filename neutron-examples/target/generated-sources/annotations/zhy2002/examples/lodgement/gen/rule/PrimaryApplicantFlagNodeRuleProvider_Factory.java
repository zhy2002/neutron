package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimaryApplicantFlagNodeRuleProvider_Factory
    implements Factory<PrimaryApplicantFlagNodeRuleProvider> {
  private final MembersInjector<PrimaryApplicantFlagNodeRuleProvider>
      primaryApplicantFlagNodeRuleProviderMembersInjector;

  public PrimaryApplicantFlagNodeRuleProvider_Factory(
      MembersInjector<PrimaryApplicantFlagNodeRuleProvider>
          primaryApplicantFlagNodeRuleProviderMembersInjector) {
    assert primaryApplicantFlagNodeRuleProviderMembersInjector != null;
    this.primaryApplicantFlagNodeRuleProviderMembersInjector =
        primaryApplicantFlagNodeRuleProviderMembersInjector;
  }

  @Override
  public PrimaryApplicantFlagNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        primaryApplicantFlagNodeRuleProviderMembersInjector,
        new PrimaryApplicantFlagNodeRuleProvider());
  }

  public static Factory<PrimaryApplicantFlagNodeRuleProvider> create(
      MembersInjector<PrimaryApplicantFlagNodeRuleProvider>
          primaryApplicantFlagNodeRuleProviderMembersInjector) {
    return new PrimaryApplicantFlagNodeRuleProvider_Factory(
        primaryApplicantFlagNodeRuleProviderMembersInjector);
  }
}
