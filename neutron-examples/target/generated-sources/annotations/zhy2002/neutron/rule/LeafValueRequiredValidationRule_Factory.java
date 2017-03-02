package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LeafValueRequiredValidationRule_Factory
    implements Factory<LeafValueRequiredValidationRule> {
  private final MembersInjector<LeafValueRequiredValidationRule>
      leafValueRequiredValidationRuleMembersInjector;

  private final Provider<LeafUiNode<?, ?>> arg0Provider;

  public LeafValueRequiredValidationRule_Factory(
      MembersInjector<LeafValueRequiredValidationRule>
          leafValueRequiredValidationRuleMembersInjector,
      Provider<LeafUiNode<?, ?>> arg0Provider) {
    assert leafValueRequiredValidationRuleMembersInjector != null;
    this.leafValueRequiredValidationRuleMembersInjector =
        leafValueRequiredValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public LeafValueRequiredValidationRule get() {
    return MembersInjectors.injectMembers(
        leafValueRequiredValidationRuleMembersInjector,
        new LeafValueRequiredValidationRule(arg0Provider.get()));
  }

  public static Factory<LeafValueRequiredValidationRule> create(
      MembersInjector<LeafValueRequiredValidationRule>
          leafValueRequiredValidationRuleMembersInjector,
      Provider<LeafUiNode<?, ?>> arg0Provider) {
    return new LeafValueRequiredValidationRule_Factory(
        leafValueRequiredValidationRuleMembersInjector, arg0Provider);
  }
}
