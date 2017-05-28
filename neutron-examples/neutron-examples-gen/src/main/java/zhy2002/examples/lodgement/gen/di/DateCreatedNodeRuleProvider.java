package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.DateCreatedNode;
import zhy2002.examples.lodgement.gen.di.*;

@DateCreatedNodeScope
public class DateCreatedNodeRuleProvider implements RuleProvider<DateCreatedNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DateCreatedNodeRuleProvider() {
    }

    @Override
    public void initializeState(DateCreatedNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
