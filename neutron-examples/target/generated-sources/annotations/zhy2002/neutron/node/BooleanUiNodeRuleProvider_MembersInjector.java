package zhy2002.neutron.node;

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
public final class BooleanUiNodeRuleProvider_MembersInjector<N extends BooleanUiNode<?>>
    implements MembersInjector<BooleanUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  private final Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

  public BooleanUiNodeRuleProvider_MembersInjector(
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

  public static <N extends BooleanUiNode<?>> MembersInjector<BooleanUiNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider) {
    return new BooleanUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        leafValueRequiredValidationRuleProvider,
        booleanFixedValueValidationRuleProvider);
  }

  @Override
  public void injectMembers(BooleanUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    zhy2002.neutron.LeafUiNodeRuleProvider_MembersInjector
        .injectLeafValueRequiredValidationRuleProvider(
            instance, leafValueRequiredValidationRuleProvider);
    instance.booleanFixedValueValidationRuleProvider = booleanFixedValueValidationRuleProvider;
  }

  public static <N extends BooleanUiNode<?>> void injectBooleanFixedValueValidationRuleProvider(
      BooleanUiNodeRuleProvider<N> instance,
      Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider) {
    instance.booleanFixedValueValidationRuleProvider = booleanFixedValueValidationRuleProvider;
  }
}
