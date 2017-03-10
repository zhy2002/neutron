package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;

@OwnInvestmentPropertyNodeScope
public class OwnInvestmentPropertyNodeRuleProvider implements RuleProvider<OwnInvestmentPropertyNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OwnInvestmentPropertyNodeRuleProvider() {
    }

    @Override
    public void initializeState(OwnInvestmentPropertyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<LoadInvestmentPropertyRule> loadInvestmentPropertyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(loadInvestmentPropertyRuleProvider.get());
    }

}
