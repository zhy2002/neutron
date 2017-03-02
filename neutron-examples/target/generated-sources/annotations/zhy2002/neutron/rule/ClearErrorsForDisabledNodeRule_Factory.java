package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ClearErrorsForDisabledNodeRule_Factory
    implements Factory<ClearErrorsForDisabledNodeRule> {
  private final MembersInjector<ClearErrorsForDisabledNodeRule>
      clearErrorsForDisabledNodeRuleMembersInjector;

  private final Provider<UiNode<?>> arg0Provider;

  public ClearErrorsForDisabledNodeRule_Factory(
      MembersInjector<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleMembersInjector,
      Provider<UiNode<?>> arg0Provider) {
    assert clearErrorsForDisabledNodeRuleMembersInjector != null;
    this.clearErrorsForDisabledNodeRuleMembersInjector =
        clearErrorsForDisabledNodeRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public ClearErrorsForDisabledNodeRule get() {
    return MembersInjectors.injectMembers(
        clearErrorsForDisabledNodeRuleMembersInjector,
        new ClearErrorsForDisabledNodeRule(arg0Provider.get()));
  }

  public static Factory<ClearErrorsForDisabledNodeRule> create(
      MembersInjector<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleMembersInjector,
      Provider<UiNode<?>> arg0Provider) {
    return new ClearErrorsForDisabledNodeRule_Factory(
        clearErrorsForDisabledNodeRuleMembersInjector, arg0Provider);
  }
}
