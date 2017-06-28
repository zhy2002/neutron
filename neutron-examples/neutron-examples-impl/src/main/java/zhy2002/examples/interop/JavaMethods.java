package zhy2002.examples.interop;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.examples.lodgement.banka.di.DaggerBankAProfileComponent;
import zhy2002.examples.lodgement.bankb.di.DaggerBankBProfileComponent;
import zhy2002.examples.lodgement.bankc.di.DaggerBankCProfileComponent;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.di.ContextInstanceModule;
import zhy2002.neutron.di.ProfileComponent;
import zhy2002.neutron.interop.ProfileComponentFactory;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(namespace = GLOBAL, name = "GWT")
public class JavaMethods {

    @JsIgnore
    private static final ProfileComponentFactory<ApplicationNodeContext> profileComponentFactory = new ProfileComponentFactory<>();

    static {
        profileComponentFactory.put(
                "BankA",
                nodeDataStore ->
                        DaggerBankAProfileComponent
                                .builder()
                                .contextInstanceModule(new ContextInstanceModule(nodeDataStore))
                                .build()
        );
        profileComponentFactory.put(
                "BankB",
                nodeDataStore ->
                        DaggerBankBProfileComponent
                                .builder()
                                .contextInstanceModule(new ContextInstanceModule(nodeDataStore))
                                .build()
        );
        profileComponentFactory.put(
                "BankC",
                nodeDataStore ->
                        DaggerBankCProfileComponent
                                .builder()
                                .contextInstanceModule(new ContextInstanceModule(nodeDataStore))
                                .build()
        );
    }

    public static ApplicationNode createApplicationNode(String profileName, NodeDataStore store) {
        ProfileComponent<ApplicationNodeContext> component = profileComponentFactory.create(profileName, store);
        return component == null ? null : component.provideContext().getRootNode();
    }

    public static String[] getApplicationProfileNames() {
        return profileComponentFactory.getAllProfileNames();
    }

}