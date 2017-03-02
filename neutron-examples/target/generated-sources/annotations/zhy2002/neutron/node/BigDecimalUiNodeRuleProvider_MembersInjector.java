package zhy2002.neutron.node;

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
public final class BigDecimalUiNodeRuleProvider_MembersInjector<N extends BigDecimalUiNode<?>>
    implements MembersInjector<BigDecimalUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<RangeValidationRule> rangeValidationRuleProvider;

  private final Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider;

  public BigDecimalUiNodeRuleProvider_MembersInjector(
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

  public static <N extends BigDecimalUiNode<?>>
      MembersInjector<BigDecimalUiNodeRuleProvider<N>> create(
          Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
          Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
          Provider<RangeValidationRule> rangeValidationRuleProvider,
          Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider) {
    return new BigDecimalUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        rangeValidationRuleProvider,
        numberFormatValidationRuleProvider);
  }

  @Override
  public void injectMembers(BigDecimalUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    instance.rangeValidationRuleProvider = rangeValidationRuleProvider;
    instance.numberFormatValidationRuleProvider = numberFormatValidationRuleProvider;
  }

  public static <N extends BigDecimalUiNode<?>> void injectRangeValidationRuleProvider(
      BigDecimalUiNodeRuleProvider<N> instance,
      Provider<RangeValidationRule> rangeValidationRuleProvider) {
    instance.rangeValidationRuleProvider = rangeValidationRuleProvider;
  }

  public static <N extends BigDecimalUiNode<?>> void injectNumberFormatValidationRuleProvider(
      BigDecimalUiNodeRuleProvider<N> instance,
      Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider) {
    instance.numberFormatValidationRuleProvider = numberFormatValidationRuleProvider;
  }
}
