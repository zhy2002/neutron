package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.PrimaryApplicantFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AtLeastOnePrimaryApplicantRuleImpl_Factory
    implements Factory<AtLeastOnePrimaryApplicantRuleImpl> {
  private final MembersInjector<AtLeastOnePrimaryApplicantRuleImpl>
      atLeastOnePrimaryApplicantRuleImplMembersInjector;

  private final Provider<PrimaryApplicantFlagNode> ownerProvider;

  public AtLeastOnePrimaryApplicantRuleImpl_Factory(
      MembersInjector<AtLeastOnePrimaryApplicantRuleImpl>
          atLeastOnePrimaryApplicantRuleImplMembersInjector,
      Provider<PrimaryApplicantFlagNode> ownerProvider) {
    assert atLeastOnePrimaryApplicantRuleImplMembersInjector != null;
    this.atLeastOnePrimaryApplicantRuleImplMembersInjector =
        atLeastOnePrimaryApplicantRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public AtLeastOnePrimaryApplicantRuleImpl get() {
    return MembersInjectors.injectMembers(
        atLeastOnePrimaryApplicantRuleImplMembersInjector,
        new AtLeastOnePrimaryApplicantRuleImpl(ownerProvider.get()));
  }

  public static Factory<AtLeastOnePrimaryApplicantRuleImpl> create(
      MembersInjector<AtLeastOnePrimaryApplicantRuleImpl>
          atLeastOnePrimaryApplicantRuleImplMembersInjector,
      Provider<PrimaryApplicantFlagNode> ownerProvider) {
    return new AtLeastOnePrimaryApplicantRuleImpl_Factory(
        atLeastOnePrimaryApplicantRuleImplMembersInjector, ownerProvider);
  }
}
