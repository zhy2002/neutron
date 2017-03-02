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
public final class RangeValidationRule_Factory implements Factory<RangeValidationRule> {
  private final MembersInjector<RangeValidationRule> rangeValidationRuleMembersInjector;

  private final Provider<BigDecimalUiNode<?>> arg0Provider;

  public RangeValidationRule_Factory(
      MembersInjector<RangeValidationRule> rangeValidationRuleMembersInjector,
      Provider<BigDecimalUiNode<?>> arg0Provider) {
    assert rangeValidationRuleMembersInjector != null;
    this.rangeValidationRuleMembersInjector = rangeValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public RangeValidationRule get() {
    return MembersInjectors.injectMembers(
        rangeValidationRuleMembersInjector, new RangeValidationRule(arg0Provider.get()));
  }

  public static Factory<RangeValidationRule> create(
      MembersInjector<RangeValidationRule> rangeValidationRuleMembersInjector,
      Provider<BigDecimalUiNode<?>> arg0Provider) {
    return new RangeValidationRule_Factory(rangeValidationRuleMembersInjector, arg0Provider);
  }
}
