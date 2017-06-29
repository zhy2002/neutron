package zhy2002.mortgage.login.di;


import jsinterop.annotations.JsType;
import zhy2002.mortgage.login.gen.node.LoginNode;
import zhy2002.neutron.config.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class LoginNodeFactory {

    public static LoginNode create() {
        return DaggerDefaultProfileComponent.create().provideLoginNodeContext().getRootNode();
    }
}
