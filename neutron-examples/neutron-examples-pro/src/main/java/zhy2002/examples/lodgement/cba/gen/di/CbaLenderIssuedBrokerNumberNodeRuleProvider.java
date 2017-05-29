package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LenderIssuedBrokerNumberNodeScope
public class CbaLenderIssuedBrokerNumberNodeRuleProvider extends LenderIssuedBrokerNumberNodeRuleProvider {

    @Inject
    public CbaLenderIssuedBrokerNumberNodeRuleProvider() {
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
