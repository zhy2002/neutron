package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@BrokerTelephoneNodeScope
public class BankABrokerTelephoneNodeRuleProvider extends BrokerTelephoneNodeRuleProvider {

    @Inject
    public BankABrokerTelephoneNodeRuleProvider() {
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