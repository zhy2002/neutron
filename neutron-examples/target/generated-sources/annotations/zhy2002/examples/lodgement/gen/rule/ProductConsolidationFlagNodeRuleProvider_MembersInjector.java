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
public final class ProductConsolidationFlagNodeRuleProvider_MembersInjector
    implements MembersInjector<ProductConsolidationFlagNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

  public ProductConsolidationFlagNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert booleanFixedValueValidationRuleProvider != null;
    this.booleanFixedValueValidationRuleProvider = booleanFixedValueValidationRuleProvider;
  }

  public static MembersInjector<ProductConsolidationFlagNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider) {
    return new ProductConsolidationFlagNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        booleanFixedValueValidationRuleProvider);
  }

  @Override
  public void injectMembers(ProductConsolidationFlagNodeRuleProvider instance) {
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
  }
}