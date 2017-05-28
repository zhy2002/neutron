package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.LastNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@LastNameNodeScope
public class LastNameNodeRuleProvider implements RuleProvider<LastNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public LastNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(LastNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
