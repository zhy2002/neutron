package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonContactNode;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
