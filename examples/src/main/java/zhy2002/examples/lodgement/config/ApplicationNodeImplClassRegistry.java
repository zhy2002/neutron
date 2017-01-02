package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.impl.*;
import zhy2002.neutron.ClassRegistryImpl;


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
    }
}
