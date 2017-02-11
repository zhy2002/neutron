package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class AgeNodeRuleProvider implements RuleProvider<AgeNode> {

    @Inject
    public AgeNodeRuleProvider() {}

    @Inject
    MembersInjector<UpdatePlanRule> updatePlanRuleInjector;

    @Override
    public List<UiNodeRule<AgeNode>> createRules(AgeNode node) {
        List<UiNodeRule<AgeNode>> rules = new ArrayList<>();
        rules.add(createUpdatePlanRule(node));
        return rules;
    }

    private UpdatePlanRule createUpdatePlanRule(AgeNode node) {
        UpdatePlanRule rule = newUpdatePlanRule(node);
        updatePlanRuleInjector.injectMembers(rule);
        return rule;
    }


    protected UpdatePlanRule newUpdatePlanRule(AgeNode node) {
        return new UpdatePlanRuleImpl(node);
    }
}
