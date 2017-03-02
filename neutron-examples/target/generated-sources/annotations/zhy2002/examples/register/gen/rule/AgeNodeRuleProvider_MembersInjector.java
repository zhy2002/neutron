package zhy2002.examples.register.gen.rule;

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
public final class AgeNodeRuleProvider_MembersInjector
    implements MembersInjector<AgeNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<RangeValidationRule> rangeValidationRuleProvider;

  private final Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider;

  private final Provider<UpdatePlanRule> updatePlanRuleProvider;

  public AgeNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<RangeValidationRule> rangeValidationRuleProvider,
      Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider,
      Provider<UpdatePlanRule> updatePlanRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert rangeValidationRuleProvider != null;
    this.rangeValidationRuleProvider = rangeValidationRuleProvider;
    assert numberFormatValidationRuleProvider != null;
    this.numberFormatValidationRuleProvider = numberFormatValidationRuleProvider;
    assert updatePlanRuleProvider != null;
    this.updatePlanRuleProvider = updatePlanRuleProvider;
  }

  public static MembersInjector<AgeNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<RangeValidationRule> rangeValidationRuleProvider,
      Provider<NumberFormatValidationRule> numberFormatValidationRuleProvider,
      Provider<UpdatePlanRule> updatePlanRuleProvider) {
    return new AgeNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        rangeValidationRuleProvider,
        numberFormatValidationRuleProvider,
        updatePlanRuleProvider);
  }

  @Override
  public void injectMembers(AgeNodeRuleProvider instance) {
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
    instance.updatePlanRuleProvider = updatePlanRuleProvider;
  }

  public static void injectUpdatePlanRuleProvider(
      AgeNodeRuleProvider instance, Provider<UpdatePlanRule> updatePlanRuleProvider) {
    instance.updatePlanRuleProvider = updatePlanRuleProvider;
  }
}
