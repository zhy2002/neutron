package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@PersonContactNodeScope
public class PersonContactNodeRuleProvider implements RuleProvider<PersonContactNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonContactNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonContactNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<HomeOrWorkPhoneRequiredRule> homeOrWorkPhoneRequiredRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(homeOrWorkPhoneRequiredRuleProvider.get());
    }

}
