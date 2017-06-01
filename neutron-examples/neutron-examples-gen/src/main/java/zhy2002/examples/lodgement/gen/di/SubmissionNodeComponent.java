package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SubmissionNodeModule.class})
public interface SubmissionNodeComponent {

    BrokerFirstNameNode createBrokerFirstNameNode();
    BrokerLastNameNode createBrokerLastNameNode();
    BrokerCompanyNode createBrokerCompanyNode();
    BrokerTelephoneNode createBrokerTelephoneNode();
    BrokerMobileNumberNode createBrokerMobileNumberNode();
    BrokerEmailNode createBrokerEmailNode();
    BrokerAddressNode createBrokerAddressNode();
    LenderIssuedBrokerNumberNode createLenderIssuedBrokerNumberNode();

    RuleProvider<SubmissionNode> getSubmissionNodeRuleProvider();
    Map<String, RuleProvider<SubmissionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSubmissionNodeModule(SubmissionNodeModule module);

        SubmissionNodeComponent build();
    }

}
