package zhy2002.neutron.examples.register.di;

import jsinterop.annotations.JsType;
import zhy2002.neutron.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.core.config.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class RegisterNodeFactory {

    public static RegisterNode create() {
        return DaggerDefaultProfileComponent.create().provideRegisterNodeContext().getRootNode();
    }

    //todo factory methods for other profiles
}



