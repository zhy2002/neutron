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
public final class UpdateObjectHasValueRule_Factory implements Factory<UpdateObjectHasValueRule> {
  private final MembersInjector<UpdateObjectHasValueRule> updateObjectHasValueRuleMembersInjector;

  private final Provider<ObjectUiNode<?>> arg0Provider;

  public UpdateObjectHasValueRule_Factory(
      MembersInjector<UpdateObjectHasValueRule> updateObjectHasValueRuleMembersInjector,
      Provider<ObjectUiNode<?>> arg0Provider) {
    assert updateObjectHasValueRuleMembersInjector != null;
    this.updateObjectHasValueRuleMembersInjector = updateObjectHasValueRuleMembersInjector;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public UpdateObjectHasValueRule get() {
    return MembersInjectors.injectMembers(
        updateObjectHasValueRuleMembersInjector, new UpdateObjectHasValueRule(arg0Provider.get()));
  }

  public static Factory<UpdateObjectHasValueRule> create(
      MembersInjector<UpdateObjectHasValueRule> updateObjectHasValueRuleMembersInjector,
      Provider<ObjectUiNode<?>> arg0Provider) {
    return new UpdateObjectHasValueRule_Factory(
        updateObjectHasValueRuleMembersInjector, arg0Provider);
  }
}
