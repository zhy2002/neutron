package zhy2002.examples.register;

import zhy2002.examples.register.rule.UsernameInvalidCharRule;
import zhy2002.examples.register.rule.UsernameLengthRule;
import zhy2002.examples.register.rule.impl.UsernameInvalidCharRuleImpl;
import zhy2002.examples.register.rule.impl.UsernameLengthRuleImpl;
import zhy2002.neutron.ClassRegistryImpl;

/**
 * The generated factory register with all the default implementation instances.
 */
public class RegisterFactoryRegistry extends ClassRegistryImpl {

    private RegisterFactoryRegistry() {
    }

    public static RegisterFactoryRegistry create() {
        RegisterFactoryRegistry registry = new RegisterFactoryRegistry();
        registerRuleFactories(registry);
        return registry;
    }

    private static void registerRuleFactories(RegisterFactoryRegistry registry) {
        registry.setInstance(UsernameLengthRule.Factory.class, new UsernameLengthRuleImpl.Factory());
        registry.setInstance(UsernameInvalidCharRule.Factory.class, new UsernameInvalidCharRuleImpl.Factory());
    }
}
