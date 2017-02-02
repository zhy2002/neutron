package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.impl.*;
import zhy2002.neutron.ChildNodeFactory;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeRuleFactory;


public class ApplicationNodeImplClassRegistry extends ClassRegistryImpl {

    public ApplicationNodeImplClassRegistry() {
        loadNodes();
        loadNodeConfig();
        loadRuleFactories();
    }

    private void loadNodes() {
        this.setChildNodeFactory(AddressListNode.class, AddressListNodeImpl::new);
    }

    private void loadNodeConfig() {
        setUiNodeConfig(ContactAddressNode.class, new CurrentAddressConfig());
        setUiNodeConfig(EmploymentEndedNode.class, new EmploymentEndedNodeConfig());
    }

    private void loadRuleFactories() {

        setUiNodeRuleFactory(CreateErrorNodeRule.class, CreateErrorNodeRuleImpl::new);
        setUiNodeRuleFactory(AtLeastOnePrimaryApplicantRule.class, AtLeastOnePrimaryApplicantRuleImpl::new);
        setUiNodeRuleFactory(AtMostOnePrimaryApplicantRule.class, AtMostOnePrimaryApplicantRuleImpl::new);
        setUiNodeRuleFactory(ChangeApplicationTypeRule.class, ChangeApplicationTypeRuleImpl::new);
        setUiNodeRuleFactory(ShowErrorListRule.class, ShowErrorListRuleImpl::new);
        setUiNodeRuleFactory(ChangeFocusErrorRule.class, ChangeFocusErrorRuleImpl::new);
        setUiNodeRuleFactory(TitleGenderMatchRule.class, TitleGenderMatchRuleImpl::new);
        setUiNodeRuleFactory(UpdatePersonNodeLabelRule.class, UpdatePersonNodeLabelRuleImpl::new);
        setUiNodeRuleFactory(HomeOrWorkPhoneRequiredRule.class, HomeOrWorkPhoneRequiredRuleImpl::new);
        setUiNodeRuleFactory(PersonSignificantChangeRule.class, PersonSignificantChangeRuleImpl::new);
        setUiNodeRuleFactory(EmploymentTypeChangedRule.class, EmploymentTypeChangedRuleImpl::new);
        setUiNodeRuleFactory(PersonOtherIncomeTypeChangeRule.class, PersonOtherIncomeTypeChangeRuleImpl::new);
        setUiNodeRuleFactory(FromPreviousNoEarlierThanToPreviousRule.class, FromPreviousNoEarlierThanToPreviousRuleImpl::new);
        setUiNodeRuleFactory(ToCurrentNoEarlierThanToPreviousRule.class, ToCurrentNoEarlierThanToPreviousRuleImpl::new);
        setUiNodeRuleFactory(ToCurrentNoEarlierThanFromPreviousRule.class, ToCurrentNoEarlierThanFromPreviousRuleImpl::new);

        setUiNodeRuleFactory(TelephoneCompleteRule.class, new UiNodeRuleFactory<TelephoneCompleteRule, TelephoneNode<?>>() {
            @Override
            public TelephoneCompleteRule create(TelephoneNode<?> owner) {
                return new TelephoneCompleteRuleImpl(owner);
            }
        });
        setUiNodeRuleFactory(DobRangeValidationRule.class, new UiNodeRuleFactory<DobRangeValidationRule, DobNode<?>>() {
            @Override
            public DobRangeValidationRule create(DobNode<?> owner) {
                return new DobRangeValidationRuleImpl(owner);
            }
        });
        setUiNodeRuleFactory(MonthYearNotInFutureRule.class, new UiNodeRuleFactory<MonthYearNotInFutureRule, MonthYearNode<?>>() {
            @Override
            public MonthYearNotInFutureRule create(MonthYearNode<?> owner) {
                return new MonthYearNotInFutureRuleImpl(owner);
            }
        });

        setUiNodeRuleFactory(UpdateAddressRefListRule.class, new UiNodeRuleFactory<UpdateAddressRefListRule, AddressNode<?>>() {
            @Override
            public UpdateAddressRefListRuleImpl create(AddressNode<?> owner) {
                return new UpdateAddressRefListRuleImpl(owner);
            }
        });

    }
}
