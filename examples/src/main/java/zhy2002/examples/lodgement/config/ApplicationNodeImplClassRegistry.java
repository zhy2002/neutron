package zhy2002.examples.lodgement.config;

import zhy2002.examples.lodgement.gen.rule.AtLeastOnePrimaryApplicantRule;
import zhy2002.examples.lodgement.gen.rule.CreateErrorNodeRule;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.impl.AtLeastOnePrimaryApplicantRuleImpl;
import zhy2002.examples.lodgement.impl.CreateErrorNodeRuleImpl;
import zhy2002.examples.lodgement.impl.ShowErrorListRuleImpl;
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
    }
}
