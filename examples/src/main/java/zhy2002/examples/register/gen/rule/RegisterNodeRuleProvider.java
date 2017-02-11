package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class RegisterNodeRuleProvider implements RuleProvider<RegisterNode> {

    @Inject
    public RegisterNodeRuleProvider() {}

    @Inject
    MembersInjector<SetHasErrorRule> setHasErrorRuleInjector;
    @Inject
    MembersInjector<CreateErrorNodeRule> createErrorNodeRuleInjector;

    @Override
    public List<UiNodeRule<RegisterNode>> createRules(RegisterNode node) {
        List<UiNodeRule<RegisterNode>> rules = new ArrayList<>();
        rules.add(createSetHasErrorRule(node));
        rules.add(createCreateErrorNodeRule(node));
        return rules;
    }

    private SetHasErrorRule createSetHasErrorRule(RegisterNode node) {
        SetHasErrorRule rule = newSetHasErrorRule(node);
        setHasErrorRuleInjector.injectMembers(rule);
        return rule;
    }

    private CreateErrorNodeRule createCreateErrorNodeRule(RegisterNode node) {
        CreateErrorNodeRule rule = newCreateErrorNodeRule(node);
        createErrorNodeRuleInjector.injectMembers(rule);
        return rule;
    }


    protected SetHasErrorRule newSetHasErrorRule(RegisterNode node) {
        return new SetHasErrorRuleImpl(node);
    }
    protected CreateErrorNodeRule newCreateErrorNodeRule(RegisterNode node) {
        return new CreateErrorNodeRuleImpl(node);
    }
}
