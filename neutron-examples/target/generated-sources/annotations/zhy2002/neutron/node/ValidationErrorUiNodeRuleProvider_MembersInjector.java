package zhy2002.neutron.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ValidationErrorUiNodeRuleProvider_MembersInjector<
        N extends ValidationErrorUiNode<?>>
    implements MembersInjector<ValidationErrorUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  public ValidationErrorUiNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
  }

  public static <N extends ValidationErrorUiNode<?>>
      MembersInjector<ValidationErrorUiNodeRuleProvider<N>> create(
          Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
          Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider) {
    return new ValidationErrorUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider, leafValueRequiredValidationRuleProvider);
  }

  @Override
  public void injectMembers(ValidationErrorUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
  }
}
