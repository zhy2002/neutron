package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.neutron.ClassRegistryImpl;

@JsType(namespace = "GWT")
public class RegisterNodeFactory {

    public static RegisterNode create() {
        RegisterClassRegistry registerClassRegistry = new RegisterClassRegistry();
        RegisterNodeContext context = new RegisterNodeContext(registerClassRegistry);
        RegisterNode registerNode = context.getRootNode();
        return registerNode;
    }
}
