package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.PersonGeneralNode;
import zhy2002.examples.lodgement.gen.di.*;

@PersonGeneralNodeScope
public class PersonGeneralNodeRuleProvider implements RuleProvider<PersonGeneralNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PersonGeneralNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonGeneralNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
