package zhy2002.mortgage.application.di;

import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;
import zhy2002.mortgage.application.banka.di.DaggerBankAProfileComponent;
import zhy2002.mortgage.application.bankb.di.DaggerBankBProfileComponent;
import zhy2002.mortgage.application.gen.ApplicationNodeContext;
import zhy2002.mortgage.application.gen.node.ApplicationNode;
import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.data.NodeDataStore;
import zhy2002.neutron.di.ContextInstanceModule;
import zhy2002.neutron.di.ProfileComponent;
import zhy2002.neutron.interop.ProfileComponentFactory;

@JsType(namespace = NeutronConstants.JS_NAMESPACE)
public class ApplicationNodeFactory {

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
    }

    public static ApplicationNode create(String profileName, NodeDataStore store) {
        ProfileComponent<ApplicationNodeContext> component = profileComponentFactory.create(profileName, store);
        return component == null ? null : component.provideContext().getRootNode();
    }

    public static String[] getProfileNames() {
        return profileComponentFactory.getAllProfileNames();
    }

}