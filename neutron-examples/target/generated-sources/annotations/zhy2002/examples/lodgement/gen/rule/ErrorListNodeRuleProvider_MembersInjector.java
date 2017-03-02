package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ErrorListNodeRuleProvider_MembersInjector
    implements MembersInjector<ErrorListNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider;

  public ErrorListNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert changeFocusErrorRuleProvider != null;
    this.changeFocusErrorRuleProvider = changeFocusErrorRuleProvider;
  }

  public static MembersInjector<ErrorListNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider) {
    return new ErrorListNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider, changeFocusErrorRuleProvider);
  }

  @Override
  public void injectMembers(ErrorListNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    instance.changeFocusErrorRuleProvider = changeFocusErrorRuleProvider;
  }

  public static void injectChangeFocusErrorRuleProvider(
      ErrorListNodeRuleProvider instance,
      Provider<ChangeFocusErrorRule> changeFocusErrorRuleProvider) {
    instance.changeFocusErrorRuleProvider = changeFocusErrorRuleProvider;
  }
}
