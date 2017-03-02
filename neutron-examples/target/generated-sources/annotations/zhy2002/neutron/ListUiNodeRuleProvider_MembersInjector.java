package zhy2002.neutron;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ListUiNodeRuleProvider_MembersInjector<N extends ListUiNode<?, ?>>
    implements MembersInjector<ListUiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  public ListUiNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
  }

  public static <N extends ListUiNode<?, ?>> MembersInjector<ListUiNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider) {
    return new ListUiNodeRuleProvider_MembersInjector<N>(clearErrorsForDisabledNodeRuleProvider);
  }

  @Override
  public void injectMembers(ListUiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((UiNodeRuleProvider) instance).clearErrorsForDisabledNodeRuleProvider =
        clearErrorsForDisabledNodeRuleProvider;
  }
}
