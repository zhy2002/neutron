package zhy2002.examples.app.di;

import jsinterop.annotations.JsType;
import zhy2002.examples.app.gen.node.LodgementNode;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class LodgementNodeFactory {

    public static LodgementNode create() {
        return DaggerDefaultProfileComponent.create().provideLodgementNodeContext().getRootNode();
    }

    //todo factory methods for other profiles
}



