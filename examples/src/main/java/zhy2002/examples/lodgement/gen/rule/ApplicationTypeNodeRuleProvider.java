package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class ApplicationTypeNodeRuleProvider implements RuleProvider<ApplicationTypeNode> {

    @Inject
    public ApplicationTypeNodeRuleProvider() {}

    @Inject
    MembersInjector<ChangeApplicationTypeRule> changeApplicationTypeRuleInjector;

    @Override
    public List<UiNodeRule<ApplicationTypeNode>> createRules(ApplicationTypeNode node) {
        List<UiNodeRule<ApplicationTypeNode>> rules = new ArrayList<>();
        rules.add(createChangeApplicationTypeRule(node));
        return rules;
    }

    private ChangeApplicationTypeRule createChangeApplicationTypeRule(ApplicationTypeNode node) {
        ChangeApplicationTypeRule rule = newChangeApplicationTypeRule(node);
        changeApplicationTypeRuleInjector.injectMembers(rule);
        return rule;
    }


    protected ChangeApplicationTypeRule newChangeApplicationTypeRule(ApplicationTypeNode node) {
        return new ChangeApplicationTypeRuleImpl(node);
    }
}
