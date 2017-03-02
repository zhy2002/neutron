package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicantReferenceNodeRuleProvider_Factory
    implements Factory<ApplicantReferenceNodeRuleProvider> {
  private final MembersInjector<ApplicantReferenceNodeRuleProvider>
      applicantReferenceNodeRuleProviderMembersInjector;

  public ApplicantReferenceNodeRuleProvider_Factory(
      MembersInjector<ApplicantReferenceNodeRuleProvider>
          applicantReferenceNodeRuleProviderMembersInjector) {
    assert applicantReferenceNodeRuleProviderMembersInjector != null;
    this.applicantReferenceNodeRuleProviderMembersInjector =
        applicantReferenceNodeRuleProviderMembersInjector;
  }

  @Override
  public ApplicantReferenceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        applicantReferenceNodeRuleProviderMembersInjector,
        new ApplicantReferenceNodeRuleProvider());
  }

  public static Factory<ApplicantReferenceNodeRuleProvider> create(
      MembersInjector<ApplicantReferenceNodeRuleProvider>
          applicantReferenceNodeRuleProviderMembersInjector) {
    return new ApplicantReferenceNodeRuleProvider_Factory(
        applicantReferenceNodeRuleProviderMembersInjector);
  }
}
