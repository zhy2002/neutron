package zhy2002.examples.app.gen;

import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.config.ContextConfiguration;
import zhy2002.neutron.config.ContextConfigurer;
import javax.inject.Inject;
import java.util.*;


public class LodgementNodeContextConfigurer implements ContextConfigurer<LodgementNodeContext> {

    @Inject
    protected LodgementNodeContextConfigurer() {}

    @Override
    public void configure(LodgementNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        Set<String> names;
        names = new HashSet<>();
        names.add("applicationListNode");
        configuration.getConfig(AppManagerNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("appManagerNode");
        configuration.getConfig(LodgementNode.class).setConfigValue("AutoLoadedChildNames", names);

    }
}
