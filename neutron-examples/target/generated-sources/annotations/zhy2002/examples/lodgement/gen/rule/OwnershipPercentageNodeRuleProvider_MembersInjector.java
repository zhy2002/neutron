package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.NumberFormatValidationRule;
import zhy2002.neutron.rule.RangeValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipPercentageNodeRuleProvider_MembersInjector
    implements MembersInjector<OwnershipPercentageNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<RangeValidationRule> rangeValidationRuleProvider;

  private final Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider;

  public OwnershipPercentageNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<RangeValidationRule> rangeValidationRuleProvider,
      Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert rangeValidationRuleProvider != null;
    this.rangeValidationRuleProvider = rangeValidationRuleProvider;
    assert numberFormatValidationRuleProvider != null;
    this.numberFormatValidationRuleProvider = numberFormatValidationRuleProvider;
  }

  public static MembersInjector<OwnershipPercentageNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<RangeValidationRule> rangeValidationRuleProvider,
      Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider) {
    return new OwnershipPercentageNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        rangeValidationRuleProvider,
        numberFormatValidationRuleProvider);
  }

  @Override
  public void injectMembers(OwnershipPercentageNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    zhy2002.neutron.node.BigDecimalUiNodeRuleProvider_MembersInjector
        .injectRangeValidationRuleProvider(instance, rangeValidationRuleProvider);
    zhy2002.neutron.node.BigDecimalUiNodeRuleProvider_MembersInjector
        .injectNumberFormatValidationRuleProvider(instance, numberFormatValidationRuleProvider);
  }
}
