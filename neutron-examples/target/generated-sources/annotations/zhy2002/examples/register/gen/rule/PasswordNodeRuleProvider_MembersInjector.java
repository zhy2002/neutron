package zhy2002.examples.register.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.InvalidCharPreChangeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.PatternValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PasswordNodeRuleProvider_MembersInjector
    implements MembersInjector<PasswordNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<PatternValidationRule> patternValidationRuleProvider;

  private final Provider<LengthValidationRule> lengthValidationRuleProvider;

  private final Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

  private final Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider;

  public PasswordNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<PatternValidationRule> patternValidationRuleProvider,
      Provider<LengthValidationRule> lengthValidationRuleProvider,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider,
      Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
    assert patternValidationRuleProvider != null;
    this.patternValidationRuleProvider = patternValidationRuleProvider;
    assert lengthValidationRuleProvider != null;
    this.lengthValidationRuleProvider = lengthValidationRuleProvider;
    assert invalidCharPreChangeRuleProvider != null;
    this.invalidCharPreChangeRuleProvider = invalidCharPreChangeRuleProvider;
    assert passwordIsStrongRuleProvider != null;
    this.passwordIsStrongRuleProvider = passwordIsStrongRuleProvider;
  }

  public static MembersInjector<PasswordNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<PatternValidationRule> patternValidationRuleProvider,
      Provider<LengthValidationRule> lengthValidationRuleProvider,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider,
      Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider) {
    return new PasswordNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        patternValidationRuleProvider,
        lengthValidationRuleProvider,
        invalidCharPreChangeRuleProvider,
        passwordIsStrongRuleProvider);
  }

  @Override
  public void injectMembers(PasswordNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    zhy2002.neutron.node.StringUiNodeRuleProvider_MembersInjector
        .injectPatternValidationRuleProvider(instance, patternValidationRuleProvider);
    zhy2002.neutron.node.StringUiNodeRuleProvider_MembersInjector
        .injectLengthValidationRuleProvider(instance, lengthValidationRuleProvider);
    zhy2002.neutron.node.StringUiNodeRuleProvider_MembersInjector
        .injectInvalidCharPreChangeRuleProvider(instance, invalidCharPreChangeRuleProvider);
    instance.passwordIsStrongRuleProvider = passwordIsStrongRuleProvider;
  }

  public static void injectPasswordIsStrongRuleProvider(
      PasswordNodeRuleProvider instance,
      Provider<PasswordIsStrongRule> passwordIsStrongRuleProvider) {
    instance.passwordIsStrongRuleProvider = passwordIsStrongRuleProvider;
  }
}
