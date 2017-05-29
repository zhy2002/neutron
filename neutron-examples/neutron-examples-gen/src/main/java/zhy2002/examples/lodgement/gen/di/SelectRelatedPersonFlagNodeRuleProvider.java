package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@SelectRelatedPersonFlagNodeScope
public class SelectRelatedPersonFlagNodeRuleProvider implements RuleProvider<SelectRelatedPersonFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectRelatedPersonFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectRelatedPersonFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}