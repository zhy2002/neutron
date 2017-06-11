package zhy2002.examples.lodgement.gen;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;
import java.math.BigDecimal;


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

        NodeConfiguration configAddressLineNode = configuration.getConfig(AddressLineNode.class);
            configAddressLineNode.setConfigValue(".*/@required", true);
        NodeConfiguration configRelatedPersonReferenceNode = configuration.getConfig(RelatedPersonReferenceNode.class);
            configRelatedPersonReferenceNode.setConfigValue(".*/@removeEmpty", true);
        NodeConfiguration configAccountHolderReferenceNode = configuration.getConfig(AccountHolderReferenceNode.class);
            configAccountHolderReferenceNode.setConfigValue(".*/@removeEmpty", true);
        NodeConfiguration configApplicantReferenceNode = configuration.getConfig(ApplicantReferenceNode.class);
            configApplicantReferenceNode.setConfigValue(".*/@removeEmpty", true);
        NodeConfiguration configAddressRefNode = configuration.getConfig(AddressRefNode.class);
            configAddressRefNode.setConfigValue(".*/@removeEmpty", true);
        NodeConfiguration configPersonNode = configuration.getConfig(PersonNode.class);
            configPersonNode.setConfigValue(".*/@selectedName", "personGeneralNode");
        NodeConfiguration configRelatedPartyListNode = configuration.getConfig(RelatedPartyListNode.class);
            configRelatedPartyListNode.setConfigValue(".*/@nodeLabel", "Related Party");
    }
}
