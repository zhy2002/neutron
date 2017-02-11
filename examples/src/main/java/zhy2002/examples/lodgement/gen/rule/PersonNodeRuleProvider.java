package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class PersonNodeRuleProvider implements RuleProvider<PersonNode> {

    @Inject
    public PersonNodeRuleProvider() {}

    @Inject
    MembersInjector<UpdatePersonNodeLabelRule> updatePersonNodeLabelRuleInjector;

    @Override
    public List<UiNodeRule<PersonNode>> createRules(PersonNode node) {
        List<UiNodeRule<PersonNode>> rules = new ArrayList<>();
        rules.add(createUpdatePersonNodeLabelRule(node));
        return rules;
    }

    private UpdatePersonNodeLabelRule createUpdatePersonNodeLabelRule(PersonNode node) {
        UpdatePersonNodeLabelRule rule = newUpdatePersonNodeLabelRule(node);
        updatePersonNodeLabelRuleInjector.injectMembers(rule);
        return rule;
    }


    protected UpdatePersonNodeLabelRule newUpdatePersonNodeLabelRule(PersonNode node) {
        return new UpdatePersonNodeLabelRuleImpl(node);
    }
}
