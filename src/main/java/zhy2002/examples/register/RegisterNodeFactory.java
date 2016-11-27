package zhy2002.examples.register;

import jsinterop.annotations.JsType;
import zhy2002.neutron.ClassRegistryImpl;

@JsType(namespace = "GWT")
public class RegisterNodeFactory {

    public static RegisterNode create() {
        ClassRegistryImpl factoryRegistry = RegisterFactoryRegistry.create();
        RegisterNodeContext context = new RegisterNodeContext(factoryRegistry);
        RegisterNode registerNode = context.getRootNode();
        return registerNode;
    }
}
