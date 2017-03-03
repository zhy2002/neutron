package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EstimatedMarketValueNode;


@EstimatedMarketValueNodeScope
public class EstimatedMarketValueNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<EstimatedMarketValueNode> {

    @Inject
    public EstimatedMarketValueNodeRuleProvider() {}

    @Override
    public void initializeState(EstimatedMarketValueNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
