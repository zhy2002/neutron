package zhy2002.neutron.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ObjectValueRequiredValidationRule_Factory
    implements Factory<ObjectValueRequiredValidationRule> {
  private final MembersInjector<ObjectValueRequiredValidationRule>
      objectValueRequiredValidationRuleMembersInjector;

  private final Provider<ObjectUiNode<?>> arg0Provider;

  public ObjectValueRequiredValidationRule_Factory(
      MembersInjector<ObjectValueRequiredValidationRule>
          objectValueRequiredValidationRuleMembersInjector,
      Provider<ObjectUiNode<?>> arg0Provider) {
    assert objectValueRequiredValidationRuleMembersInjector != null;
    this.objectValueRequiredValidationRuleMembersInjector =
        objectValueRequiredValidationRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public ObjectValueRequiredValidationRule get() {
    return MembersInjectors.injectMembers(
        objectValueRequiredValidationRuleMembersInjector,
        new ObjectValueRequiredValidationRule(arg0Provider.get()));
  }

  public static Factory<ObjectValueRequiredValidationRule> create(
      MembersInjector<ObjectValueRequiredValidationRule>
          objectValueRequiredValidationRuleMembersInjector,
      Provider<ObjectUiNode<?>> arg0Provider) {
    return new ObjectValueRequiredValidationRule_Factory(
        objectValueRequiredValidationRuleMembersInjector, arg0Provider);
  }
}
