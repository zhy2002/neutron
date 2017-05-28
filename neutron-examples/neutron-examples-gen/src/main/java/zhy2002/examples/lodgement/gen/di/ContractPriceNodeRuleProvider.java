package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ContractPriceNode;
import zhy2002.examples.lodgement.gen.di.*;

@ContractPriceNodeScope
public class ContractPriceNodeRuleProvider implements RuleProvider<ContractPriceNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ContractPriceNodeRuleProvider() {
    }

    @Override
    public void initializeState(ContractPriceNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
