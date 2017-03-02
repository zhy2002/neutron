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
public final class AddNewPersonApplicantRuleImpl_Factory
    implements Factory<AddNewPersonApplicantRuleImpl> {
  private final MembersInjector<AddNewPersonApplicantRuleImpl>
      addNewPersonApplicantRuleImplMembersInjector;

  private final Provider<OwnershipListNode<?>> ownerProvider;

  public AddNewPersonApplicantRuleImpl_Factory(
      MembersInjector<AddNewPersonApplicantRuleImpl> addNewPersonApplicantRuleImplMembersInjector,
      Provider<OwnershipListNode<?>> ownerProvider) {
    assert addNewPersonApplicantRuleImplMembersInjector != null;
    this.addNewPersonApplicantRuleImplMembersInjector =
        addNewPersonApplicantRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public AddNewPersonApplicantRuleImpl get() {
    return MembersInjectors.injectMembers(
        addNewPersonApplicantRuleImplMembersInjector,
        new AddNewPersonApplicantRuleImpl(ownerProvider.get()));
  }

  public static Factory<AddNewPersonApplicantRuleImpl> create(
      MembersInjector<AddNewPersonApplicantRuleImpl> addNewPersonApplicantRuleImplMembersInjector,
      Provider<OwnershipListNode<?>> ownerProvider) {
    return new AddNewPersonApplicantRuleImpl_Factory(
        addNewPersonApplicantRuleImplMembersInjector, ownerProvider);
  }
}
