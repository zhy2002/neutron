package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.BooleanFixedValueValidationRule;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimaryApplicantFlagNodeRuleProvider_MembersInjector
    implements MembersInjector<PrimaryApplicantFlagNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

  private final Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider;

  private final Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider;

  public PrimaryApplicantFlagNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider,
      Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider,
      Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert booleanFixedValueValidationRuleProvider != null;
    this.booleanFixedValueValidationRuleProvider = booleanFixedValueValidationRuleProvider;
    assert atLeastOnePrimaryApplicantRuleProvider != null;
    this.atLeastOnePrimaryApplicantRuleProvider = atLeastOnePrimaryApplicantRuleProvider;
    assert atMostOnePrimaryApplicantRuleProvider != null;
    this.atMostOnePrimaryApplicantRuleProvider = atMostOnePrimaryApplicantRuleProvider;
  }

  public static MembersInjector<PrimaryApplicantFlagNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider,
      Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider,
      Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider) {
    return new PrimaryApplicantFlagNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        booleanFixedValueValidationRuleProvider,
        atLeastOnePrimaryApplicantRuleProvider,
        atMostOnePrimaryApplicantRuleProvider);
  }

  @Override
  public void injectMembers(PrimaryApplicantFlagNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    zhy2002.neutron.node.BooleanUiNodeRuleProvider_MembersInjector
        .injectBooleanFixedValueValidationRuleProvider(
            instance, booleanFixedValueValidationRuleProvider);
    instance.atLeastOnePrimaryApplicantRuleProvider = atLeastOnePrimaryApplicantRuleProvider;
    instance.atMostOnePrimaryApplicantRuleProvider = atMostOnePrimaryApplicantRuleProvider;
  }

  public static void injectAtLeastOnePrimaryApplicantRuleProvider(
      PrimaryApplicantFlagNodeRuleProvider instance,
      Provider<AtLeastOnePrimaryApplicantRule> atLeastOnePrimaryApplicantRuleProvider) {
    instance.atLeastOnePrimaryApplicantRuleProvider = atLeastOnePrimaryApplicantRuleProvider;
  }

  public static void injectAtMostOnePrimaryApplicantRuleProvider(
      PrimaryApplicantFlagNodeRuleProvider instance,
      Provider<AtMostOnePrimaryApplicantRule> atMostOnePrimaryApplicantRuleProvider) {
    instance.atMostOnePrimaryApplicantRuleProvider = atMostOnePrimaryApplicantRuleProvider;
  }
}
