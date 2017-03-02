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
public final class MovedFromPreviousAddressNodeRuleProvider_MembersInjector
    implements MembersInjector<MovedFromPreviousAddressNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  private final Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider;

  private final Provider<FromPreviousNoEarlierThanToPreviousRule>
      fromPreviousNoEarlierThanToPreviousRuleProvider;

  public MovedFromPreviousAddressNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider,
      Provider<FromPreviousNoEarlierThanToPreviousRule>
          fromPreviousNoEarlierThanToPreviousRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
    assert monthYearNotInFutureRuleProvider != null;
    this.monthYearNotInFutureRuleProvider = monthYearNotInFutureRuleProvider;
    assert fromPreviousNoEarlierThanToPreviousRuleProvider != null;
    this.fromPreviousNoEarlierThanToPreviousRuleProvider =
        fromPreviousNoEarlierThanToPreviousRuleProvider;
  }

  public static MembersInjector<MovedFromPreviousAddressNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider,
      Provider<FromPreviousNoEarlierThanToPreviousRule>
          fromPreviousNoEarlierThanToPreviousRuleProvider) {
    return new MovedFromPreviousAddressNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider,
        monthYearNotInFutureRuleProvider,
        fromPreviousNoEarlierThanToPreviousRuleProvider);
  }

  @Override
  public void injectMembers(MovedFromPreviousAddressNodeRuleProvider instance) {
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
    instance.fromPreviousNoEarlierThanToPreviousRuleProvider =
        fromPreviousNoEarlierThanToPreviousRuleProvider;
  }

  public static void injectFromPreviousNoEarlierThanToPreviousRuleProvider(
      MovedFromPreviousAddressNodeRuleProvider instance,
      Provider<FromPreviousNoEarlierThanToPreviousRule>
          fromPreviousNoEarlierThanToPreviousRuleProvider) {
    instance.fromPreviousNoEarlierThanToPreviousRuleProvider =
        fromPreviousNoEarlierThanToPreviousRuleProvider;
  }
}
