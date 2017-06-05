package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;


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

    }
}
