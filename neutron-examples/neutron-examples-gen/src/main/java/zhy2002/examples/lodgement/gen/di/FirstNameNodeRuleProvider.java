package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.FirstNameNode;
import zhy2002.examples.lodgement.gen.di.*;

@FirstNameNodeScope
public class FirstNameNodeRuleProvider implements RuleProvider<FirstNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FirstNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(FirstNameNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
