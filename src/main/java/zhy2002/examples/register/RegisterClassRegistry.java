package zhy2002.examples.register;

import zhy2002.examples.register.event.ErrorNodeAddEvent;
import zhy2002.examples.register.event.ErrorNodeRemoveEvent;
import zhy2002.examples.register.rule.*;
import zhy2002.examples.register.rule.impl.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.event.BooleanStateChangeEventFactory;
import zhy2002.neutron.event.StringStateChangeEventFactory;

/**
 * The generated factory register with all the default implementation instances.
 */
public class RegisterClassRegistry extends ClassRegistryImpl {

    public RegisterClassRegistry() {
        loadRuleFactories();
        loadChildNodeFactories();
        loadStateChangeEventFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
    }

    private void loadRuleFactories() {
        setUiNodeRuleFactory(UsernameLengthRule.class, UsernameLengthRule::new);
        setUiNodeRuleFactory(UsernameInvalidCharRule.class, UsernameInvalidCharRuleImpl::new);
        setUiNodeRuleFactory(ClearHasErrorRule.class, ClearHasErrorRuleImpl::new);
        setUiNodeRuleFactory(SetHasErrorRule.class, SetHasErrorRuleImpl::new);
        setUiNodeRuleFactory(DefaultEmailByUsernameRule.class, DefaultEmailByUsernameRuleImpl::new);
        setUiNodeRuleFactory(EmailChangeReasonRule.class, EmailChangeReasonRuleImpl::new);
        setUiNodeRuleFactory(UsernameIsRequiredRule.class, UsernameIsRequiredRuleImpl::new);
        setUiNodeRuleFactory(PasswordIsStrongRule.class, PasswordIsStrongRule::new);
        setUiNodeRuleFactory(RepeatPasswordRule.class, RepeatPasswordRule::new);
        setUiNodeRuleFactory(EmailIsRequiredWhenReceiveOffersRule.class, EmailIsRequiredWhenReceiveOffersRule::new);
        setUiNodeRuleFactory(ValidateEmailIsRequiredRule.class, ValidateEmailIsRequiredRule::new);
    }

    private void loadChildNodeFactories() {
        setChildNodeFactory(UsernameNode.class, new UsernameNodeFactory());
        setChildNodeFactory(PasswordNode.class, new PasswordNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(EmailNode.class, new EmailNodeFactory());
        setChildNodeFactory(RepeatPasswordNode.class, new RepeatPasswordNodeFactory());
        setChildNodeFactory(ReceiveOffersNode.class, new ReceiveOffersNodeFactory());
    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(String.class, new StringStateChangeEventFactory());
        this.setStateChangeEventFactory(Boolean.class, new BooleanStateChangeEventFactory());
    }

    private void loadNodeAddEventFactories() {
        this.setNodeAddEventFactory(ErrorNode.class, ErrorNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        this.setNodeRemoveEventFactory(ErrorNode.class, ErrorNodeRemoveEvent::new);
    }


}
