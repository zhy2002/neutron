package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class TitleNodeRuleProvider implements RuleProvider<TitleNode> {

    @Inject
    public TitleNodeRuleProvider() {}

    @Inject
    MembersInjector<TitleGenderMatchRule> titleGenderMatchRuleInjector;

    @Override
    public List<UiNodeRule<TitleNode>> createRules(TitleNode node) {
        List<UiNodeRule<TitleNode>> rules = new ArrayList<>();
        rules.add(createTitleGenderMatchRule(node));
        return rules;
    }

    private TitleGenderMatchRule createTitleGenderMatchRule(TitleNode node) {
        TitleGenderMatchRule rule = newTitleGenderMatchRule(node);
        titleGenderMatchRuleInjector.injectMembers(rule);
        return rule;
    }


    protected TitleGenderMatchRule newTitleGenderMatchRule(TitleNode node) {
        return new TitleGenderMatchRuleImpl(node);
    }
}
