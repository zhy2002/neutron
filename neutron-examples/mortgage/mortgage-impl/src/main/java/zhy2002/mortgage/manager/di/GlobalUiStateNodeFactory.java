package zhy2002.mortgage.manager.di;

import jsinterop.annotations.JsType;
import zhy2002.mortgage.manager.gen.node.GlobalUiStateNode;
import zhy2002.neutron.config.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class GlobalUiStateNodeFactory {

    public static GlobalUiStateNode create() {
        return DaggerDefaultProfileComponent.create().provideGlobalUiStateNodeContext().getRootNode();
    }

}



