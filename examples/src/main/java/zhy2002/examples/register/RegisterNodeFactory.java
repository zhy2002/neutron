package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.config.RegisterNodeImplClassRegistry;
import zhy2002.examples.register.gen.RegisterNode;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class RegisterNodeFactory {

    public static RegisterNode create() {
        ClassRegistryImpl registerClassRegistry = new RegisterNodeImplClassRegistry();
        RegisterNodeContext context = new RegisterNodeContext(registerClassRegistry);
        RegisterNode registerNode = context.getRootNode();
        return registerNode;
    }
}
