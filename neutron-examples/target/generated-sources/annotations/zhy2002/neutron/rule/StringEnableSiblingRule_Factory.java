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
public final class StringEnableSiblingRule_Factory implements Factory<StringEnableSiblingRule> {
  private final MembersInjector<StringEnableSiblingRule> stringEnableSiblingRuleMembersInjector;

  private final Provider<StringUiNode<?>> arg0Provider;

  public StringEnableSiblingRule_Factory(
      MembersInjector<StringEnableSiblingRule> stringEnableSiblingRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    assert stringEnableSiblingRuleMembersInjector != null;
    this.stringEnableSiblingRuleMembersInjector = stringEnableSiblingRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public StringEnableSiblingRule get() {
    return MembersInjectors.injectMembers(
        stringEnableSiblingRuleMembersInjector, new StringEnableSiblingRule(arg0Provider.get()));
  }

  public static Factory<StringEnableSiblingRule> create(
      MembersInjector<StringEnableSiblingRule> stringEnableSiblingRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    return new StringEnableSiblingRule_Factory(
        stringEnableSiblingRuleMembersInjector, arg0Provider);
  }
}
