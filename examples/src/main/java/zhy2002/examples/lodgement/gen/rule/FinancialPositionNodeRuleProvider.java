package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@FinancialPositionNodeScope
public class FinancialPositionNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public FinancialPositionNodeRuleProvider() {}

    @Inject
    Provider<FinancialPositionChangedRule> financialPositionChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(financialPositionChangedRuleProvider.get());
    }

}
