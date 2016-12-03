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
        setInstance(UsernameLengthRule.Factory.class, new UsernameLengthRule.Factory());
        setInstance(UsernameInvalidCharRule.Factory.class, new UsernameInvalidCharRuleImpl.Factory());
        setInstance(ClearHasErrorRule.Factory.class, new ClearHasErrorRuleImpl.Factory());
        setInstance(SetHasErrorRule.Factory.class, new SetHasErrorRuleImpl.Factory());
        setInstance(DefaultEmailByUsernameRule.Factory.class, new DefaultEmailByUsernameRuleImpl.Factory());
        setInstance(EmailChangeReasonRule.Factory.class, new EmailChangeReasonRuleImpl.Factory());
        setInstance(UsernameIsRequiredRule.Factory.class, new UsernameIsRequiredRuleImpl.Factory());
        setInstance(PasswordIsStrongRule.Factory.class, new PasswordIsStrongRule.Factory());
        setInstance(RepeatPasswordRule.Factory.class, new RepeatPasswordRule.Factory());
        setInstance(EmailIsRequiredWhenReceiveOffersRule.Factory.class, new EmailIsRequiredWhenReceiveOffersRule.Factory());
        setInstance(ValidateEmailIsRequiredRule.Factory.class, new ValidateEmailIsRequiredRule.Factory());
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
