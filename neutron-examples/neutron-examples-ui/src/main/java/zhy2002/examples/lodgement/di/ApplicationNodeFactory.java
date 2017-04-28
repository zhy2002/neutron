package zhy2002.examples.lodgement.di;

import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.di.ContextInstanceModule;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ApplicationNodeFactory {

    public static ApplicationNode create() {
        return DaggerDefaultProfileComponent.create().provideApplicationNodeContext().getRootNode();
    }

    public static ApplicationNode restore(NodeDataStore nodeDataStore) {
        return DaggerCbaProfileComponent
                .builder()
                .contextInstanceModule(new ContextInstanceModule(nodeDataStore))
                .build()
                .provideApplicationNodeContext()
                .getRootNode();
    }

    //todo factory methods for other profiles

    public static ApplicationNode createCba() {
        return DaggerCbaProfileComponent.create().provideApplicationNodeContext().getRootNode();
    }
}



