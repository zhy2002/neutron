package zhy2002.neutron;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UiNodeRuleProvider_MembersInjector<N extends UiNode<?>>
    implements MembersInjector<UiNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  public UiNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
  }

  public static <N extends UiNode<?>> MembersInjector<UiNodeRuleProvider<N>> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider) {
    return new UiNodeRuleProvider_MembersInjector<N>(clearErrorsForDisabledNodeRuleProvider);
  }

  @Override
  public void injectMembers(UiNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
  }

  public static <N extends UiNode<?>> void injectClearErrorsForDisabledNodeRuleProvider(
      UiNodeRuleProvider<N> instance,
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider) {
    instance.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
  }
}
