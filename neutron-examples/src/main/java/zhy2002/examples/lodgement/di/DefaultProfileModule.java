package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeScope;
import zhy2002.examples.lodgement.gen.di.ManifestModule;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.node.ApplicationNodeImpl;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;

@Module(includes = {ManifestModule.class, CustomModule.class})
public abstract class DefaultProfileModule {

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
    abstract UpdatePersonNodeLabelRule provideUpdatePersonNodeLabelRule(UpdatePersonNodeLabelRuleImpl impl);

    @Binds
    abstract AddExistingApplicantsRule provideAddExistingApplicantsRule(AddExistingApplicantsRuleImpl impl);

    @Binds
    abstract AddNewCompanyApplicantRule provideAddNewCompanyApplicantRule(AddNewCompanyApplicantRuleImpl impl);

    @Binds
    abstract AddNewPersonApplicantRule provideAddNewPersonApplicantRule(AddNewPersonApplicantRuleImpl impl);

    @Binds
    abstract AtLeastOnePrimaryApplicantRule provideAtLeastOnePrimaryApplicantRule(AtLeastOnePrimaryApplicantRuleImpl impl);

    @Binds
    abstract AtMostOnePrimaryApplicantRule provideAtMostOnePrimaryApplicantRule(AtMostOnePrimaryApplicantRuleImpl impl);

    @Binds
    abstract ChangeApplicationTypeRule provideChangeApplicationTypeRule(ChangeApplicationTypeRuleImpl impl);

    @Binds
    abstract ChangeFocusErrorRule provideChangeFocusErrorRule(ChangeFocusErrorRuleImpl impl);

    @Binds
    abstract CreateErrorNodeRule provideCreateErrorNodeRule(CreateErrorNodeRuleImpl impl);

    @Binds
    abstract CreditCardClearingFlagChangedRule provideCreditCardClearingFlagChangedRule(CreditCardClearingFlagChangedRuleImpl impl);

    @Binds
    abstract DobRangeValidationRule provideDobRangeValidationRule(DobRangeValidationRuleImpl impl);

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
    abstract OtherIncomeTypeChangeRule provideOtherIncomeTypeChangeRule(OtherIncomeTypeChangeRuleImpl impl);

    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(LegalActionNodeRuleProviderImpl impl);
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