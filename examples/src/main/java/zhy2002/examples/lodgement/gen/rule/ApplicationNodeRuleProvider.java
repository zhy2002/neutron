package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class ApplicationNodeRuleProvider implements RuleProvider<ApplicationNode> {

    @Inject
    public ApplicationNodeRuleProvider() {}

    @Inject
    MembersInjector<CreateErrorNodeRule> createErrorNodeRuleInjector;
    @Inject
    MembersInjector<ShowErrorListRule> showErrorListRuleInjector;

    @Override
    public List<UiNodeRule<ApplicationNode>> createRules(ApplicationNode node) {
        List<UiNodeRule<ApplicationNode>> rules = new ArrayList<>();
        rules.add(createCreateErrorNodeRule(node));
        rules.add(createShowErrorListRule(node));
        return rules;
    }

    private CreateErrorNodeRule createCreateErrorNodeRule(ApplicationNode node) {
        CreateErrorNodeRule rule = newCreateErrorNodeRule(node);
        createErrorNodeRuleInjector.injectMembers(rule);
        return rule;
    }

    private ShowErrorListRule createShowErrorListRule(ApplicationNode node) {
        ShowErrorListRule rule = newShowErrorListRule(node);
        showErrorListRuleInjector.injectMembers(rule);
        return rule;
    }


    protected CreateErrorNodeRule newCreateErrorNodeRule(ApplicationNode node) {
        return new CreateErrorNodeRuleImpl(node);
    }
    protected ShowErrorListRule newShowErrorListRule(ApplicationNode node) {
        return new ShowErrorListRuleImpl(node);
    }
}
