package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.config.ContextConfiguration;
import zhy2002.neutron.config.ContextConfigurer;
import javax.inject.Inject;
import java.util.*;


public class RegisterNodeContextConfigurer implements ContextConfigurer<RegisterNodeContext> {

    @Inject
    protected RegisterNodeContextConfigurer() {}

    @Override
    public void configure(RegisterNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        Set<String> names;
        names = new HashSet<>();
        names.add("propertyAddressNode");
        names.add("propertyStateNode");
        configuration.getConfig(PropertyDetailsNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("countryCodeNode");
        names.add("areaCodeNode");
        names.add("phoneNumberNode");
        configuration.getConfig(PhoneInfoNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("usernameNode");
        names.add("emailNode");
        names.add("passwordNode");
        names.add("repeatPasswordNode");
        names.add("ageNode");
        names.add("planNode");
        names.add("receiveOffersNode");
        names.add("ownInvestmentPropertyNode");
        names.add("residentialPropertyNode");
        names.add("investmentPropertyNode");
        names.add("homePhoneNode");
        names.add("errorListNode");
        configuration.getConfig(RegisterNode.class).setConfigValue("AutoLoadedChildNames", names);

    }
}
