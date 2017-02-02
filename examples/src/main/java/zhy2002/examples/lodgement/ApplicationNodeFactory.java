package zhy2002.examples.lodgement;


import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.di.DaggerContextComponent;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ApplicationNodeFactory {

    public static ApplicationNode create() {

        return DaggerContextComponent.create().provideApplicationNodeContext().getRootNode();
    }
}
