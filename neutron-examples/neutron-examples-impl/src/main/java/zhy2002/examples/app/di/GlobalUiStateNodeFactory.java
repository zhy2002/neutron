package zhy2002.examples.app.di;

import jsinterop.annotations.JsType;
import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.neutron.config.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class GlobalUiStateNodeFactory {

    public static GlobalUiStateNode create() {
        return DaggerDefaultProfileComponent.create().provideGlobalUiStateNodeContext().getRootNode();
    }

}



