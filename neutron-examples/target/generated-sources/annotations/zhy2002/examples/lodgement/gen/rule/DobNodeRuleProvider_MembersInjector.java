package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.DobNode;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.InvalidCharPreChangeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;
import zhy2002.neutron.rule.LengthValidationRule;
import zhy2002.neutron.rule.PatternValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DobNodeRuleProvider_MembersInjector<N extends DobNode<?>>
    implements MembersInjector<DobNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<PatternValidationRule> patternValidationRuleProvider;

  private final Provider<LengthValidationRule> lengthValidationRuleProvider;

  private final Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider;

  private final Provider<DobRangeValidationRule> dobRangeValidationRuleProvider;

  public DobNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<PatternValidationRule> patternValidationRuleProvider,
      Provider<LengthValidationRule> lengthValidationRuleProvider,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider,
      Provider<DobRangeValidationRule> dobRangeValidationRuleProvider) {
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
    assert dobRangeValidationRuleProvider != null;
    this.dobRangeValidationRuleProvider = dobRangeValidationRuleProvider;
  }

  public static <N extends DobNode<?>> MembersInjector<DobNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<PatternValidationRule> patternValidationRuleProvider,
      Provider<LengthValidationRule> lengthValidationRuleProvider,
      Provider<InvalidCharPreChangeRule> invalidCharPreChangeRuleProvider,
      Provider<DobRangeValidationRule> dobRangeValidationRuleProvider) {
    return new DobNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        patternValidationRuleProvider,
        lengthValidationRuleProvider,
        invalidCharPreChangeRuleProvider,
        dobRangeValidationRuleProvider);
  }

  @Override
  public void injectMembers(DobNodeRuleProvider<N> instance) {
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
    instance.dobRangeValidationRuleProvider = dobRangeValidationRuleProvider;
  }

  public static <N extends DobNode<?>> void injectDobRangeValidationRuleProvider(
      DobNodeRuleProvider<N> instance,
      Provider<DobRangeValidationRule> dobRangeValidationRuleProvider) {
    instance.dobRangeValidationRuleProvider = dobRangeValidationRuleProvider;
  }
}