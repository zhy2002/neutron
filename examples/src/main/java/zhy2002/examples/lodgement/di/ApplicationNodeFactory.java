package zhy2002.examples.lodgement.di;


import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ApplicationNodeFactory {

    public static ApplicationNode create() {
        return DaggerApplicationContextComponent.create().provideApplicationNodeContext().getRootNode();
    }
}
