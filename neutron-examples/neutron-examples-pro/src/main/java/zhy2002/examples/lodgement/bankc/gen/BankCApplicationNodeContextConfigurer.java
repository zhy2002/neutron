package zhy2002.examples.lodgement.bankc.gen;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;


public class BankCApplicationNodeContextConfigurer implements ContextConfigurer<ApplicationNodeContext> {

    @Inject
    protected BankCApplicationNodeContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.PROFILE_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(ApplicationNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        NodeConfiguration configApplicationNode = configuration.getConfig(ApplicationNode.class);
        configApplicationNode.setConfigValue("/@nodeLabel", "Bank C");

        configuration.getConfig(OtherTitleNode.class).setConfigValue("otherTitleNode/@loadWithParent", false);
        configuration.getConfig(AgeOfDependantsNode.class).setConfigValue("ageOfDependantsNode/@loadWithParent", false);
        configuration.getConfig(NextOfKinNode.class).setConfigValue("nextOfKinNode/@loadWithParent", false);
    }
}
