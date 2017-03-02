package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.node.BooleanUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BooleanFixedValueValidationRule_Factory
    implements Factory<BooleanFixedValueValidationRule> {
  private final MembersInjector<BooleanFixedValueValidationRule>
      booleanFixedValueValidationRuleMembersInjector;

  private final Provider<BooleanUiNode<?>> arg0Provider;

  public BooleanFixedValueValidationRule_Factory(
      MembersInjector<BooleanFixedValueValidationRule>
          booleanFixedValueValidationRuleMembersInjector,
      Provider<BooleanUiNode<?>> arg0Provider) {
    assert booleanFixedValueValidationRuleMembersInjector != null;
    this.booleanFixedValueValidationRuleMembersInjector =
        booleanFixedValueValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public BooleanFixedValueValidationRule get() {
    return MembersInjectors.injectMembers(
        booleanFixedValueValidationRuleMembersInjector,
        new BooleanFixedValueValidationRule(arg0Provider.get()));
  }

  public static Factory<BooleanFixedValueValidationRule> create(
      MembersInjector<BooleanFixedValueValidationRule>
          booleanFixedValueValidationRuleMembersInjector,
      Provider<BooleanUiNode<?>> arg0Provider) {
    return new BooleanFixedValueValidationRule_Factory(
        booleanFixedValueValidationRuleMembersInjector, arg0Provider);
  }
}
