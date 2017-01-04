package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.ContactNode;
import zhy2002.examples.lodgement.gen.TelephoneNode;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.impl.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeRuleFactory;


public class ApplicationNodeImplClassRegistry extends ClassRegistryImpl {

    public ApplicationNodeImplClassRegistry() {
        loadNodeConfig();
        loadRuleFactories();
    }

    private void loadNodeConfig() {
    }

    private void loadRuleFactories() {

        setUiNodeRuleFactory(CreateErrorNodeRule.class, CreateErrorNodeRuleImpl::new);
        setUiNodeRuleFactory(AtLeastOnePrimaryApplicantRule.class, AtLeastOnePrimaryApplicantRuleImpl::new);
        setUiNodeRuleFactory(ShowErrorListRule.class, ShowErrorListRuleImpl::new);
        setUiNodeRuleFactory(UpdateSelectedIndexRule.class, UpdateSelectedIndexRuleImpl::new);
        setUiNodeRuleFactory(ChangeFocusErrorRule.class, ChangeFocusErrorRuleImpl::new);
        setUiNodeRuleFactory(TitleGenderMatchRule.class, TitleGenderMatchRuleImpl::new);
        setUiNodeRuleFactory(TelephoneCompleteRule.class, new UiNodeRuleFactory<TelephoneCompleteRule, TelephoneNode<?>>() {
            @Override
            public TelephoneCompleteRule create(TelephoneNode<?> owner) {
                return new TelephoneCompleteRuleImpl(owner);
            }
        });
        setUiNodeRuleFactory(HomeOrWorkPhoneRequiredRule.class, HomeOrWorkPhoneRequiredRuleImpl::new);
    }
}
