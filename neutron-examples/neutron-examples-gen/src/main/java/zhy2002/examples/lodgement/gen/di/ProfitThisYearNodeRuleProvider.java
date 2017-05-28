package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ProfitThisYearNode;
import zhy2002.examples.lodgement.gen.di.*;

@ProfitThisYearNodeScope
public class ProfitThisYearNodeRuleProvider implements RuleProvider<ProfitThisYearNode> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProfitThisYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProfitThisYearNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
