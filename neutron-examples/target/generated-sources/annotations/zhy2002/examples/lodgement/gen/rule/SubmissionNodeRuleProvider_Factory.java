package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubmissionNodeRuleProvider_Factory
    implements Factory<SubmissionNodeRuleProvider> {
  private final MembersInjector<SubmissionNodeRuleProvider>
      submissionNodeRuleProviderMembersInjector;

  public SubmissionNodeRuleProvider_Factory(
      MembersInjector<SubmissionNodeRuleProvider> submissionNodeRuleProviderMembersInjector) {
    assert submissionNodeRuleProviderMembersInjector != null;
    this.submissionNodeRuleProviderMembersInjector = submissionNodeRuleProviderMembersInjector;
  }

  @Override
  public SubmissionNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        submissionNodeRuleProviderMembersInjector, new SubmissionNodeRuleProvider());
  }

  public static Factory<SubmissionNodeRuleProvider> create(
      MembersInjector<SubmissionNodeRuleProvider> submissionNodeRuleProviderMembersInjector) {
    return new SubmissionNodeRuleProvider_Factory(submissionNodeRuleProviderMembersInjector);
  }
}
