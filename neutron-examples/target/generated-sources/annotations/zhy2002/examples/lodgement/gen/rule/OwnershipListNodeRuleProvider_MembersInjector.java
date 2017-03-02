package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.node.OwnershipListNode;
import zhy2002.neutron.rule.ClearErrorsForDisabledNodeRule;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnershipListNodeRuleProvider_MembersInjector<N extends OwnershipListNode<?>>
    implements MembersInjector<OwnershipListNodeRuleProvider<N>> {
  private final Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider;

  private final Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider;

  private final Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider;

  private final Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider;

  public OwnershipListNodeRuleProvider_MembersInjector(
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

  public static <N extends OwnershipListNode<?>>
      MembersInjector<OwnershipListNodeRuleProvider<N>> create(
          Provider<ClearErrorsForDisabledNodeRule> clearErrorsForDisabledNodeRuleProvider,
          Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider,
          Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider,
          Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider) {
    return new OwnershipListNodeRuleProvider_MembersInjector<N>(
        clearErrorsForDisabledNodeRuleProvider,
        addExistingApplicantsRuleProvider,
        addNewPersonApplicantRuleProvider,
        addNewCompanyApplicantRuleProvider);
  }

  @Override
  public void injectMembers(OwnershipListNodeRuleProvider<N> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    zhy2002.neutron.UiNodeRuleProvider_MembersInjector.injectClearErrorsForDisabledNodeRuleProvider(
        instance, clearErrorsForDisabledNodeRuleProvider);
    instance.addExistingApplicantsRuleProvider = addExistingApplicantsRuleProvider;
    instance.addNewPersonApplicantRuleProvider = addNewPersonApplicantRuleProvider;
    instance.addNewCompanyApplicantRuleProvider = addNewCompanyApplicantRuleProvider;
  }

  public static <N extends OwnershipListNode<?>> void injectAddExistingApplicantsRuleProvider(
      OwnershipListNodeRuleProvider<N> instance,
      Provider<AddExistingApplicantsRule> addExistingApplicantsRuleProvider) {
    instance.addExistingApplicantsRuleProvider = addExistingApplicantsRuleProvider;
  }

  public static <N extends OwnershipListNode<?>> void injectAddNewPersonApplicantRuleProvider(
      OwnershipListNodeRuleProvider<N> instance,
      Provider<AddNewPersonApplicantRule> addNewPersonApplicantRuleProvider) {
    instance.addNewPersonApplicantRuleProvider = addNewPersonApplicantRuleProvider;
  }

  public static <N extends OwnershipListNode<?>> void injectAddNewCompanyApplicantRuleProvider(
      OwnershipListNodeRuleProvider<N> instance,
      Provider<AddNewCompanyApplicantRule> addNewCompanyApplicantRuleProvider) {
    instance.addNewCompanyApplicantRuleProvider = addNewCompanyApplicantRuleProvider;
  }
}
