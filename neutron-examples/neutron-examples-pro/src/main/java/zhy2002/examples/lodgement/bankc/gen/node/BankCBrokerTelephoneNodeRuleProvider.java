package zhy2002.examples.lodgement.bankc.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ComponentScope
public class BankCBrokerTelephoneNodeRuleProvider extends BrokerTelephoneNodeRuleProvider {

    @Inject
    public BankCBrokerTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerTelephoneNode node) {
        super.initializeState(node);

        node.setCountryCodeReadonly(Boolean.TRUE);
        node.setValue(ApplicationNodeConstants.AUS_DEFAULT);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
