package zhy2002.examples.app.gen;

import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;


public class LodgementNodeContextConfigurer implements ContextConfigurer<LodgementNodeContext> {

    @Inject
    protected LodgementNodeContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.DOMAIN_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(LodgementNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

    }
}
