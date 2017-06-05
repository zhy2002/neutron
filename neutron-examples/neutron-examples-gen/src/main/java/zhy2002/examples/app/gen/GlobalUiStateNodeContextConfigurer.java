package zhy2002.examples.app.gen;

import zhy2002.examples.app.gen.node.*;
import zhy2002.examples.app.data.*;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;
import java.math.BigDecimal;


public class GlobalUiStateNodeContextConfigurer implements ContextConfigurer<GlobalUiStateNodeContext> {

    @Inject
    protected GlobalUiStateNodeContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.DOMAIN_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(GlobalUiStateNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

    }
}
