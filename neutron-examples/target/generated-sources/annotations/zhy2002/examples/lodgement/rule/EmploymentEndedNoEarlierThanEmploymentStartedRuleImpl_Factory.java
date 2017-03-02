package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.EmploymentEndedNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl_Factory
    implements Factory<EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl> {
  private final MembersInjector<EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl>
      employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector;

  private final Provider<EmploymentEndedNode> ownerProvider;

  public EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl_Factory(
      MembersInjector<EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl>
          employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector,
      Provider<EmploymentEndedNode> ownerProvider) {
    assert employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector != null;
    this.employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector =
        employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl get() {
    return MembersInjectors.injectMembers(
        employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector,
        new EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl(ownerProvider.get()));
  }

  public static Factory<EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl> create(
      MembersInjector<EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl>
          employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector,
      Provider<EmploymentEndedNode> ownerProvider) {
    return new EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl_Factory(
        employmentEndedNoEarlierThanEmploymentStartedRuleImplMembersInjector, ownerProvider);
  }
}
