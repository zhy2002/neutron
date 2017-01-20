package zhy2002.examples.app;

import jsinterop.annotations.JsType;
import zhy2002.examples.app.gen.LodgementNode;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.impl.LodgementNodeImplClassRegistry;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class LodgementNodeFactory {

    public static LodgementNode create() {
        ClassRegistryImpl classRegistry = new LodgementNodeImplClassRegistry();
        LodgementNodeContext context = new LodgementNodeContext(classRegistry);
        return context.getRootNode();
    }
}
