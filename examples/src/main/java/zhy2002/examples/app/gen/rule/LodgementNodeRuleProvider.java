package zhy2002.examples.app.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.app.gen.*;
import zhy2002.examples.app.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class LodgementNodeRuleProvider implements RuleProvider<LodgementNode> {

    @Inject
    public LodgementNodeRuleProvider() {}

    @Inject
    MembersInjector<DummyRule> dummyRuleInjector;

    @Override
    public List<UiNodeRule<LodgementNode>> createRules(LodgementNode node) {
        List<UiNodeRule<LodgementNode>> rules = new ArrayList<>();
        rules.add(createDummyRule(node));
        return rules;
    }

    private DummyRule createDummyRule(LodgementNode node) {
        DummyRule rule = newDummyRule(node);
        dummyRuleInjector.injectMembers(rule);
        return rule;
    }


    protected DummyRule newDummyRule(LodgementNode node) {
        return new DummyRuleImpl(node);
    }
}
