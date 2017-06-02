package zhy2002.examples.register.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.OwnInvestmentPropertyNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;

@ComponentScope
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

        LoadInvestmentPropertyRule loadInvestmentPropertyRule = loadInvestmentPropertyRuleProvider.get();
        createdRules.add(loadInvestmentPropertyRule);
    }

}
