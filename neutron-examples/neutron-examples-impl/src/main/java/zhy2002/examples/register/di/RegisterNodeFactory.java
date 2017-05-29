package zhy2002.examples.register.di;

import jsinterop.annotations.JsType;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class RegisterNodeFactory {

    public static RegisterNode create() {
        return DaggerDefaultProfileComponent.create().provideRegisterNodeContext().getRootNode();
    }

    //todo factory methods for other profiles
}



