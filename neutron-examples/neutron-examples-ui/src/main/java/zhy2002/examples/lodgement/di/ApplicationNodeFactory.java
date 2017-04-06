package zhy2002.examples.lodgement.di;

import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ApplicationNodeFactory {

    public static ApplicationNode create() {
        return DaggerDefaultProfileComponent.create().provideApplicationNodeContext().getRootNode();
    }

    //todo factory methods for other profiles

    public static ApplicationNode createCba() {
        return DaggerCbaProfileComponent.create().provideApplicationNodeContext().getRootNode();
    }
}



