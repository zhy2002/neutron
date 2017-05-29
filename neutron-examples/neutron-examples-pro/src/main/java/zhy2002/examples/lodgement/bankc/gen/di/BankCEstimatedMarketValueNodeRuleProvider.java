package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@EstimatedMarketValueNodeScope
public class BankCEstimatedMarketValueNodeRuleProvider extends EstimatedMarketValueNodeRuleProvider {

    @Inject
    public BankCEstimatedMarketValueNodeRuleProvider() {
    }

    @Override
    public void initializeState(EstimatedMarketValueNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
