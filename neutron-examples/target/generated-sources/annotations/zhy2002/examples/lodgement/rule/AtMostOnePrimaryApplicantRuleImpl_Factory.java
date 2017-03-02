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
public final class AtMostOnePrimaryApplicantRuleImpl_Factory
    implements Factory<AtMostOnePrimaryApplicantRuleImpl> {
  private final MembersInjector<AtMostOnePrimaryApplicantRuleImpl>
      atMostOnePrimaryApplicantRuleImplMembersInjector;

  private final Provider<PrimaryApplicantFlagNode> ownerProvider;

  public AtMostOnePrimaryApplicantRuleImpl_Factory(
      MembersInjector<AtMostOnePrimaryApplicantRuleImpl>
          atMostOnePrimaryApplicantRuleImplMembersInjector,
      Provider<PrimaryApplicantFlagNode> ownerProvider) {
    assert atMostOnePrimaryApplicantRuleImplMembersInjector != null;
    this.atMostOnePrimaryApplicantRuleImplMembersInjector =
        atMostOnePrimaryApplicantRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public AtMostOnePrimaryApplicantRuleImpl get() {
    return MembersInjectors.injectMembers(
        atMostOnePrimaryApplicantRuleImplMembersInjector,
        new AtMostOnePrimaryApplicantRuleImpl(ownerProvider.get()));
  }

  public static Factory<AtMostOnePrimaryApplicantRuleImpl> create(
      MembersInjector<AtMostOnePrimaryApplicantRuleImpl>
          atMostOnePrimaryApplicantRuleImplMembersInjector,
      Provider<PrimaryApplicantFlagNode> ownerProvider) {
    return new AtMostOnePrimaryApplicantRuleImpl_Factory(
        atMostOnePrimaryApplicantRuleImplMembersInjector, ownerProvider);
  }
}
