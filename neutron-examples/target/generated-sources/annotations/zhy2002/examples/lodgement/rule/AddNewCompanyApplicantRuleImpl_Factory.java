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
public final class AddNewCompanyApplicantRuleImpl_Factory
    implements Factory<AddNewCompanyApplicantRuleImpl> {
  private final MembersInjector<AddNewCompanyApplicantRuleImpl>
      addNewCompanyApplicantRuleImplMembersInjector;

  private final Provider<OwnershipListNode<?>> ownerProvider;

  public AddNewCompanyApplicantRuleImpl_Factory(
      MembersInjector<AddNewCompanyApplicantRuleImpl> addNewCompanyApplicantRuleImplMembersInjector,
      Provider<OwnershipListNode<?>> ownerProvider) {
    assert addNewCompanyApplicantRuleImplMembersInjector != null;
    this.addNewCompanyApplicantRuleImplMembersInjector =
        addNewCompanyApplicantRuleImplMembersInjector;
    assert ownerProvider != null;
    this.ownerProvider = ownerProvider;
  }

  @Override
  public AddNewCompanyApplicantRuleImpl get() {
    return MembersInjectors.injectMembers(
        addNewCompanyApplicantRuleImplMembersInjector,
        new AddNewCompanyApplicantRuleImpl(ownerProvider.get()));
  }

  public static Factory<AddNewCompanyApplicantRuleImpl> create(
      MembersInjector<AddNewCompanyApplicantRuleImpl> addNewCompanyApplicantRuleImplMembersInjector,
      Provider<OwnershipListNode<?>> ownerProvider) {
    return new AddNewCompanyApplicantRuleImpl_Factory(
        addNewCompanyApplicantRuleImplMembersInjector, ownerProvider);
  }
}
