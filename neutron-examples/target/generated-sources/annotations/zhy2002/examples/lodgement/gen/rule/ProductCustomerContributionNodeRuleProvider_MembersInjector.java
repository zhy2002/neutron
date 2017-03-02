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
public final class ProductCustomerContributionNodeRuleProvider_MembersInjector
    implements MembersInjector<ProductCustomerContributionNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleProvider;

  private final Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider;

  public ProductCustomerContributionNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert objectValueRequiredValidationRuleProvider != null;
    this.objectValueRequiredValidationRuleProvider = objectValueRequiredValidationRuleProvider;
    assert updateObjectHasValueRuleProvider != null;
    this.updateObjectHasValueRuleProvider = updateObjectHasValueRuleProvider;
  }

  public static MembersInjector<ProductCustomerContributionNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider,
      Provider<UpdateObjectHasValueRule> updateObjectHasValueRuleProvider) {
    return new ProductCustomerContributionNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        objectValueRequiredValidationRuleProvider,
        updateObjectHasValueRuleProvider);
  }

  @Override
  public void injectMembers(ProductCustomerContributionNodeRuleProvider instance) {
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
  }
}