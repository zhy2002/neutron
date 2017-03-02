package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.PersonNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdatePersonNodeLabelRuleImpl_Factory
    implements Factory<UpdatePersonNodeLabelRuleImpl> {
  private final MembersInjector<UpdatePersonNodeLabelRuleImpl>
      updatePersonNodeLabelRuleImplMembersInjector;

  private final Provider<PersonNode> ownerProvider;

  public UpdatePersonNodeLabelRuleImpl_Factory(
      MembersInjector<UpdatePersonNodeLabelRuleImpl> updatePersonNodeLabelRuleImplMembersInjector,
      Provider<PersonNode> ownerProvider) {
    assert updatePersonNodeLabelRuleImplMembersInjector != null;
    this.updatePersonNodeLabelRuleImplMembersInjector =
        updatePersonNodeLabelRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public UpdatePersonNodeLabelRuleImpl get() {
    return MembersInjectors.injectMembers(
        updatePersonNodeLabelRuleImplMembersInjector,
        new UpdatePersonNodeLabelRuleImpl(ownerProvider.get()));
  }

  public static Factory<UpdatePersonNodeLabelRuleImpl> create(
      MembersInjector<UpdatePersonNodeLabelRuleImpl> updatePersonNodeLabelRuleImplMembersInjector,
      Provider<PersonNode> ownerProvider) {
    return new UpdatePersonNodeLabelRuleImpl_Factory(
        updatePersonNodeLabelRuleImplMembersInjector, ownerProvider);
  }
}
