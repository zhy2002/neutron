package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.westpac.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@FinancialPositionNodeScope
public class WestpacFinancialPositionNodeRuleProvider extends FinancialPositionNodeRuleProvider {

    @Inject
    public WestpacFinancialPositionNodeRuleProvider() {
    }

    @Override
    public void initializeState(FinancialPositionNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<FinancialPositionChangedRule> financialPositionChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        FinancialPositionChangedRule financialPositionChangedRule = financialPositionChangedRuleProvider.get();
        createdRules.add(financialPositionChangedRule);
    }

}
