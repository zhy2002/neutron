package zhy2002.examples.lodgement.gen;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;


public class ApplicationNodeContextConfigurer implements ContextConfigurer<ApplicationNodeContext> {

    @Inject
    protected ApplicationNodeContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.DOMAIN_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(ApplicationNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        NodeConfiguration configIdNode = configuration.getConfig(IdNode.class);
            configIdNode.setConfigValue("idNode/@loadWithParent", true);
        NodeConfiguration configAddressRefNode = configuration.getConfig(AddressRefNode.class);
            configAddressRefNode.setConfigValue("addressRefNode/@removeEmpty", true);
        NodeConfiguration configPersonNode = configuration.getConfig(PersonNode.class);
            configPersonNode.setConfigValue("personNode/@selectedName", "personGeneralNode");
    }
}
