package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.node.AddressRefListNodeImpl;
import zhy2002.examples.lodgement.node.ApplicationNodeContextImpl;
import zhy2002.examples.lodgement.node.ApplicationNodeImpl;
import zhy2002.examples.lodgement.node.LodgementValidationErrorListAdaptor;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.ValidationErrorListAdaptor;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;

@Module(includes = {ManifestModule.class})
public abstract class DefaultProfileModule {

    @Binds
    @Singleton
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ApplicationNode provideApplicationNode(ApplicationNodeImpl impl);

    @Binds
    abstract ToCurrentNoEarlierThanFromPreviousRule provideToCurrentNoEarlierThanFromPreviousRule(ToCurrentNoEarlierThanFromPreviousRuleImpl impl);

    @Binds
    abstract TitleGenderMatchRule provideTitleGenderMatchRule(TitleGenderMatchRuleImpl impl);

    @Binds
    abstract ToCurrentNoEarlierThanToPreviousRule provideToCurrentNoEarlierThanToPreviousRule(ToCurrentNoEarlierThanToPreviousRuleImpl impl);

    @Binds
    abstract TrustTypeChangedRule provideTrustTypeChangedRule(TrustTypeChangedRuleImpl impl);

    @Binds
    abstract UpdateAddressRefListRule provideUpdateAddressRefListRule(UpdateAddressRefListRuleImpl impl);

    @Binds
    abstract AddExistingApplicantsRule provideAddExistingApplicantsRule(AddExistingApplicantsRuleImpl impl);

    @Binds
    abstract UpdateRelatedPartyNodeLabelRule provideUpdateRelatedPartyNodeLabelRuleImpl(UpdateRelatedPartyNodeLabelRuleImpl impl);

    @Binds
    abstract AddExistingHoldersRule provideAddExistingHoldersRule(AddExistingHoldersRuleImpl impl);

    @Binds
    abstract AddNewPersonHolderRule provideAddNewPersonHolderRule(AddNewPersonHolderRuleImpl impl);

    @Binds
    abstract AddNewCompanyHolderRule provideAddNewCompanyHolderRule(AddNewCompanyHolderRuleImpl impl);

    @Binds
    abstract AddNewCompanyApplicantRule provideAddNewCompanyApplicantRule(AddNewCompanyApplicantRuleImpl impl);

    @Binds
    abstract ProductGroupChangedRule provideProductGroupChangedRule(ProductGroupChangedRuleImpl impl);

    @Binds
    abstract AddNewPersonApplicantRule provideAddNewPersonApplicantRule(AddNewPersonApplicantRuleImpl impl);

    @Binds
    abstract AtLeastOnePrimaryApplicantRule provideAtLeastOnePrimaryApplicantRule(AtLeastOnePrimaryApplicantRuleImpl impl);

    @Binds
    abstract AtMostOnePrimaryApplicantRule provideAtMostOnePrimaryApplicantRule(AtMostOnePrimaryApplicantRuleImpl impl);

    @Binds
    abstract ChangeApplicationTypeRule provideChangeApplicationTypeRule(ChangeApplicationTypeRuleImpl impl);

    @Binds
    abstract OwnershipRequiredValidationRule provideOwnershipRequiredValidationRule(OwnershipRequiredValidationRuleImpl impl);

    @Binds
    abstract UpdateTotalOwnershipRule provideUpdateTotalOwnershipRule(UpdateTotalOwnershipRuleImpl impl);

    @Binds
    abstract ChangeFocusErrorRule provideChangeFocusErrorRule(ChangeFocusErrorRuleImpl impl);

    @Binds
    abstract ValidationErrorListAdaptor provideValidationErrorListAdaptor(LodgementValidationErrorListAdaptor impl);

    @Binds
    abstract DobRangeValidationRule provideDobRangeValidationRule(DobRangeValidationRuleImpl impl);

    @Binds
    abstract AustralianTelephoneRule provideAustralianTelephoneRule(AustralianTelephoneRuleImpl impl);

    @Binds
    abstract EmploymentEndedNoEarlierThanEmploymentStartedRule provideEmploymentEndedNoEarlierThanEmploymentStartedRule(EmploymentEndedNoEarlierThanEmploymentStartedRuleImpl impl);

    @Binds
    abstract EmploymentTypeChangedRule provideEmploymentTypeChangedRule(EmploymentTypeChangedRuleImpl impl);

    @Binds
    abstract FinancialPositionChangedRule provideFinancialPositionChangedRule(FinancialPositionChangedRuleImpl impl);

    @Binds
    abstract FromPreviousNoEarlierThanToPreviousRule provideFromPreviousNoEarlierThanToPreviousRule(FromPreviousNoEarlierThanToPreviousRuleImpl impl);

    @Binds
    abstract HomeOrWorkPhoneRequiredRule provideHomeOrWorkPhoneRequiredRule(HomeOrWorkPhoneRequiredRuleImpl impl);

    @Binds
    abstract MonthYearNotInFutureRule provideMonthYearNotInFutureRule(MonthYearNotInFutureRuleImpl impl);

    @Binds
    abstract ResponsibleSignificantChangeRule provideResponsibleSignificantChangeRule(ResponsibleSignificantChangeRuleImpl impl);

    @Binds
    abstract ShowErrorListRule provideShowErrorListRule(ShowErrorListRuleImpl impl);

    @Binds
    abstract TelephoneCompleteRule provideTelephoneCompleteRule(TelephoneCompleteRuleImpl impl);

    @Binds
    abstract AddExistingPeopleRule provideAddExistingPeopleRule(AddExistingPeopleRuleImpl impl);

    @Binds
    abstract AddNewPersonRule provideAddNewPersonRule(AddNewPersonRuleImpl impl);

    @Binds
    abstract UsedAsSecurityFlagChangeRule provideUsedAsSecurityFlagChangeRule(UsedAsSecurityFlagChangeRuleImpl impl);

    @Binds
    abstract AddNewThirdPartyApplicantRule provideAddNewThirdPartyApplicantRule(AddNewThirdPartyApplicantRuleImpl impl);

    @Binds
    abstract DistributePercentageRule provideDistributePercentageRule(DistributePercentageRuleImpl impl);

    @Binds
    abstract BeingPurchasedFlagChangeRule provideBeingPurchasedFlagChangeRule(BeingPurchasedFlagChangeRuleImpl impl);

    @Binds
    abstract DoNotLoadEndedDateForCurrentRecordRule provideDoNotLoadEndedDateForCurrentRecordRule(DoNotLoadEndedDateForCurrentRecordRuleImpl impl);

    @Binds
    abstract UpdateProductNodeLabelRule provideUpdateProductNodeLabelRule(UpdateProductNodeLabelRuleImpl impl);

    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(LegalActionNodeRuleProviderImpl impl);

    @Binds
    abstract PersonNodeRuleProvider providePersonNodeRuleProvider(PersonNodeRuleProviderImpl impl);

    @Binds
    abstract CompanyNodeRuleProvider provideCompanyNodeRuleProvider(CompanyNodeRuleProviderImpl impl);

    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(OtherIncomeTypeNodeRuleProviderImpl impl);

    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(RealEstateNodeRuleProviderImpl impl);

    @Binds
    abstract ApplicationNodeChildProvider provideApplicationNodeChildProvider(ApplicationNodeChildProviderImpl impl);

}

@RealEstateNodeScope
class RealEstateNodeRuleProviderImpl extends RealEstateNodeRuleProvider {

    @Inject
    public RealEstateNodeRuleProviderImpl() {
    }

    @Inject
    Provider<UpdateRealEstateNodeLabelRule> updateRealEstateNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(updateRealEstateNodeLabelRuleProvider.get());
    }
}

@OtherIncomeTypeNodeScope
class OtherIncomeTypeNodeRuleProviderImpl extends OtherIncomeTypeNodeRuleProvider {

    private final OtherIncomeNode parent;

    @Inject
    public OtherIncomeTypeNodeRuleProviderImpl(OtherIncomeNode parent) {
        this.parent = parent;
    }

    @Override
    public void initializeState(OtherIncomeTypeNode node) {
        super.initializeState(node);

        if (parent.getParent() instanceof CompanyOtherIncomeListNode) {
            node.setOptions(ApplicationNodeConstants.COMPANY_OTHER_INCOME_TYPE);
            node.setValue("Add Back");
        } else {
            node.setOptions(ApplicationNodeConstants.PERSON_OTHER_INCOME_TYPE);
            node.setValue("Other Income");
        }
    }

    @Inject
    Provider<OtherIncomeTypeChangeRuleImpl> otherIncomeTypeChangeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(otherIncomeTypeChangeRuleProvider.get());
    }
}

@PersonNodeScope
class PersonNodeRuleProviderImpl extends PersonNodeRuleProvider {

    @Inject
    public PersonNodeRuleProviderImpl() {
    }

    @Inject
    Provider<UpdatePersonNodeLabelRuleImpl> updatePersonNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(updatePersonNodeLabelRuleProvider.get());
    }
}

@CompanyNodeScope
class CompanyNodeRuleProviderImpl extends CompanyNodeRuleProvider {

    @Inject
    public CompanyNodeRuleProviderImpl() {
    }

    @Inject
    Provider<UpdateCompanyNodeLabelRuleImpl> updateCompanyNodeLabelRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(updateCompanyNodeLabelRuleProvider.get());
    }
}

@LegalActionNodeScope
class LegalActionNodeRuleProviderImpl extends LegalActionNodeRuleProvider {

    @Inject
    public LegalActionNodeRuleProviderImpl() {
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        StringEnableSiblingRule rule = stringEnableSiblingRuleProvider.get();
        rule.setSiblingName("creditHistoryListNode");
        createdRules.add(rule);
    }
}

@Singleton
class ApplicationNodeChildProviderImpl extends ApplicationNodeChildProvider {

    @Inject
    public ApplicationNodeChildProviderImpl() {
    }

    @Override
    protected AddressRefListNode newAddressRefListNode(ApplicationNode parent, String name) {
        return new AddressRefListNodeImpl(parent, name);
    }
}