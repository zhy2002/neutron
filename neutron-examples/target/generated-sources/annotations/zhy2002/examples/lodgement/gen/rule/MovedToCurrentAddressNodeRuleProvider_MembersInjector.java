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
public final class MovedToCurrentAddressNodeRuleProvider_MembersInjector
    implements MembersInjector<MovedToCurrentAddressNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  private final Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider;

  private final Provider<ToCurrentNoEarlierThanToPreviousRule>
      toCurrentNoEarlierThanToPreviousRuleProvider;

  private final Provider<ToCurrentNoEarlierThanFromPreviousRule>
      toCurrentNoEarlierThanFromPreviousRuleProvider;

  public MovedToCurrentAddressNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider,
      Provider<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleProvider,
      Provider<ToCurrentNoEarlierThanFromPreviousRule>
          toCurrentNoEarlierThanFromPreviousRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
    assert monthYearNotInFutureRuleProvider != null;
    this.monthYearNotInFutureRuleProvider = monthYearNotInFutureRuleProvider;
    assert toCurrentNoEarlierThanToPreviousRuleProvider != null;
    this.toCurrentNoEarlierThanToPreviousRuleProvider =
        toCurrentNoEarlierThanToPreviousRuleProvider;
    assert toCurrentNoEarlierThanFromPreviousRuleProvider != null;
    this.toCurrentNoEarlierThanFromPreviousRuleProvider =
        toCurrentNoEarlierThanFromPreviousRuleProvider;
  }

  public static MembersInjector<MovedToCurrentAddressNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider,
      Provider<MonthYearNotInFutureRule> monthYearNotInFutureRuleProvider,
      Provider<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleProvider,
      Provider<ToCurrentNoEarlierThanFromPreviousRule>
          toCurrentNoEarlierThanFromPreviousRuleProvider) {
    return new MovedToCurrentAddressNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider,
        monthYearNotInFutureRuleProvider,
        toCurrentNoEarlierThanToPreviousRuleProvider,
        toCurrentNoEarlierThanFromPreviousRuleProvider);
  }

  @Override
  public void injectMembers(MovedToCurrentAddressNodeRuleProvider instance) {
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
    instance.toCurrentNoEarlierThanToPreviousRuleProvider =
        toCurrentNoEarlierThanToPreviousRuleProvider;
    instance.toCurrentNoEarlierThanFromPreviousRuleProvider =
        toCurrentNoEarlierThanFromPreviousRuleProvider;
  }

  public static void injectToCurrentNoEarlierThanToPreviousRuleProvider(
      MovedToCurrentAddressNodeRuleProvider instance,
      Provider<ToCurrentNoEarlierThanToPreviousRule> toCurrentNoEarlierThanToPreviousRuleProvider) {
    instance.toCurrentNoEarlierThanToPreviousRuleProvider =
        toCurrentNoEarlierThanToPreviousRuleProvider;
  }

  public static void injectToCurrentNoEarlierThanFromPreviousRuleProvider(
      MovedToCurrentAddressNodeRuleProvider instance,
      Provider<ToCurrentNoEarlierThanFromPreviousRule>
          toCurrentNoEarlierThanFromPreviousRuleProvider) {
    instance.toCurrentNoEarlierThanFromPreviousRuleProvider =
        toCurrentNoEarlierThanFromPreviousRuleProvider;
  }
}
