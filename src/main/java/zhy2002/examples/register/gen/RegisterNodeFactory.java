package zhy2002.examples.register.gen;

import jsinterop.annotations.JsType;

@JsType(namespace = "GWT")
public class RegisterNodeFactory {

    public static RegisterNode create() {
        RegisterClassRegistry registerClassRegistry = new RegisterClassRegistry();
        RegisterNodeContext context = new RegisterNodeContext(registerClassRegistry);
        RegisterNode registerNode = context.getRootNode();
        return registerNode;
    }
}
