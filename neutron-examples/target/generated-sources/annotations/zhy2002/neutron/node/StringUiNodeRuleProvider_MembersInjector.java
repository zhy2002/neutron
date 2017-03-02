package zhy2002.neutron.node;

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
public final class StringUiNodeRuleProvider_MembersInjector<N extends StringUiNode<?>>
    implements MembersInjector<StringUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<PatternValidationRule> patternValidationRuleProvider;

  private final Provider<LengthValidationRule> lengthValidationRuleProvider;

  private final Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

  public StringUiNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<PatternValidationRule> patternValidationRuleProvider,
      Provider<LengthValidationRule> lengthValidationRuleProvider,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider) {
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
  }

  public static <N extends StringUiNode<?>> MembersInjector<StringUiNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<PatternValidationRule> patternValidationRuleProvider,
      Provider<LengthValidationRule> lengthValidationRuleProvider,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider) {
    return new StringUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        patternValidationRuleProvider,
        lengthValidationRuleProvider,
        invalidCharPreChangeRuleProvider);
  }

  @Override
  public void injectMembers(StringUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    instance.patternValidationRuleProvider = patternValidationRuleProvider;
    instance.lengthValidationRuleProvider = lengthValidationRuleProvider;
    instance.invalidCharPreChangeRuleProvider = invalidCharPreChangeRuleProvider;
  }

  public static <N extends StringUiNode<?>> void injectPatternValidationRuleProvider(
      StringUiNodeRuleProvider<N> instance,
      Provider<PatternValidationRule> patternValidationRuleProvider) {
    instance.patternValidationRuleProvider = patternValidationRuleProvider;
  }

  public static <N extends StringUiNode<?>> void injectLengthValidationRuleProvider(
      StringUiNodeRuleProvider<N> instance,
      Provider<LengthValidationRule> lengthValidationRuleProvider) {
    instance.lengthValidationRuleProvider = lengthValidationRuleProvider;
  }

  public static <N extends StringUiNode<?>> void injectInvalidCharPreChangeRuleProvider(
      StringUiNodeRuleProvider<N> instance,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider) {
    instance.invalidCharPreChangeRuleProvider = invalidCharPreChangeRuleProvider;
  }
}
