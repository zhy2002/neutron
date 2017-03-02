package zhy2002.examples.register.gen.rule;

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
public final class ReceiveOffersNodeRuleProvider_MembersInjector
    implements MembersInjector<ReceiveOffersNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

  private final Provider<EmailIsRequiredWhenReceiveOffersRule>
      emailIsRequiredWhenReceiveOffersRuleProvider;

  public ReceiveOffersNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider,
      Provider<EmailIsRequiredWhenReceiveOffersRule> emailIsRequiredWhenReceiveOffersRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert booleanFixedValueValidationRuleProvider != null;
    this.booleanFixedValueValidationRuleProvider = booleanFixedValueValidationRuleProvider;
    assert emailIsRequiredWhenReceiveOffersRuleProvider != null;
    this.emailIsRequiredWhenReceiveOffersRuleProvider =
        emailIsRequiredWhenReceiveOffersRuleProvider;
  }

  public static MembersInjector<ReceiveOffersNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider,
      Provider<EmailIsRequiredWhenReceiveOffersRule> emailIsRequiredWhenReceiveOffersRuleProvider) {
    return new ReceiveOffersNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        booleanFixedValueValidationRuleProvider,
        emailIsRequiredWhenReceiveOffersRuleProvider);
  }

  @Override
  public void injectMembers(ReceiveOffersNodeRuleProvider instance) {
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
    instance.emailIsRequiredWhenReceiveOffersRuleProvider =
        emailIsRequiredWhenReceiveOffersRuleProvider;
  }

  public static void injectEmailIsRequiredWhenReceiveOffersRuleProvider(
      ReceiveOffersNodeRuleProvider instance,
      Provider<EmailIsRequiredWhenReceiveOffersRule> emailIsRequiredWhenReceiveOffersRuleProvider) {
    instance.emailIsRequiredWhenReceiveOffersRuleProvider =
        emailIsRequiredWhenReceiveOffersRuleProvider;
  }
}
