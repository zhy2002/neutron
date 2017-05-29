package zhy2002.neutron.interop;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.cba.di.DaggerCbaProfileComponent;
import zhy2002.examples.lodgement.nab.di.DaggerNabProfileComponent;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.di.ContextInstanceModule;
import zhy2002.neutron.di.ProfileComponent;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(namespace = GLOBAL, name = "GWT")
public class JavaMethods {

    @JsIgnore
    private static final ProfileComponentFactory<ApplicationNodeContext> profileComponentFactory = new ProfileComponentFactory<>();

    static {
        profileComponentFactory.put(
                "nab",
                nodeDataStore ->
                        DaggerNabProfileComponent
                                .builder()
                                .contextInstanceModule(new ContextInstanceModule(nodeDataStore))
                                .build()
        );
        profileComponentFactory.put(
                "cba",
                nodeDataStore ->
                        DaggerCbaProfileComponent
                                .builder()
                                .contextInstanceModule(new ContextInstanceModule(nodeDataStore))
                                .build()
        );
    }

    public static ApplicationNode createApplicationNode(String profileName, NodeDataStore store) {
        ProfileComponent<ApplicationNodeContext> component = profileComponentFactory.create(profileName, store);
        return component == null ? null : component.provideContext().getRootNode();
    }
}