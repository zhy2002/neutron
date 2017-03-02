package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.node.BigDecimalUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NumberFormatValidationRule_Factory
    implements Factory<NumberFormatValidationRule> {
  private final MembersInjector<NumberFormatValidationRule>
      numberFormatValidationRuleMembersInjector;

  private final Provider<BigDecimalUiNode<?>> arg0Provider;

  public NumberFormatValidationRule_Factory(
      MembersInjector<NumberFormatValidationRule> numberFormatValidationRuleMembersInjector,
      Provider<BigDecimalUiNode<?>> arg0Provider) {
    assert numberFormatValidationRuleMembersInjector != null;
    this.numberFormatValidationRuleMembersInjector = numberFormatValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public NumberFormatValidationRule get() {
    return MembersInjectors.injectMembers(
        numberFormatValidationRuleMembersInjector,
        new NumberFormatValidationRule(arg0Provider.get()));
  }

  public static Factory<NumberFormatValidationRule> create(
      MembersInjector<NumberFormatValidationRule> numberFormatValidationRuleMembersInjector,
      Provider<BigDecimalUiNode<?>> arg0Provider) {
    return new NumberFormatValidationRule_Factory(
        numberFormatValidationRuleMembersInjector, arg0Provider);
  }
}
