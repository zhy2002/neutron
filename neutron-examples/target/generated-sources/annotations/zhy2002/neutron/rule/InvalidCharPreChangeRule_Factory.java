package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.node.StringUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class InvalidCharPreChangeRule_Factory implements Factory<InvalidCharPreChangeRule> {
  private final MembersInjector<InvalidCharPreChangeRule> invalidCharPreChangeRuleMembersInjector;

  private final Provider<StringUiNode<?>> arg0Provider;

  public InvalidCharPreChangeRule_Factory(
      MembersInjector<InvalidCharPreChangeRule> invalidCharPreChangeRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    assert invalidCharPreChangeRuleMembersInjector != null;
    this.invalidCharPreChangeRuleMembersInjector = invalidCharPreChangeRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public InvalidCharPreChangeRule get() {
    return MembersInjectors.injectMembers(
        invalidCharPreChangeRuleMembersInjector, new InvalidCharPreChangeRule(arg0Provider.get()));
  }

  public static Factory<InvalidCharPreChangeRule> create(
      MembersInjector<InvalidCharPreChangeRule> invalidCharPreChangeRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    return new InvalidCharPreChangeRule_Factory(
        invalidCharPreChangeRuleMembersInjector, arg0Provider);
  }
}
