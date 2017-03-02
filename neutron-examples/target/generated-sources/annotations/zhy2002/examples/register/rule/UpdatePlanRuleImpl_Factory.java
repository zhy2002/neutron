package zhy2002.examples.register.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.node.AgeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdatePlanRuleImpl_Factory implements Factory<UpdatePlanRuleImpl> {
  private final MembersInjector<UpdatePlanRuleImpl> updatePlanRuleImplMembersInjector;

  private final Provider<AgeNode> ownerProvider;

  public UpdatePlanRuleImpl_Factory(
      MembersInjector<UpdatePlanRuleImpl> updatePlanRuleImplMembersInjector,
      Provider<AgeNode> ownerProvider) {
    assert updatePlanRuleImplMembersInjector != null;
    this.updatePlanRuleImplMembersInjector = updatePlanRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public UpdatePlanRuleImpl get() {
    return MembersInjectors.injectMembers(
        updatePlanRuleImplMembersInjector, new UpdatePlanRuleImpl(ownerProvider.get()));
  }

  public static Factory<UpdatePlanRuleImpl> create(
      MembersInjector<UpdatePlanRuleImpl> updatePlanRuleImplMembersInjector,
      Provider<AgeNode> ownerProvider) {
    return new UpdatePlanRuleImpl_Factory(updatePlanRuleImplMembersInjector, ownerProvider);
  }
}
