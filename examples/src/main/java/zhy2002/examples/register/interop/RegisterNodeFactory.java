package zhy2002.examples.register.interop;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.config.RegisterNodeImplClassRegistry;
import zhy2002.examples.register.gen.RegisterNode;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.neutron.ClassRegistryImpl;

@JsType(namespace = "GWT")
public class RegisterNodeFactory {

    public static RegisterNode create() {
        ClassRegistryImpl registerClassRegistry = new RegisterNodeImplClassRegistry();
        RegisterNodeContext context = new RegisterNodeContext(registerClassRegistry);
        RegisterNode registerNode = context.getRootNode();
        return registerNode;
    }
}
