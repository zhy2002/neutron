package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.ObjectValueRequiredValidationRule;
import zhy2002.neutron.rule.UpdateObjectHasValueRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmploymentEndedNodeRuleProvider_MembersInjector
    implements MembersInjector<EmploymentEndedNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  private final Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider;

  private final Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule>
      employmentEndedNoEarlierThanEmploymentStartedRuleProvider;

  public EmploymentEndedNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider,
      Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule>
          employmentEndedNoEarlierThanEmploymentStartedRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
    assert monthYearNotInFutureRuleProvider != null;
    this.monthYearNotInFutureRuleProvider = monthYearNotInFutureRuleProvider;
    assert employmentEndedNoEarlierThanEmploymentStartedRuleProvider != null;
    this.employmentEndedNoEarlierThanEmploymentStartedRuleProvider =
        employmentEndedNoEarlierThanEmploymentStartedRuleProvider;
  }

  public static MembersInjector<EmploymentEndedNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider,
      Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule>
          employmentEndedNoEarlierThanEmploymentStartedRuleProvider) {
    return new EmploymentEndedNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider,
        monthYearNotInFutureRuleProvider,
        employmentEndedNoEarlierThanEmploymentStartedRuleProvider);
  }

  @Override
  public void injectMembers(EmploymentEndedNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.ObjectUiNodeRuleProvider_MembersInjector
        .injectObjectValueRequiredValidationRuleProvider(
            instance, objectValueRequiredValidationRuleProvider);
    zhy2002.neutron.ObjectUiNodeRuleProvider_MembersInjector.injectUpdateObjectHasValueRuleProvider(
        instance, updateObjectHasValueRuleProvider);
    ((MonthYearNodeRuleProvider) instance).monthYearNotInFutureRuleProvider =
        monthYearNotInFutureRuleProvider;
    instance.employmentEndedNoEarlierThanEmploymentStartedRuleProvider =
        employmentEndedNoEarlierThanEmploymentStartedRuleProvider;
  }

  public static void injectEmploymentEndedNoEarlierThanEmploymentStartedRuleProvider(
      EmploymentEndedNodeRuleProvider instance,
      Provider<EmploymentEndedNoEarlierThanEmploymentStartedRule>
          employmentEndedNoEarlierThanEmploymentStartedRuleProvider) {
    instance.employmentEndedNoEarlierThanEmploymentStartedRuleProvider =
        employmentEndedNoEarlierThanEmploymentStartedRuleProvider;
  }
}