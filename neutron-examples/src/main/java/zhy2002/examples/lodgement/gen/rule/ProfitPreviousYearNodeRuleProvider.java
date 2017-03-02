package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProfitPreviousYearNode;


@ProfitPreviousYearNodeScope
public class ProfitPreviousYearNodeRuleProvider
    extends BigDecimalUiNodeRuleProvider<ProfitPreviousYearNode> {

    @Inject
    public ProfitPreviousYearNodeRuleProvider() {}

    @Override
    public void initializeState(ProfitPreviousYearNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
