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
public final class LengthValidationRule_Factory implements Factory<LengthValidationRule> {
  private final MembersInjector<LengthValidationRule> lengthValidationRuleMembersInjector;

  private final Provider<StringUiNode<?>> arg0Provider;

  public LengthValidationRule_Factory(
      MembersInjector<LengthValidationRule> lengthValidationRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    assert lengthValidationRuleMembersInjector != null;
    this.lengthValidationRuleMembersInjector = lengthValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public LengthValidationRule get() {
    return MembersInjectors.injectMembers(
        lengthValidationRuleMembersInjector, new LengthValidationRule(arg0Provider.get()));
  }

  public static Factory<LengthValidationRule> create(
      MembersInjector<LengthValidationRule> lengthValidationRuleMembersInjector,
      Provider<StringUiNode<?>> arg0Provider) {
    return new LengthValidationRule_Factory(lengthValidationRuleMembersInjector, arg0Provider);
  }
}
