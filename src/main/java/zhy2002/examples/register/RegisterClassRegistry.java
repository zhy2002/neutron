package zhy2002.examples.register;

import zhy2002.examples.register.rule.*;
import zhy2002.examples.register.rule.impl.*;
import zhy2002.neutron.ClassRegistryImpl;

/**
 * The generated factory register with all the default implementation instances.
 */
public class RegisterClassRegistry extends ClassRegistryImpl {

    public RegisterClassRegistry() {
        loadChildNodeFactories();
        loadRuleFactories();
        loadStateChangeEventFactories();
    }

    private void loadChildNodeFactories() {
        setInstance(UsernameNodeFactory.class, new UsernameNodeFactory());
        setInstance(PasswordNodeFactory.class, new PasswordNodeFactory());
        setInstance(ErrorListNodeFactory.class, new ErrorListNodeFactory());
        setInstance(ErrorNodeFactory.class, new ErrorNodeFactory());
        setInstance(EmailNodeFactory.class, new EmailNodeFactory());
        setInstance(RepeatPasswordNodeFactory.class, new RepeatPasswordNodeFactory());
        setInstance(ReceiveOffersNodeFactory.class, new ReceiveOffersNodeFactory());
    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(String.class, new StringStateChangeEventFactory());
    }

    private void loadRuleFactories() {
        setInstance(UsernameLengthRule.Factory.class, new UsernameLengthRuleImpl.Factory());
        setInstance(UsernameInvalidCharRule.Factory.class, new UsernameInvalidCharRuleImpl.Factory());
        setInstance(ClearHasErrorRule.Factory.class, new ClearHasErrorRuleImpl.Factory());
        setInstance(SetHasErrorRule.Factory.class, new SetHasErrorRuleImpl.Factory());
        setInstance(DefaultEmailByUsernameRule.Factory.class, new DefaultEmailByUsernameRuleImpl.Factory());
        setInstance(EmailChangeReasonRule.Factory.class, new EmailChangeReasonRuleImpl.Factory());
        setInstance(UsernameIsRequiredRule.Factory.class, new UsernameIsRequiredRuleImpl.Factory());

    }
}
