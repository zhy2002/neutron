package zhy2002.neutron;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;
import zhy2002.neutron.rule.LeafValueRequiredValidationRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LeafUiNodeRuleProvider_MembersInjector<N extends LeafUiNode<?, ?>>
    implements MembersInjector<LeafUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider;

  public LeafUiNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert leafValueRequiredValidationRuleProvider != null;
    this.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
  }

  public static <N extends LeafUiNode<?, ?>> MembersInjector<LeafUiNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider) {
    return new LeafUiNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider, leafValueRequiredValidationRuleProvider);
  }

  @Override
  public void injectMembers(LeafUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((UiNodeRuleProvider) instance).clearErrorsForDisabledNodeRuleProvider =
        clearErrorsForDisabledNodeRuleProvider;
    instance.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
  }

  public static <N extends LeafUiNode<?, ?>> void injectLeafValueRequiredValidationRuleProvider(
      LeafUiNodeRuleProvider<N> instance,
      Provider<LeafValueRequiredValidationRule> leafValueRequiredValidationRuleProvider) {
    instance.leafValueRequiredValidationRuleProvider = leafValueRequiredValidationRuleProvider;
  }
}
