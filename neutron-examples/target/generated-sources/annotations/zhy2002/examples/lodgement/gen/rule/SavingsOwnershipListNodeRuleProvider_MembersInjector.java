package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SavingsOwnershipListNodeRuleProvider_MembersInjector
    implements MembersInjector<SavingsOwnershipListNodeRuleProvider> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider;

  private final Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider;

  private final Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider;

  public SavingsOwnershipListNodeRuleProvider_MembersInjector(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider,
      Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider,
      Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider) {
    assert clearErrorsForDisabledNodeRuleProvider != null;
    this.clearErrorsForDisabledNodeRuleProvider = clearErrorsForDisabledNodeRuleProvider;
    assert addExistingApplicantsRuleProvider != null;
    this.addExistingApplicantsRuleProvider = addExistingApplicantsRuleProvider;
    assert addNewPersonApplicantRuleProvider != null;
    this.addNewPersonApplicantRuleProvider = addNewPersonApplicantRuleProvider;
    assert addNewCompanyApplicantRuleProvider != null;
    this.addNewCompanyApplicantRuleProvider = addNewCompanyApplicantRuleProvider;
  }

  public static MembersInjector<SavingsOwnershipListNodeRuleProvider> create(
      Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
      Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider,
      Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider,
      Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider) {
    return new SavingsOwnershipListNodeRuleProvider_MembersInjector(
        clearErrorsForDisabledNodeRuleProvider,
        addExistingApplicantsRuleProvider,
        addNewPersonApplicantRuleProvider,
        addNewCompanyApplicantRuleProvider);
  }

  @Override
  public void injectMembers(SavingsOwnershipListNodeRuleProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    ((OwnershipListNodeRuleProvider) instance).addExistingApplicantsRuleProvider =
        addExistingApplicantsRuleProvider;
    ((OwnershipListNodeRuleProvider) instance).addNewPersonApplicantRuleProvider =
        addNewPersonApplicantRuleProvider;
    ((OwnershipListNodeRuleProvider) instance).addNewCompanyApplicantRuleProvider =
        addNewCompanyApplicantRuleProvider;
  }
}
