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
public final class PatternValidationRule_Factory implements Factory<PatternValidationRule> {
  private final MembersInjector<PatternValidationRule> patternValidationRuleMembersInjector;

  private final Provider<StringUiNode<?>> arg0Provider;

  public PatternValidationRule_Factory(
      MembersInjector<PatternValidationRule> patternValidationRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    assert patternValidationRuleMembersInjector != null;
    this.patternValidationRuleMembersInjector = patternValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public PatternValidationRule get() {
    return MembersInjectors.injectMembers(
        patternValidationRuleMembersInjector, new PatternValidationRule(arg0Provider.get()));
  }

  public static Factory<PatternValidationRule> create(
      MembersInjector<PatternValidationRule> patternValidationRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    return new PatternValidationRule_Factory(patternValidationRuleMembersInjector, arg0Provider);
  }
}
