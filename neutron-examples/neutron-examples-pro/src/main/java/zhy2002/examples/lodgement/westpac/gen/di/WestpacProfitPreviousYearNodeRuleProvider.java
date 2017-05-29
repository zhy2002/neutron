package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ProfitPreviousYearNodeScope
public class WestpacProfitPreviousYearNodeRuleProvider extends ProfitPreviousYearNodeRuleProvider {

    @Inject
    public WestpacProfitPreviousYearNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProfitPreviousYearNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
