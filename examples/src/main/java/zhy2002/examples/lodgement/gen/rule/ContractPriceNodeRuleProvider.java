package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ContractPriceNode;


@ContractPriceNodeScope
public class ContractPriceNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ContractPriceNode> {

    @Inject
    public ContractPriceNodeRuleProvider() {}

    @Override
    public void initializeState(ContractPriceNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
