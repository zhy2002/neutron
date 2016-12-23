package zhy2002.examples.register.config;

import zhy2002.examples.register.gen.PropertyDetailsNode;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.impl.*;
import zhy2002.neutron.ClassRegistryImpl;


public class RegisterNodeImplClassRegistry extends ClassRegistryImpl {

    public RegisterNodeImplClassRegistry() {
        loadNodeConfig();
        loadRuleFactories();
    }

    private void loadNodeConfig() {
        this.setUiNodeConfig(PropertyDetailsNode.class, new PropertyDetailsInvestmentPropertyNodeConfig());
    }

    private void loadRuleFactories() {

        setUiNodeRuleFactory(SetHasErrorRule.class, SetHasErrorRuleImpl::new);
        setUiNodeRuleFactory(DefaultEmailByUsernameRule.class, DefaultEmailByUsernameRuleImpl::new);
        setUiNodeRuleFactory(EmailChangeReasonRule.class, EmailChangeReasonRuleImpl::new);
        setUiNodeRuleFactory(PasswordIsStrongRule.class, PasswordIsStrongRuleImpl::new);
        setUiNodeRuleFactory(RepeatPasswordRule.class, RepeatPasswordRuleImpl::new);
        setUiNodeRuleFactory(EmailIsRequiredWhenReceiveOffersRule.class, EmailIsRequiredWhenReceiveOffersRuleImpl::new);
        setUiNodeRuleFactory(LoadInvestmentPropertyRule.class, LoadInvestmentPropertyRuleImpl::new);
        setUiNodeRuleFactory(PhoneInfoAllOrNothingRule.class, PhoneInfoAllOrNothingRuleImpl::new);
        setUiNodeRuleFactory(CreateErrorNodeRule.class, CreateErrorNodeRuleImpl::new);
        setUiNodeRuleFactory(UpdatePlanRule.class, UpdatePlanRuleImpl::new);

    }

}
