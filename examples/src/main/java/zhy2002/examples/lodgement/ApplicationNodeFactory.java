package zhy2002.examples.lodgement;


import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.config.ApplicationNodeImplClassRegistry;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.impl.ApplicationNodeContextImpl;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.util.NeutronConstants;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ApplicationNodeFactory {

    public static ApplicationNode create() {
        ClassRegistryImpl classRegistry = new ApplicationNodeImplClassRegistry();
        ApplicationNodeContext context = new ApplicationNodeContextImpl(classRegistry);
        return context.getRootNode();
    }
}
