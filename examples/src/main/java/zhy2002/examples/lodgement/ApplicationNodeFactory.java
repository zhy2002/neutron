package zhy2002.examples.lodgement;


import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.neutron.ClassRegistryImpl;

@JsType(namespace = "GWT")
public class ApplicationNodeFactory {

    public static ApplicationNode create() {
        ClassRegistryImpl classRegistry = new ClassRegistryImpl();
        ApplicationNodeContext context = new ApplicationNodeContext(classRegistry);
        return context.getRootNode();
    }
}
