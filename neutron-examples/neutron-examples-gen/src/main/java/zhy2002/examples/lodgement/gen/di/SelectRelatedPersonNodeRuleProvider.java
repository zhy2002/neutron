package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.SelectRelatedPersonNode;
import zhy2002.examples.lodgement.gen.di.*;

@SelectRelatedPersonNodeScope
public class SelectRelatedPersonNodeRuleProvider implements RuleProvider<SelectRelatedPersonNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectRelatedPersonNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectRelatedPersonNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}