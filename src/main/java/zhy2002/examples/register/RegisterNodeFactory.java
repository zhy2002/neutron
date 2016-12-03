package zhy2002.examples.register;

import jsinterop.annotations.JsType;

@JsType(namespace = "GWT")
public class RegisterNodeFactory {

    public static RegisterNode create() {
        RegisterClassRegistry registerClassRegistry = new RegisterClassRegistry();
        RegisterNodeContextAbstract context = new RegisterNodeContextAbstract(registerClassRegistry);
        RegisterNode registerNode = context.getRootNode();
        return registerNode;
    }
}
