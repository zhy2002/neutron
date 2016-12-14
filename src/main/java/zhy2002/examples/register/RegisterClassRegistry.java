package zhy2002.examples.register;

import zhy2002.examples.register.event.*;
import zhy2002.examples.register.rule.*;
import zhy2002.examples.register.rule.impl.DefaultEmailByUsernameRuleImpl;
import zhy2002.examples.register.rule.impl.EmailChangeReasonRuleImpl;
import zhy2002.examples.register.rule.impl.UsernameIsRequiredRuleImpl;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.StringUiNode;
import zhy2002.neutron.UiNodeRuleFactory;
import zhy2002.neutron.event.BigDecimalStateChangeEventFactory;
import zhy2002.neutron.event.BooleanStateChangeEventFactory;
import zhy2002.neutron.event.StringStateChangeEventFactory;
import zhy2002.neutron.event.ValidationErrorListStateChangeEventFactory;
import zhy2002.neutron.rule.PatternValidationRule;
import zhy2002.neutron.rule.ValidationErrorList;

import java.math.BigDecimal;

/**
 * The generated factory register with all the default implementation instances.
 */
public class RegisterClassRegistry extends ClassRegistryImpl {

    public RegisterClassRegistry() {
        loadChildNodeFactories();
        loadNodeConfig();
        loadRuleFactories();
        loadStateChangeEventFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();

    }

    private void loadChildNodeFactories() {
        setChildNodeFactory(UsernameNode.class, new UsernameNodeFactory());
        setChildNodeFactory(PasswordNode.class, new PasswordNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(EmailNode.class, new EmailNodeFactory());
        setChildNodeFactory(RepeatPasswordNode.class, new RepeatPasswordNodeFactory());
        setChildNodeFactory(ReceiveOffersNode.class, new ReceiveOffersNodeFactory());
        setChildNodeFactory(AgeNode.class, new AgeNodeFactory());
        setChildNodeFactory(OwnInvestmentPropertyNode.class, new OwnInvestmentPropertyNodeFactory());
        setChildNodeFactory(PropertyDetailsNode.class, new PropertyDetailsNodeFactory());
        setChildNodeFactory(PropertyAddressNode.class, new PropertyAddressNodeFactory());
        setChildNodeFactory(PropertyStateNode.class, new PropertyStateNodeFactory());
        setChildNodeFactory(CountryCodeNode.class, new CountryCodeFactory());
        setChildNodeFactory(AreaCodeNode.class, new AreaNodeFactory());
        setChildNodeFactory(PhoneNumberNode.class, new PhoneNumberNodeFactory());
        setChildNodeFactory(PhoneInfoNode.class, PhoneInfoNode::new);
    }

    private void loadNodeConfig() {
        this.setUiNodeConfig(PropertyDetailsNode.class, new PropertyDetailsInvestmentPropertyNodeConfig());
    }

    private void loadRuleFactories() {
        setUiNodeRuleFactory(UsernameLengthRule.class, UsernameLengthRule::new);
        setUiNodeRuleFactory(UsernameInvalidCharRule.class, UsernameInvalidCharRule::new);
        setUiNodeRuleFactory(SetHasErrorRule.class, SetHasErrorRule::new);
        setUiNodeRuleFactory(DefaultEmailByUsernameRule.class, DefaultEmailByUsernameRuleImpl::new);
        setUiNodeRuleFactory(EmailChangeReasonRule.class, EmailChangeReasonRuleImpl::new);
        setUiNodeRuleFactory(UsernameIsRequiredRule.class, UsernameIsRequiredRuleImpl::new);
        setUiNodeRuleFactory(PasswordIsStrongRule.class, PasswordIsStrongRule::new);
        setUiNodeRuleFactory(RepeatPasswordRule.class, RepeatPasswordRule::new);
        setUiNodeRuleFactory(EmailIsRequiredWhenReceiveOffersRule.class, EmailIsRequiredWhenReceiveOffersRule::new);
        setUiNodeRuleFactory(ValidateEmailIsRequiredRule.class, ValidateEmailIsRequiredRule::new);
        setUiNodeRuleFactory(PropertyStateRequiredRule.class, PropertyStateRequiredRule::new);
        setUiNodeRuleFactory(LoadInvestmentPropertyRule.class, LoadInvestmentPropertyRule::new);
        setUiNodeRuleFactory(AgeValidRule.class, AgeValidRule::new);
        setUiNodeRuleFactory(PhoneInfoAllOrNothingRule.class, PhoneInfoAllOrNothingRule::new);
        setUiNodeRuleFactory(PhoneFieldIsRequiredRule.class, PhoneFieldIsRequiredRule::new);
        setUiNodeRuleFactory(CreateErrorNodeRule.class, CreateErrorNodeRule::new);
        setUiNodeRuleFactory(PatternValidationRule.class, new UiNodeRuleFactory<PatternValidationRule, StringUiNode<?>>() {
            @Override //this anonymous class is required to work around a GWT compilation error.
            public PatternValidationRule create(StringUiNode<?> owner) {
                return new PatternValidationRule(owner);
            }
        });
    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(String.class, new StringStateChangeEventFactory());
        this.setStateChangeEventFactory(Boolean.class, new BooleanStateChangeEventFactory());
        this.setStateChangeEventFactory(BigDecimal.class, new BigDecimalStateChangeEventFactory());
        this.setStateChangeEventFactory(ValidationErrorList.class, new ValidationErrorListStateChangeEventFactory());
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(ErrorNode.class, ErrorNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        super.setNodeRemoveEventFactory(ErrorNode.class, ErrorNodeRemoveEvent::new);
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeLoadEvent::new);
        super.setNodeLoadEventFactory(RegisterNode.class, RegisterNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeUnloadEvent::new);
        super.setNodeUnloadEventFactory(RegisterNode.class, RegisterNodeUnloadEvent::new);
    }
}