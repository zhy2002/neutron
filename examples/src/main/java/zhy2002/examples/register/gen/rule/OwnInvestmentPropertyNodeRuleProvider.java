package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class OwnInvestmentPropertyNodeRuleProvider implements RuleProvider<OwnInvestmentPropertyNode> {

    @Inject
    public OwnInvestmentPropertyNodeRuleProvider() {}

    @Inject
    MembersInjector<LoadInvestmentPropertyRule> loadInvestmentPropertyRuleInjector;

    @Override
    public List<UiNodeRule<OwnInvestmentPropertyNode>> createRules(OwnInvestmentPropertyNode node) {
        List<UiNodeRule<OwnInvestmentPropertyNode>> rules = new ArrayList<>();
        rules.add(createLoadInvestmentPropertyRule(node));
        return rules;
    }

    private LoadInvestmentPropertyRule createLoadInvestmentPropertyRule(OwnInvestmentPropertyNode node) {
        LoadInvestmentPropertyRule rule = newLoadInvestmentPropertyRule(node);
        loadInvestmentPropertyRuleInjector.injectMembers(rule);
        return rule;
    }


    protected LoadInvestmentPropertyRule newLoadInvestmentPropertyRule(OwnInvestmentPropertyNode node) {
        return new LoadInvestmentPropertyRuleImpl(node);
    }
}
