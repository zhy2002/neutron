package zhy2002.examples.lodgement.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddExistingApplicantsRuleImpl_Factory
    implements Factory<AddExistingApplicantsRuleImpl> {
  private final MembersInjector<AddExistingApplicantsRuleImpl>
      addExistingApplicantsRuleImplMembersInjector;

  private final Provider<OwnershipListNode<?>> ownerProvider;

  public AddExistingApplicantsRuleImpl_Factory(
      MembersInjector<AddExistingApplicantsRuleImpl> addExistingApplicantsRuleImplMembersInjector,
      Provider<OwnershipListNode<?>> ownerProvider) {
    assert addExistingApplicantsRuleImplMembersInjector != null;
    this.addExistingApplicantsRuleImplMembersInjector =
        addExistingApplicantsRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public AddExistingApplicantsRuleImpl get() {
    return MembersInjectors.injectMembers(
        addExistingApplicantsRuleImplMembersInjector,
        new AddExistingApplicantsRuleImpl(ownerProvider.get()));
  }

  public static Factory<AddExistingApplicantsRuleImpl> create(
      MembersInjector<AddExistingApplicantsRuleImpl> addExistingApplicantsRuleImplMembersInjector,
      Provider<OwnershipListNode<?>> ownerProvider) {
    return new AddExistingApplicantsRuleImpl_Factory(
        addExistingApplicantsRuleImplMembersInjector, ownerProvider);
  }
}
