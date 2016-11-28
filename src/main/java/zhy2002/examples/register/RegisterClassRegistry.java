package zhy2002.examples.register;

import zhy2002.examples.register.rule.UsernameInvalidCharRuleFactory;
import zhy2002.examples.register.rule.UsernameLengthRuleFactory;
import zhy2002.examples.register.rule.impl.UsernameInvalidCharRuleImplFactory;
import zhy2002.examples.register.rule.impl.UsernameLengthRuleImplFactory;
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
        this.setInstance(UsernameNodeFactory.class, new UsernameNodeFactory());
        this.setInstance(PasswordNodeFactory.class, new PasswordNodeFactory());
        this.setInstance(ErrorListNodeFactory.class, new ErrorListNodeFactory());
        this.setInstance(ErrorNodeFactory.class, new ErrorNodeFactory());
        this.setInstance(EmailNodeFactory.class, new EmailNodeFactory());
    }

    private void loadStateChangeEventFactories() {
        this.setStateChangeEventFactory(String.class, new StringStateChangeEventFactory());
    }

    private void loadRuleFactories() {
        this.setInstance(UsernameLengthRuleFactory.class, new UsernameLengthRuleImplFactory());
        this.setInstance(UsernameInvalidCharRuleFactory.class, new UsernameInvalidCharRuleImplFactory());
    }
}
