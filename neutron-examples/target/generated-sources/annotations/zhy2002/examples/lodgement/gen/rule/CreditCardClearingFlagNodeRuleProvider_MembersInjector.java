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
public final class CreditCardClearingFlagNodeRuleProvider_MembersInjector
    implements MembersInjector<CreditCardClearingFlagNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

  private final Provider<CreditCardClearingFlagChangedRule>
      creditCardClearingFlagChangedRuleProvider;

  public CreditCardClearingFlagNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider,
      Provider<CreditCardClearingFlagChangedRule> creditCardClearingFlagChangedRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert booleanFixedValueValidationRuleProvider != null;
    this.booleanFixedValueValidationRuleProvider = booleanFixedValueValidationRuleProvider;
    assert creditCardClearingFlagChangedRuleProvider != null;
    this.creditCardClearingFlagChangedRuleProvider = creditCardClearingFlagChangedRuleProvider;
  }

  public static MembersInjector<CreditCardClearingFlagNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider,
      Provider<CreditCardClearingFlagChangedRule> creditCardClearingFlagChangedRuleProvider) {
    return new CreditCardClearingFlagNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        booleanFixedValueValidationRuleProvider,
        creditCardClearingFlagChangedRuleProvider);
  }

  @Override
  public void injectMembers(CreditCardClearingFlagNodeRuleProvider instance) {
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
    instance.creditCardClearingFlagChangedRuleProvider = creditCardClearingFlagChangedRuleProvider;
  }

  public static void injectCreditCardClearingFlagChangedRuleProvider(
      CreditCardClearingFlagNodeRuleProvider instance,
      Provider<CreditCardClearingFlagChangedRule> creditCardClearingFlagChangedRuleProvider) {
    instance.creditCardClearingFlagChangedRuleProvider = creditCardClearingFlagChangedRuleProvider;
  }
}
