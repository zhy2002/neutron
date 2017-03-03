package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProfitThisYearNode;


@ProfitThisYearNodeScope
public class ProfitThisYearNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ProfitThisYearNode> {

    @Inject
    public ProfitThisYearNodeRuleProvider() {}

    @Override
    public void initializeState(ProfitThisYearNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}