package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.node.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;
import java.math.BigDecimal;


public class RegisterNodeContextConfigurer implements ContextConfigurer<RegisterNodeContext> {

    @Inject
    protected RegisterNodeContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.DOMAIN_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(RegisterNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        NodeConfiguration configPropertyDetailsNode = configuration.getConfig(PropertyDetailsNode.class);
            configPropertyDetailsNode.setConfigValue("investmentPropertyNode/@loadWithParent", false);
    }
}
