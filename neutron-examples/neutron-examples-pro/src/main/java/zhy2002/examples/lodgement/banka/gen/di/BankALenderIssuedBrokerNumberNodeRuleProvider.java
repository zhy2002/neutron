package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LenderIssuedBrokerNumberNodeScope
public class BankALenderIssuedBrokerNumberNodeRuleProvider extends LenderIssuedBrokerNumberNodeRuleProvider {

    @Inject
    public BankALenderIssuedBrokerNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(LenderIssuedBrokerNumberNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setPattern("\\d+");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
